package member.model;

public class MemberWatchBean {

	private int num;
	private String movie_num;
	private String user_id;
	private String watch_date;
	
	private String image;
	
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
	public String getWatch_date() {
		return watch_date;
	}
	public void setWatch_date(String watch_date) {
		this.watch_date = watch_date;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MemberWatchBean(int num, String movie_num, String user_id, String watch_date, String image) {
		super();
		this.num = num;
		this.movie_num = movie_num;
		this.user_id = user_id;
		this.watch_date = watch_date;
		this.image = image;
	}
	public MemberWatchBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
