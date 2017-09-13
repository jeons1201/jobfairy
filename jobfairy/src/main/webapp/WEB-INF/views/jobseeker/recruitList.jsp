<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.job.fairy.vo.ProjectVO,java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/jobseeker/rctSelectList.do" cammandName="projectVO">
		검색조건
	</form:form>
	<table>
		<tr>
			<th>No.</th>
			<th>제목</th>
			<th>작성자</th>
		</tr>
		<%
			List<ProjectVO> list = (List<ProjectVO>) request.getAttribute("list");
		%>
		<%
			for(ProjectVO vo : list){
		%>
			<tr>
				<td><%=vo.getProjectNm() %></td>
				<td><%=vo.getJobType() %></td>
				<td><%=vo.getJobClass() %></td>
				<td>기간써주기</td>
				<td><%=vo.getRegDate() %></td>
			</tr>
		 <%
			}
		 %>
	</table>
</body>
</html>