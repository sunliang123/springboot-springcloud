package com.fengmangbilu.microservice.support.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fengmangbilu.microservice.support.entites.Feedback;
import com.fengmangbilu.microservice.support.services.FeedbackService;
import com.fengmangbilu.web.Response;
import com.qiniu.util.Auth;

import io.swagger.annotations.Api;

@Api
@Validated
@RestController
@RequestMapping("feedback")
public class FeedbackController {

	@Value("${qiniu.accessKey}")
	private String accessKey;

	@Value("${qiniu.secretKey}")
	private String secretKey;

	@Autowired
	private FeedbackService feedbackService;

	@InitBinder("feedback")
	public void initUserInfoBinder(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id", "createdBy", "lastModifiedBy");
	}

	@GetMapping("getUpToken")
	public Response getUpToken() {
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken("img4");
		return Response.ok(null, upToken);
	}

	@PostMapping("save")
	public Response feedback(@Valid @ModelAttribute Feedback feedback) {
		feedbackService.save(feedback);
		return Response.ok("我们已收到您的反馈，感谢您的关注与支持");
	}
}
