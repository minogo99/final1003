package main.model;

import org.springframework.web.multipart.MultipartFile;

public class MainBean {

	private int num;
	private String category;
	private String grade;
	private String image;
	private MultipartFile upload;
	private String upload_old;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
		System.out.println("upload.getName():"+upload.getName()); 
		System.out.println("upload.getOriginalFilename():"+upload.getOriginalFilename()); 
		
		this.image = upload.getOriginalFilename();
		System.out.println(image == null);
		System.out.println(image.equals(""));
	}
	public String getUpload_old() {
		return upload_old;
	}
	public void setUpload_old(String upload_old) {
		this.upload_old = upload_old;
	}
}
