package member.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberBean {
	private int num;
	@Length(min=3,max=7, message="3~7�� ������ �Է��� �� �ֽ��ϴ�.")
	private String id;
	@NotEmpty(message="�ʼ� �Է»����Դϴ�.")
	private String password;
	@NotEmpty(message="�ʼ� �Է»����Դϴ�.")
	private String name;
	
	private String regdate;
<<<<<<< Updated upstream
	private String phone;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
=======
	@NotBlank(message="�ʼ� �Է»����Դϴ�.")
	private int tel1;
	@NotBlank(message="�ʼ� �Է»����Դϴ�.")
	private int tel2;
	@NotBlank(message="�ʼ� �Է»����Դϴ�.")
	private int tel3;
	
	
	public int getTel1() {
		return tel1;
	}
	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}
	public int getTel2() {
		return tel2;
	}
	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}
	public int getTel3() {
		return tel3;
	}
	public void setTel3(int tel3) {
		this.tel3 = tel3;
>>>>>>> Stashed changes
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
