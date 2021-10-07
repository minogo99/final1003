package cs.model;

import org.springframework.stereotype.Repository;

@Repository
public class CsFaqBean {

	private int num;
	private String subject;
	private String division;
	private String content;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CsFaqBean(int num, String subject, String division, String content) {
		super();
		this.num = num;
		this.subject = subject;
		this.division = division;
		this.content = content;
	}
	public CsFaqBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
