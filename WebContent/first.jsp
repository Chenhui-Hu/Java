<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示用户信息</title>
</head>
<body>
		登录成功！欢迎用户${param.userName}<br/>
		当前用户${session.CurUser}<br/>
		<a href= "second.jsp">下一页</a>
</body>
</html>