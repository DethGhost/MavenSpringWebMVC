<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 08.10.2016
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    ${sessionScope.get("name")} ${sessionScope.get("surname")}
</p>
<p>
    ${sessionScope.get("email")}
</p>
<p>
<form method="get" action="FatherName">
    <input type="text" name="fatherName" placeholder="Enter Father Name"/>
    <button>Submit</button>
</form>
</p>
</body>
</html>
