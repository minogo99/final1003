package voucher.model;

import java.sql.Date;
import java.time.LocalDate;

public class couponBean {

	private int cp_num;
	private String cp_id;
	private String cp_name;
	private String cp_number;
	private float cp_discount;
	private String cp_regdate;
	private Date cp_duedate;
	private String cp_usedate;
	private String cp_check;
	
	public int getCp_num() {
		return cp_num;
	}
	public void setCp_num(int cp_num) {
		this.cp_num = cp_num;
	}
	public String getCp_id() {
		return cp_id;
	}
	public void setCp_id(String cp_id) {
		this.cp_id = cp_id;
	}
	public String getCp_name() {
		return cp_name;
	}
	public void setCp_name(String cp_name) {
		this.cp_name = cp_name;
	}
	public String getCp_number() {
		return cp_number;
	}
	public void setCp_number(String cp_number) {
		this.cp_number = cp_number;
	}
	public float getCp_discount() {
		return cp_discount;
	}
	public void setCp_discount(float cp_discount) {
		this.cp_discount = cp_discount;
	}
	public String getCp_regdate() {
		return cp_regdate;
	}
	public void setCp_regdate(String cp_regdate) {
		this.cp_regdate = cp_regdate;
	}
	public Date getCp_duedate() {
		return cp_duedate;
	}
	public void setCp_duedate(Date cp_duedate) {
		this.cp_duedate = cp_duedate;
	}
	public String getCp_usedate() {
		return cp_usedate;
	}
	public void setCp_usedate(String cp_usedate) {
		this.cp_usedate = cp_usedate;
	}
	public String getCp_check() {
		return cp_check;
	}
	public void setCp_check(String cp_check) {
		this.cp_check = cp_check;
	}
	public couponBean(int cp_num, String cp_id, String cp_name, String cp_number, float cp_discount, String cp_regdate,
			Date cp_duedate, String cp_usedate, String cp_check) {
		super();
		this.cp_num = cp_num;
		this.cp_id = cp_id;
		this.cp_name = cp_name;
		this.cp_number = cp_number;
		this.cp_discount = cp_discount;
		this.cp_regdate = cp_regdate;
		this.cp_duedate = cp_duedate;
		this.cp_usedate = cp_usedate;
		this.cp_check = cp_check;
	}
	public couponBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
