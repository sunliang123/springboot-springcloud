package com.fengmangbilu.microservice.oa.services;

import org.springframework.web.multipart.MultipartFile;

import com.qiniu.common.QiniuException;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.StringMap;

public interface QiniuService {

	public BucketManager getBucketManager();

	public UploadManager getUploadManager();

	public String getUpToken();
	
	public String getUpToken(String bucket);

	public String getUpToken(String key, StringMap map);

	public void deleteFile(String key) throws QiniuException;
	
	public void moveFile(String fileName) throws QiniuException;

	public FileInfo getFileInfo(String head) throws QiniuException;

	public String uploadTempFile(MultipartFile file, String fileName) throws QiniuException;

	public String uploadTempFile(MultipartFile file, String fileName, long fileSizeMax, String... supportFileType)
			throws QiniuException;

	public String uploadFile(MultipartFile file, String sourceFile, String fileName) throws QiniuException;

	public String uploadFile(MultipartFile file, String sourceFile, String fileName, long fileSizeMax) throws QiniuException;

	public String uploadFile(MultipartFile file, String sourceFile, String fileName, long fileSizeMax, String... supportFileType)
			throws QiniuException;
}
