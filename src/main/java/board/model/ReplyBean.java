package board.model;

public class ReplyBean {

	private int rno;
	private int bno;
	private String writer;
	private String content;
	private String reg_date;
	private int startRow;
	private int endRow;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public ReplyBean(int rno, int bno, String writer, String content, String reg_date) {
		super();
		this.rno = rno;
		this.bno = bno;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
	}
	public ReplyBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
