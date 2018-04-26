package ua.logos.controller;

import java.io.File;
import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.logos.entity.UploadFile;
import ua.logos.service.UploadService;
import ua.logos.service.utils.CustomFileUtils;

@Controller
public class UploadController {

	@Autowired private UploadService uploadService;
	
	@GetMapping("/upload-form")
	public String showUploadForm() {
		return "upload-form";
	}
	
	@PostMapping("/upload-file")
	public String saveFile(@RequestParam("uploadFile") MultipartFile file) throws IOException {
		if(!file.isEmpty() && file!=null) {
			// SAVE TO DB
//			UploadFile upload = new UploadFile();
//			upload.setFileName(file.getOriginalFilename());
//			upload.setFileData(file.getBytes());
//			uploadService.saveFile(file);
			
			CustomFileUtils.createImage("images", file);
		}
		return "redirect:/";
	}
	
	@GetMapping("/preview-fromdb")
	public String imageFromDb(Model model) {
		UploadFile file = uploadService.getFileById(1);
		String encodeFile = new String(Base64.encodeBase64(file.getFileData()));
		model.addAttribute("imageSrc", encodeFile);
		
		return "upload-preview";
	}
	

}
