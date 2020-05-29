package com.learning.learning.Springboot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("http://localhost:3000")
public class RestServiceUpload {

	@Autowired
	uploadDao dao;

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		File convertFile = new File(
				"C:\\Users\\shivam.gupta\\Desktop\\eclipse-workspace\\files\\" + file.getOriginalFilename());

		filePojo dbfile = new filePojo(0, file.getOriginalFilename(), file.getBytes(), file.getContentType());

		dao.save(dbfile);
		System.out.println(convertFile);
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		System.out.println(fout.getClass());
		fout.write(file.getBytes());
		System.out.println(file.getBytes().toString());
		fout.close();
		return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
	}

	@GetMapping(path = { "/get/{id}" })
	public filePojo getImage(@PathVariable("id") int id) throws IOException {

		final Optional<filePojo> retrievedImage = dao.findById(id);

		//filePojo img = new filePojo(retrievedImage.get().getId(),retrievedImage.get().getName(),retrievedImage.get().getBytes(),retrievedImage.get().getContentType());
		
		return retrievedImage.get();
	}
}
