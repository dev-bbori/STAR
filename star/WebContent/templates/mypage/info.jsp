<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../../static/css/mypage/info.css">
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/gh/orioncactus/pretendard/dist/web/static/pretendard.css" />
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<div class="wrap show">
		<header id="menu">
            <section>
                <div>
                <img style="width: 150px;
   					 height: 150px;
    				margin-left: -90px;
    				margin-top: -33px;" 
    				src="../../static/image/3.png">
                </div>
                <h1>                 
                    <a href="" id="bannertext">Save The Animal Relationship</a>
                </h1>
                <ul class="gnb_pc" >
                    <li><a class="bannertext" href="">내주변</a></li>
                    <li><a class="bannertext" href="">예약내역</a></li>
                    <li><a class="bannertext" href="">더보기</a></li>
                    <li><a class="bannertext" href="">로그인</a></li>
                </ul>
            </section>
        </header>
		<div class="sub_top_wrap">
			<div class="sub_top bg_kong_2">
				<h2>내정보</h2>
			</div>
		</div>
		<div id="content" class="sub_wrap my_wrap">
			<nav>
				<ul>
					<li>
						<a class="active" href="info.jpg">내 정보 관리</a>
					</li>
					<li>
						<a href="petsitterform.jsp">돌보미 신청</a>
					</li>
					<li>
						<a href="carelist.jsp">돌봄 내역</a>
					</li>
					<li>
						<a href="reservationlist.jsp">이용 내역</a>
					</li>
					<li>
						<a href="review.jsp">이용후기</a>
					</li>
					<li>
						<a href="report.jsp">신고목록</a>
					</li>
				</ul>
			</nav>
			<div class="align_rt">
				<div class="mypage">
					<form name="form1" action="">
						<section class="top_area">
							<strong>내 정보 수정</strong>
							<div class="login_info">
								<div>
									<img src="https://image.goodchoice.kr/profile/ico/ico_21.png" alt>
								</div>
								<p>Naver 회원으로 로그인</p>
							</div>
							<div class="pw_input">
								<div class="pw_input__title">
									<b>이름</b>
									<span class="title__uinfo">정상식</span>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="namewrap" class="inp_wrap remove form-errors">
										<input id="name" type="text" placeholder="이름을 입력해주세요.">
										<p id="pname"></p>
									</p>
									<button type="button" class="btn_etc btn_confirm active">딴거할래요</button>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
						</section>
					</form>
					<form name="form2" action="">
							<div class="pw_input">
								<div class="pw_input__title">
									<b>주소</b>
									<span class="title__uinfo">경기도 수원시 장안구 정자동 수성로 245번길21</span>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="addresswrap" class="inp_wrap remove form-errors">
										<input id="address" type="text" placeholder="주소를 입력해주세요.">
										<p id="paddress"></p>
									</p>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
					</form>
					<!-- 보더 바텀 선언 -->
					<form name="form3" action="">
						<section>
							<div class="pw_input phone_confirm">
								<div class="pw_input__title">
									<b>휴대폰 번호</b>
									<span class="title__uinfo">01034419435</span>
									<div class="safety_txt">개인 정보 보호를 위해 내 정보는 모두 안전하게 암호화됩니다.</div>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="phonewrap" class="inp_wrap remove form-errors">
										<input id="phone" type="text" oninput="send()" placeholder="휴대폰 번호를 입력해주세요.">
										<p id="pphone"></p>
									</p>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
						</section>
					</form>
					<form name="form4" action="">
							<div class="pw_input">
								<div class="pw_input__title">
									<b>나이</b>
									<span class="title__uinfo">26</span>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="agewrap"class="inp_wrap remove form-errors">
										<input id="age" type="text" placeholder="나이를 입력해주세요.">
										<p id="page"></p>
									</p>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
					</form>
					<form name="form5" action="">
							<div class="pw_input">
								<div class="pw_input__title">
									<b>성별</b>
									<span class="title__uinfo">남</span>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="genderwrap" class="inp_wrap remove form-errors">
										<input id="gender" type="text" placeholder="성별을 입력해주세요.">
										<p id="pgender"></p>
									</p>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
					</form>
					<form name="form6" action="" class="formlast">
							<div class="pw_input">
								<div class="pw_input__title">
									<b>이메일</b>
									<span class="title__uinfo">hec5030@naver.com</span>
								</div>
								<section class="modifying-section" style="display: none;">
									<p id="emailwrap" class="inp_wrap remove form-errors">
										<input id="email" type="email" oninput="send()" placeholder="이메일을 입력해주세요.">
										<p id="pemail"></p>
									</p>
								</section>
								<div class="pw_input__btns-wrap">
									<button class="btns-wrap__edit-btn" type="button">수정</button>
									<button class="btns-wrap__submit-btn" type="submit">수정완료</button>
									<button class="btns-wrap__cancel-btn" type="button">수정취소</button>
								</div>
							</div>
					</form>
				</div>
				<div class="bot_btn">
					<p>여기어때를 이용하고 싶지 않으신가요?</p>
					<button type="button">로그아웃</button>
					<button type="button">
						<a href="joinout.jsp">회원탈퇴</a>
					</button>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script src="../../static/js/mypage/onclick.js"></script>
<script src="../../static/js/mypage/input.js"></script>
<script src="../../static/js/mypage/header.js"></script>
</html>