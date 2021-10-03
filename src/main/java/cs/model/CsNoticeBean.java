package cs.model;

public class CsNoticeBean {

	private int num;
	private String writer;
	private String subject;
	private String division;
	private String reg_date;
	private String content;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CsNoticeBean(int num, String writer, String subject, String division, String reg_date, String content) {
		super();
		this.num = num;
		this.writer = writer;
		this.subject = subject;
		this.division = division;
		this.reg_date = reg_date;
		this.content = content;
	}
	public CsNoticeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
