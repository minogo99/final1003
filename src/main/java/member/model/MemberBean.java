package member.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberBean {
	private int num;
	@Length(min=3,max=7, message="3~7자 정도만 입력할 수 있습니다.")
	private String id;
	@NotEmpty(message="필수 입력사항입니다.")
	private String password;
	@NotEmpty(message="필수 입력사항입니다.")
	private String name;
	private String regdate;
	@NotBlank(message="필수 입력사항입니다.")
	private String tel1;
	@NotBlank(message="필수 입력사항입니다.")
	private String tel2;
	@NotBlank(message="필수 입력사항입니다.")
	private String tel3;
	
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
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
