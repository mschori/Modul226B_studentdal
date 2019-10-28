<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Students</title>
</head>
<body>

<form action="/saveStudent" method="post">

Name: <input type="text" name="name"/>
Course: <input type="text" name="course"/>
Fee: <input type="text" name="fee"/>

    <buttons type="submit">save</buttons>

</form>

<a href="listStudents">View All</a>

</body>
</html>