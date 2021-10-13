package member.model;

public class MemberJjimBean {

	private int num;
	private int movie_num;
	private String user_id;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public MemberJjimBean(int num, int movie_num, String user_id) {
		super();
		this.num = num;
		this.movie_num = movie_num;
		this.user_id = user_id;
	}
	public MemberJjimBean() {
		super();
	}
}
