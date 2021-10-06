package member.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberBean {
	private int num;
	@Length(min=3,max=7, message="3~7ÀÚ Á¤µµ¸¸ ÀÔ·ÂÇÒ ¼ö ÀÖ½À´Ï´Ù.")
	private String id;
	@NotEmpty(message="ÇÊ¼ö ÀÔ·Â»çÇ×ÀÔ´Ï´Ù.")
	private String password;
	@NotEmpty(message="ÇÊ¼ö ÀÔ·Â»çÇ×ÀÔ´Ï´Ù.")
	private String name;
	
	private String regdate;
<<<<<<< HEAD
	private String phone;
=======
	private String tel1;
	private String tel2;
	private String tel3;
>>>>>>> parent of 5963d65 (íšŒì›ì •ë³´ ìˆ˜ì •)
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
