package category.model;

import org.springframework.web.multipart.MultipartFile;

public class CategoryBean {
	
	private int num;
	private String title;
	private String nation;
	private String category;
	private String genre;
	private String grade;
	private String actor;
	private String image;
	private MultipartFile upload;
	private String upload_old;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
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
	public CategoryBean(int num, String title, String nation, String category, String genre, String grade, String actor,
			String image, MultipartFile upload, String upload_old) {
		super();
		this.num = num;
		this.title = title;
		this.nation = nation;
		this.category = category;
		this.genre = genre;
		this.grade = grade;
		this.actor = actor;
		this.image = image;
		this.upload = upload;
		this.upload_old = upload_old;
	}
	public CategoryBean() {
		super();
	} 
}
