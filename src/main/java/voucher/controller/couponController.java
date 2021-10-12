package voucher.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import voucher.model.couponDao;

@Controller
public class couponController {

	@Autowired
	couponDao couponDao;
	
	private final String command = "/coupon.voucher";
	private final String getPage = "alert";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doActionGet(@RequestParam("cp_number") String cp_number,HttpSession session) throws IOException {
		ModelAndView mav = new ModelAndView();
		
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd");
		String nowdate = sdf.format(System.currentTimeMillis());
		int result = couponDao.useCheck(cp_number,nowdate);
		if(result == 0) {
			mav.addObject("msg", "사용불가능한 쿠폰입니다.");
		}else {
			MemberBean loginInfo = (MemberBean) session.getAttribute("loginInfo");
			couponDao.couponRegister(cp_number,loginInfo.getId());
			mav.addObject("msg", "쿠폰 등록이 완료되었습니다..");
		}
		String alertType = "coupon";
		mav.addObject("alertType", alertType);
		mav.setViewName(getPage);
		return mav;
	}
}
