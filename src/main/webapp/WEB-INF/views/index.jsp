<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 5/23/18
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/convert">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    ${usd} convert ${vnd}
    <br>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
