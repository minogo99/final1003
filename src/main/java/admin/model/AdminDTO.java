package admin.model;

import java.util.Date;

public class AdminDTO {
    
    
    private String admin_id;    //아이디
    private String admin_pass;    //비밀번호
    private String admin_name;    
    private Date reg_date;    //등록일자
    
    
    public String getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }
    public String getAdmin_pass() {
        return admin_pass;
    }
    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }
    public String getAdmin_name() {
        return admin_name;
    }
    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }
    public Date getReg_date() {
        return reg_date;
    }
    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }
        
    @Override
    public String toString() {
        return "AdminDTO [admin_id=" + admin_id + ", admin_pass=" + admin_pass + ", admin_name=" + admin_name + ", reg_date="
                + reg_date + "]";
    }
    
 
}