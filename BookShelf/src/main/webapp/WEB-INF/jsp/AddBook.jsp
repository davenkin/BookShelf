<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <title>Add a Book</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
 <%@include file="header.jsp" %>
 <div id="addBook">
<h2 id="addBookTitle">Add a Book:</h2>
<form id="addBookForm" method="post">
<input type="text" placeholder="ISBN" name="isbn"><br/>
<input type="text" placeholder="Name" name="name"/><br/>
<input type="text" placeholder="Price" name="price"/><br/>
<input type="text" placeholder="Author" name="author"/><br/>
<a id="submitLink" href="empty">Add</a>
</form>
</div>
</body>
</html>
