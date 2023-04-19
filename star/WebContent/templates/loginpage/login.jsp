<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../static/css/loginpage/login.css" type="text/css">
<title>로그인|STAR</title>
</head>
<style></style>
<body>
	<div class="layer_fix layer_unfix pop_login pop_mem_reserve">
		<section>
			<form id="loginForm" action="https://www.goodchoice.kr/user/loginProcess" autocomplete="off" method="post" novalidate="novalidate">
				<input type="hidden" name="yeogi_token" value="3172e61728d28bac94eb712b5354ca4e">
				<div class="fix_title">
					<strong class="logo">
					<a href="https://www.goodchoice.kr/">STAR</a>
					</strong>
				</div>
				<div class="inp_type_1 ico_email form-errors">
					<input type="email" name="uid" placeholder="이메일 주소" required class="required" value data-msg-required="이메일 주소를 입력해 주세요.">
					<button type="button" class="reset_val">초기화</button>
				</div>
				<div class="inp_type_1 ico_pw form-errors">
					<input type="password" name="upw" placeholder="비밀번호" required class="required" data-msg-required="비밀번호를 입력해 주세요.">
					<button type="button" class="reset_val">초기화</button>
				</div>
				<button class="btn_link gra_left_right_red" type="submit">
					<span>로그인</span>
				</button>
				<div class="link_half">
					<div>
						<a href="https://www.goodchoice.kr/user/passwdResetStart">
							<span>비밀번호 재설정</span>
						</a>
					</div>
					<div>
						<a href="https://www.goodchoice.kr/user/join">
							<span>회원가입</span>
						</a>
					</div>
				</div>
			</form>
		</section>
	</div>
</body>
</html>