<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h1>Cities From Country</h1>
<ul>
   <c:forEach var="cities" items="${cities}">
            <li>${cities.name}</li>
   </c:forEach>
</ul>
</html>