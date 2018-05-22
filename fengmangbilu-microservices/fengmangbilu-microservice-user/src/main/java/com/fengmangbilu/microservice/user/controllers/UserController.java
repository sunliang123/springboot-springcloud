package com.fengmangbilu.microservice.user.controllers;

import java.util.Set;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fengmangbilu.annotation.JsonFilter;
import com.fengmangbilu.microservice.user.clients.OaClient;
import com.fengmangbilu.microservice.user.endpoints.IdCardRequest;
import com.fengmangbilu.microservice.user.endpoints.UserRequest;
import com.fengmangbilu.microservice.user.entities.Role;
import com.fengmangbilu.microservice.user.entities.User;
import com.fengmangbilu.microservice.user.exceptions.UserException;
import com.fengmangbilu.microservice.user.services.QiniuService;
import com.fengmangbilu.microservice.user.services.RoleService;
import com.fengmangbilu.microservice.user.services.UserService;
import com.fengmangbilu.web.Response;
import com.google.common.collect.Sets;
import com.qiniu.common.QiniuException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@Api
@Validated
@RestController
public class UserController {

	@Autowired
	private OaClient oaClient;

	@Autowired
	private UserService userService;

	@Autowired
	private QiniuService qiniuService;

	@Autowired
	private RoleService roleService;

	@PostMapping("register")
	@ApiOperation("注册")
	public Response register(@Valid @RequestBody UserRequest userRequest) {
		userService.register(userRequest);
		return Response.ok();
	}

	@PostMapping("resetPassword")
	@ApiOperation("找回密码")
	public Response resetPassword(@Valid @RequestBody UserRequest userRequest) {
		userService.resetPassword(userRequest);
		return Response.ok();
	}

	@PostMapping("deleteAvatar")
	@ApiOperation("app端上传头像之前(一定要上传之前调用)需要调用此接口删除旧头像")
	public Response deleteAvatar(@AuthenticationPrincipal String userId) throws QiniuException {
		User user = userService.findOne(userId);
		qiniuService.deleteFile("avatar", user.getAvatar());
		return Response.ok();
	}

	@PostMapping("uploadAvatar")
	public Response uploadAvatar(@AuthenticationPrincipal String userId, @RequestParam(required = false) MultipartFile file)
			throws QiniuException {
		String fileName = UUID.randomUUID().toString().replaceAll("\\-", "");
		User user = userService.findOne(userId);
		String avatar = qiniuService.uploadFile("avatar", file, user.getAvatar(), fileName);
		userService.setAvatarFor(userId, avatar);
		return Response.ok(avatar);
	}

	@PostMapping("updateAvatar")
	@ApiOperation("app端更新头像接口，avatar是头像地址")
	public Response updateAvatar(@AuthenticationPrincipal String userId, @RequestParam String avatar) {
		userService.setAvatarFor(userId, avatar);
		return Response.ok(avatar);
	}

	@GetMapping("getUpToken")
	@ApiOperation("如果是用于上传头像传avatar，如果是用于上传身份证正反面头像传idcard")
	public Response getUpToken(@RequestParam String bucket) {
		String upToken = qiniuService.getUpToken(bucket);
		return Response.ok(null, upToken);
	}

	@PostMapping("certifiedIdCard")
	@ApiOperation("实名认证")
	public Response certifiedIdCard(@RequestHeader("Authorization") String token, @AuthenticationPrincipal String userId,
			@Valid @RequestBody IdCardRequest request) throws Exception {
		User user = userService.findOne(userId);
		if (user.getIsCertified()) {
			throw UserException.ERR_ID_DUPLICATION;
		}
		request.setMobile(user.getMobile());
		Response response = oaClient.getIdCard(token, request);
		if (response.getCode() != 200) {
			return response;
		}
		if (response.getData() == null) {
			throw UserException.ERR_ID_INCORRECT;
		}
		userService.setIsCertifiedFor(userId, request.getName());
		return Response.ok();
	}

	@ApiIgnore
	@GetMapping("findByMobile")
	public Response findByMobile(@RequestParam(required = false) String mobile) {
		User user = userService.findByMobile(mobile);
		return Response.ok(user);
	}

	@ApiIgnore
	@PostMapping("grantUserHrRole")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Response grantUserHrRole(@RequestParam(required = false) String userId) {
		User user = userService.findOne(userId);
		if (user == null) {
			return Response.error(null);
		}
		Role role = roleService.findOne(1l);
		Set<Role> roles = user.getRoles();
		roles.add(role);
		user.setRoles(roles);
		userService.save(user);
		return Response.ok(user);
	}

	@ApiIgnore
	@PostMapping("grantUserEmpRole")
	@PreAuthorize("hasRole('ROLE_HR')")
	public Response grantUserEmpRole(@RequestParam(required = false) String userId) {
		User user = userService.findOne(userId);
		if (user == null) {
			return Response.error(null);
		}
		Role role = roleService.findOne(2l);
		Set<Role> roles = user.getRoles();
		roles.add(role);
		user.setRoles(roles);
		userService.save(user);
		return Response.ok(user);
	}

	@ApiIgnore
	@PostMapping("resetUserRole")
	@PreAuthorize("hasRole('ROLE_EMP')")
	public Response resetUserRole(@AuthenticationPrincipal String userId) {
		User user = userService.findOne(userId);
		if (user == null) {
			return Response.error(null);
		}
		Set<Role> roles = Sets.newHashSet();
		user.setRoles(roles);
		userService.save(user);
		return Response.ok(user);
	}

	@GetMapping("getUserInfo")
	@ApiOperation("获取用户信息")
	@JsonFilter(target = User.class, filter = {"name", "avatar", "isCertified"}, exclude = false)
	public Response getUserInfo(@AuthenticationPrincipal String userId) {
		User user = userService.findOne(userId);
		return Response.ok(user);
	}

	@GetMapping("getUserPermission")
	public Response getUserPermission(@AuthenticationPrincipal String userId) {
		User user = userService.findOne(userId);
		return Response.ok(user.getAuthorities());
	}

}
