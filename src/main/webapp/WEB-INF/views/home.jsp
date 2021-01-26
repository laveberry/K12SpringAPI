<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h2>회원리스트 JSON으로 출력하기</h2>
	<a href="./android/memberObject.do" target="_blank">
		회원리스트 가져오기(객체형태)
	</a>
	<br />
	<a href="./android/memberList.do" target="_blank">
		회원리스트 가져오기(배열형태)
	</a>
	<br />
	<a href="./android/memberLogin.do?id=lave&pass=1004" target="_blank">
		회원로그인 하기(객체형태)
	</a>
</body>
</html>
