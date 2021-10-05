package board.model;

public class ReplyBean {

	private int rnum;
	private int bnum;
	private String writer;
	private String content;
	private String reg_date;
	private int startRow;
	private int endRow;
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
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
	public ReplyBean(int rnum, int bnum, String writer, String content, String reg_date, int startRow, int endRow) {
		super();
		this.rnum = rnum;
		this.bnum = bnum;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
		this.startRow = startRow;
		this.endRow = endRow;
	}
	public ReplyBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
