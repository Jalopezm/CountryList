<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h1>All Countries</h1>
<ul>
   <c:forEach var="c" items="${country}">
            <li>${c.name}<a href="/cities/countryCode=${c.code}">Cities</a> <a href="/language/countryCode=${c.code}">Languages</a></li>
   </c:forEach>
</ul>
</html>