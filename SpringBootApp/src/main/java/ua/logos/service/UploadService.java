package ua.logos.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import ua.logos.entity.UploadFile;

public interface UploadService {
	
	void saveFile(MultipartFile file);
	
	UploadFile getFileById(int id);
	
	List<UploadFile> getAllFiles();

	void saveFile(UploadFile file);
}
