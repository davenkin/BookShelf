<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" language="java" %>

<html>
<head>
    <title>Add a Book</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />"/>
    <script src="<c:url value='/js/addBook.js' />"></script>
</head>

<body>

   <div id="addBook">
      <h2 id="addBookTitle">Add a Book:</h2>
      <form id="addBookForm" method="post" name="addBookForm">
         <input type="text" placeholder="ISBN" id="bookIsbn" name="isbn"><br/>
         <input type="text" placeholder="Name" id="bookName" name="name"/><br/>
         <input type="text" placeholder="Price" id="bookPrice" name="price"/><br/>
         <input type="text" placeholder="Author" id="bookAuthor" name="author"/><br/>
         <a id="submitLink" href="#" onClick="addBook();">Add</a>
      </form>
   </div>
</body>
</html>
