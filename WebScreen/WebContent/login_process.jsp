<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>

</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
			String userid = request.getParameter("id");
			String password = request.getParameter("psw");

		if (userid.equals("admin") && password.equals("1234")) {
			response.sendRedirect("products.jsp");
		} else {
			response.sendRedirect("login_failure.jsp");
		}
	%>
</body>
</html>