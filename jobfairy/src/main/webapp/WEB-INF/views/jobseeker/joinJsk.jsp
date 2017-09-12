<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" 
		   uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<h2>회원이 되세요 </h2>
<form:form method="post" commandName="jobseekerVO"
	modelAttribute="jobseekerVO"
	       action="/jobseeker/aplJoin.do">
	<form:label path="userId">아 이 디 : </form:label>
	<form:input path="userId"/><br>
	<form:errors path="userId" cssClass="err"/><br>
	
	<form:label path="userPw">비밀번호 : </form:label>
	<form:password path="userPw"/><br>
	<form:errors path="userPw" cssClass="err"/><br>
	
	<form:label path="userNm">이　　름 : </form:label>
	<form:input path="userNm"/><br>
	<form:errors path="userNm" cssClass="err"/><br>
	
	<form:label path="email">이 메 일 : </form:label>
	<form:input path="email"/><br>
	<form:errors path="email" cssClass="err"/><br>
	<hr>
	
	<form:button>가입</form:button>	
</form:form>
</body>
</body>
</html>