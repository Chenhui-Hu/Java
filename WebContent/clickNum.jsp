<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>点击次数统计</title>
</head>
<body>
	<form action ="clicknum.action" method ="post">
		<input type="submit" value="点击！" />
	</form>
	<!-- 输出点击次数 -->
	点击按钮，已点击了
	<!-- 通过表达式访问ServletContext对象的属性 -->
	${empty applicationScope.num?0:applicationScope.num}次
</body>
</html>