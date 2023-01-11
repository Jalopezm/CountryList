<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h1>All Countries</h1>
<ul>
   <c:forEach var="c" items="${country}">
            <li><a href="/lang/">${c.name}</a></li>
   </c:forEach>
</ul>
</html>