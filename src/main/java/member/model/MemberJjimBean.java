package member.model;

public class MemberJjimBean {

	private int num;
	private String movie_title;
	private String user_id;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public MemberJjimBean(int num, String movie_title, String user_id) {
		super();
		this.num = num;
		this.movie_title = movie_title;
		this.user_id = user_id;
	}
	public MemberJjimBean() {
		super();
	}
	
	
	
	
}
