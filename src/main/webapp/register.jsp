<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<form action="RegisterServlet" method="get">
    Name:<input type="text" name="name"><br>
    Password:<input type="password" name="password"><br>
    Confirm password: <input type="password" name="confPassword"><br>
    <input type="submit" value="login">
</form>
</body>
</html>