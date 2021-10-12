package voucher.model;

import java.sql.Date;
import java.time.LocalDate;

public class couponBean {

	private int cp_num;
	private String cp_id;
	private String cp_name;
	private String cp_number;
	private float cp_discount;
	private String regdate;
	private String duedate;
	private String usedate;
	private String cp_check;
	
	private String nowdate;

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

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getUsedate() {
		return usedate;
	}

	public void setUsedate(String usedate) {
		this.usedate = usedate;
	}

	public String getCp_check() {
		return cp_check;
	}

	public void setCp_check(String cp_check) {
		this.cp_check = cp_check;
	}

	public String getNowdate() {
		return nowdate;
	}

	public void setNowdate(String nowdate) {
		this.nowdate = nowdate;
	}

	public couponBean(int cp_num, String cp_id, String cp_name, String cp_number, float cp_discount, String regdate,
			String duedate, String usedate, String cp_check, String nowdate) {
		super();
		this.cp_num = cp_num;
		this.cp_id = cp_id;
		this.cp_name = cp_name;
		this.cp_number = cp_number;
		this.cp_discount = cp_discount;
		this.regdate = regdate;
		this.duedate = duedate;
		this.usedate = usedate;
		this.cp_check = cp_check;
		this.nowdate = nowdate;
	}

	public couponBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
