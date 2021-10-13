package member.model;

public class MemberJjimBean {

	private int num;
	private String movie_num;
	private String user_id;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public MemberJjimBean(int num, String movie_num, String user_id) {
		super();
		this.num = num;
		this.movie_num = movie_num;
		this.user_id = user_id;
	}
	public MemberJjimBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
