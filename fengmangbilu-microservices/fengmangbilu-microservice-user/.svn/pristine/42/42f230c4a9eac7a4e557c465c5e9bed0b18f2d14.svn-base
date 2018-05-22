package com.fengmangbilu.microservice.user.services;

import org.springframework.web.multipart.MultipartFile;

import com.qiniu.common.QiniuException;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.StringMap;

public interface QiniuService {

	public BucketManager getBucketManager();

	public UploadManager getUploadManager();

	public String getUpToken(String bucket);

	public String getUpToken(String bucket,String key, StringMap map);

	public void deleteFile(String bucket,String key) throws QiniuException;

	public FileInfo getFileInfo(String bucket,String head) throws QiniuException;
	
	public String uploadFile(String bucket,MultipartFile file, String sourceFile, String fileName) throws QiniuException;

	public String uploadFile(String bucket,MultipartFile file, String sourceFile, String fileName, long fileSizeMax) throws QiniuException;

	public String uploadFile(String bucket,MultipartFile file, String sourceFile, String fileName, long fileSizeMax, String... supportFileType)
			throws QiniuException;

}
