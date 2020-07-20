<%--
  Created by IntelliJ IDEA.
  User: 程鑫博
  Date: 2020/7/16
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Manager/upload" method="post" enctype="multipart/form-data">
    选择上传图书文件：<input type="file" name="file"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
