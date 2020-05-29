package com.learning.learning.Springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="FileDetails")
public class filePojo {

	@Id
	@GeneratedValue
	private int id;

	private String Name;
	@Lob
	private byte[] bytes;
	private String ContentType;

	public filePojo() {
	}

	public filePojo(int id, String name, byte[] bytes, String contentType) {
		super();
		this.id = id;
		Name = name;
		this.bytes = bytes;
		ContentType = contentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getContentType() {
		return ContentType;
	}

	public void setContentType(String contentType) {
		ContentType = contentType;
	}

}
