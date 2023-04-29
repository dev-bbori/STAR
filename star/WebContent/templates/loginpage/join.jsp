<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/loginpage/join.css" type="text/css">
=======
<link rel="stylesheet" href="../../static/css/loginpage/join.css" type="text/css">
>>>>>>> ebd3b5f64560de68450c6739a38ec4aa5d68fa82
<title>회원가입|STAR</title>
</head>
<body>
   <div class="layer_fix pop_login pop_mem_reserve fix_disable">
       <section>
          <form id="joinForm" action="https://www.goodchoice.kr/user/joinProcess" autocomplete="off" method="post" novalidate="novalidate">
              <input type="hidden" name="yeogi_token" value="6a6e8bbde2bc868605204597f7ec1653">
      
            <input type="hidden" name="privacy_auxiliary_policy">
            <input type="hidden" name="location_policy">
            <input type="hidden" name="marketing_acceptance">
      
              <div class="fix_title">
                  <h1 class="page_head"><a href="https://www.goodchoice.kr/" title="여기어때">여기어때</a></h1>
              </div>
      
              <div class="join">
                  <strong class="sub_title">회원가입</strong>
                  <b>아이디</b>
                  <div class="inp_type_2 form-errors">
                     <!-- focus / err -->
                      <input type="email" name="uid" id="gcuseremail" placeholder="이메일 주소를 입력해주세요.">
                  <label id="gcuseremail_msg" class="validate_msg_label" style="color: red;"></label>
                  </div>
      
                  <b>비밀번호</b>
                  <div class="inp_type_2 form-errors form-password-rule">
                      <input type="password" name="upw" placeholder="비밀번호를 입력해주세요." id="new_pw">
                  <label id="new_pw_msg" class="validate_msg_label"></label>
                  </div>
      
                  <b>비밀번호 확인</b>
                  <div class="inp_type_2 form-errors">
                      <input type="password" name="upw_retry" placeholder="비밀번호를 다시 입력해주세요." id="new_pw_re">
                  <label id="new_pw_re_msg" class="validate_msg_label"></label>
                  </div>
                  
                  <b>이 름</b>
                  <div class="inp_type_2 form-errors form-username">
                      <input type="text" name="uname" id="gcusername" placeholder="이름을 입력해주세요.">
                  <label id="name2" class="validate_msg_label" style="color: red;"></label>
                  </div>
                  
                  <button type="button" id="joinBtn" class="btn_link gra_left_right_red btn_user_submit"  style="background-color: rgb(250, 250, 250); color: rgba(0, 0, 0, 0.16); border: none;">
                     <span>가입하기</span>
                  </button>
              </div>
          </form>
      </section>
   </div>
</body>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>

 $(document).ready(function() {

    var youhyo =/([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/ ;
    var youhyoname = /^[가-힣]{2,4}$/; 
    var buttonhwal = document.getElementById('joinBtn');
    
//아이디 
$("#gcuseremail").blur(function(){
    var email = $("#gcuseremail").val();

    if( email == '' || email == 'undefined') {
        $("#gcuseremail_msg").css('color','red');
        $("#gcuseremail_msg").text('이메일을 입력해 주세요');  
        return false;
}
    else if(! youhyo.test(email)  ) {
        $("#gcuseremail_msg").css('color','red');
        $("#gcuseremail_msg").text('사용할 수 없는 이메일 입니다.');
        return false;
    }
    else if( youhyo.test(email)  ) {
        $("#gcuseremail_msg").css('color','blue');
        $("#gcuseremail_msg").text('사용할 수 있는 이메일 입니다.');
       
    }
});


// 비번
$("#new_pw_re").blur(function(){
    
    var pass = $("#new_pw").val();
    var passcheck = $("#new_pw_re").val();

 if(passcheck == pass){
    $("#new_pw_re_msg").css('color','blue');
    $("#new_pw_re_msg").text('비밀번호가 일치합니다.');
 }

 else if(passcheck != pass){
    $("#new_pw_re_msg").css('color','red');
    $("#new_pw_re_msg").text('비밀번호가 일치하지 않습니다.');
    return false;
 }

});

$("#new_pw").blur(function(){

var pass = $("#new_pw").val();
var passcheck = $("#new_pw_re").val();

if(passcheck == pass){
$("#new_pw_re_msg").css('color','blue');
$("#new_pw_re_msg").text('비밀번호가 일치합니다.');
}

else if(passcheck != pass){
$("#new_pw_re_msg").css('color','red');
$("#new_pw_re_msg").text('비밀번호가 일치하지 않습니다.');
return false;
}
});

// 이름
$("#gcusername").blur(function(){

    var name = $("#gcusername").val();

    if( name == '' || name == 'undefined') {
        $("#name2").css('color','red');
        $("#name2").text('이름을 입력해주세요.');  
        return false;
    }

    else if(! youhyoname.test(name)  ) {
        $("#name2").css('color','red');
        $("#name2").text('제대로된 이름을 입력해주세요.');
        return false;
    }
    else if(youhyoname.test(name)){
        $("#name2").css('color','blue');
        $("#name2").text('사용할 수 있는 이름 입니다.');
       
    }


});    
      
});


</script>
</html>