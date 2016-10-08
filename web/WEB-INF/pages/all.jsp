<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 08.10.2016
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
${name} ${surname} ${fatherName}
</p>
<p>
    ${sessionScope.get("email")}
</p>
</body>
</html>
