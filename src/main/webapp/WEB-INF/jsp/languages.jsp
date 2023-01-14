<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h1>Cities From Country</h1>
<ul>
   <c:forEach var="lang" items="${languagesC}">
             <li>${lang.name}</li>
   </c:forEach>
   </ul>
   <ul>
   <c:forEach var="lang" items="${languages}">
               <c:choose>
               <c:when test="${lang.off eq 'F'}">
               <li style="background-color: red;"><a href="/language/language=${lang.name}">${lang.name}</a> // IsOfficial:${lang.off}</li>
               </c:when>
               <c:otherwise>
                <li style="background-color: green;"><a href="/language/language=${lang.name}">${lang.name}</a> // IsOfficial:${lang.off}</li>
               </c:otherwise>
               </c:choose>
      </c:forEach>
</ul>
</html>