<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../common/common.jsp" %>
usufruct.jsp<br><br>
<style type="text/css">
	.tt{
	border-collapse: separate;
  	border-spacing: 0 10px;
	}
	td{
	border-radius: 5px;
	height: 50px	
	}
</style>
<script type="text/javascript">
	var num=$('input[name="num"]').val;
	function readyPay(event) {
		location.href="readyPaymemt.voucher?num="+event.target.value;
	}
	
</script>

<img src="resources/images/flyersheet.jpg" width="500" height="500" >

<br><br>
<h4>이용권을 선택해주세요.</h4>
<h6>매월 자동결제 / 부가세포함</h6>
<br><br>

wavve 이용권
방송 + LIVE + wavvie영화 + 해외시리즈
<form action="readyPaymemt.voucher?num=${vb.num }" method="post">
<div class="dt">
<table class="tt">
	<tr bgcolor="gray" >
		<td >
			<input type="radio" name="num" value=1 <c:if test="${vb.num eq 1 }"> checked</c:if>
			 onclick="readyPay(event)" >
			Basic 동시시청 1회선,HD화질,모바일+PC 7900원<BR>
		</td>
	</tr>
	<tr bgcolor="gray">
		<td>
			<input type="radio" name="num" value=2 <c:if test="${vb.num eq 2 }"> checked</c:if>
			 onclick="readyPay(event)">
			Standard 동시시청 2회선,FHD화질,전체 디바이스 10900원<BR>
		</td>
	</tr>
	<tr bgcolor="gray">
		<td>
			<input type="radio" name="num" value="3" <c:if test="${vb.num eq 3 }"> checked</c:if>
			onclick="readyPay(event)">
			Premium 동시시청 4회선,최고화질,전체 디바이스 13900원
		</td>
	</tr>
</table>
<br><Br>

제휴 이용권
<table class="tt">
	<tr bgcolor="gray">
		<td>
			<input type="radio" name="num" value="4" <c:if test="${vb.num eq 4 }"> checked</c:if>
			onclick="readyPay(event)">
			Basic X FLO 무제한 동시시청 1회선,HD화질,모바일+PC 13750원<BR>
		</td>
	</tr>
	<tr bgcolor="gray">
		<td>
			<input type="radio" name="num" value="5" <c:if test="${vb.num eq 5 }"> checked</c:if>
			onclick="readyPay(event)">
			Standard X Bugs 듣기 동시시청 1회선,HD화질,모바일+PC 13750원<BR>
		</td>
	</tr>
	<tr bgcolor="gray">
		<td>
			<input type="radio" name="num" value="6" <c:if test="${vb.num eq 6 }"> checked</c:if>
			onclick="readyPay(event)">
			Premium X KB 나라사랑카드 동시시청 1회선,HD화질,모바일+PC 7900원
		</td>
	</tr>
</table>
<div> 
	
		<div id='readyPay'>
			<div id="readyPayName">
				${vb.name }
			</div>
			<div id="readyPayContent">
				${vb.content }
			</div>
			<div id="readyPayPrice">
				${vb.price } 원
			</div>
		</div>
		<input type="submit" value="결제하기">
	
</div>
</div>
</form>
<br><Br>

서비스 이용 주의사항 <br>

ㆍwavve 서비스는 국내 및 해외 일부 해외 서비스 대상 국가에서 이용하실 수 있습니다. <br>

ㆍ국내에서 결제완료된 콘텐츠에 한해 해외 서비스 대상국가 여행 시 모바일 앱(ios/Android)으로 7일간 스트리밍(재생) 서비스를 이용하실 수 있습니다.<br>

ㆍ해외 서비스 대상국가 : 싱가폴, 인도네시아, 말레이시아, 필리핀, 베트남, 라오스, 태국<br>

ㆍ해외 서비스 대상국가가 아닌 지역에서는 서비스 이용이 불가하며, 일부 콘텐츠는 콘텐츠제공사(CP)의 별도 요청, 저작권 문제, 기타 사업권역 문제 등으로 해외 서비스 이용이 제한될 수 있습니다.<br>

ㆍ동시시청은 계정당 허용 가능한 회선만큼 동시에 여러 기기에서 시청하실 수 있는 상품입니다. 1회선인 경우 동시시청을 할 수 없습니다.<br>

ㆍ일부 콘텐츠는 저작권자의 요청에 따라 LIVE 및 VOD 서비스가 제공되지 않을 수 있습니다.<br>

ㆍ일부 콘텐츠는 콘텐츠 제공사의 사정에 따라 FHD화질이 제공되지 않을 수 있습니다.<br>

ㆍ방송VOD 다운로드는 콘텐츠에 따라 다운로드가 제한될 수 있으며, 서비스 사정에 따라 다운로드 횟수가 제한될 수 있습니다.<br>

ㆍ방송VOD 다운로드는 TV에서는 제공하지 않습니다.<br>

ㆍBasic 이용권으로 FHD화질 이상 시청 시도 시, 미리보기만 가능합니다.<br>

ㆍPremium 이용권 구매 시 시범 서비스 기간동안 TV기기 (스마트TV 및 안드로이드 STB App)에서 일부 콘텐츠를 최상위 화질(UHD)로 이용하실 수 있습니다.<br>

ㆍTV 사용가능 기기는 wavve앱이 설치가 되어 있거나 앱스토어에서 설치가 가능한 스마트TV 및 Android SetTopBox용 OTT이며, TV기기에서는 일부 채널은 LIVE서비스가 제공되지 않습니다.<br>

 자세히보기<br>

ㆍ삼성스마트TV, CJ헬로 뷰잉 등 일부 스마트TV, OTT 기기에서는 LIVE 서비스가 제공되지 않을 수 있습니다. (콘텐츠 제공사 정책)<br>


