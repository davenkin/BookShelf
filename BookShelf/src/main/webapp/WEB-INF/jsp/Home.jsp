<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BookShelf Home Page</title>
        <script src="js/addBook.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<a id="addBookLink" href="addbook">Add a book</a>
   <%@include file="header.jsp" %>
<div id="books">
 <c:forEach var="aBook" items="${books}" varStatus="index">
 <c:set var="classPicker" scope="page" value="${index.index%2}"/>
 <c:choose>
     <c:when test="${classPicker eq 0}">
         <c:set var="varclass" value="type1"/>
     </c:when>
     <c:otherwise>
         <c:set var="varclass" value="type2"/>
     </c:otherwise>
 </c:choose>

<div class="bookRow ${varclass}">
<p>No.${index.index+1}</p>
<p>Name:${aBook.name}</p>
<p>Price:${aBook.price}</p>
<p>Author:${aBook.author}</p>
</div>
 </c:forEach>
</div>
</body>
</html>
