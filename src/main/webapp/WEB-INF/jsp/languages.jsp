<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h1>Cities From Country</h1>
<ul>
   <c:forEach var="lang" items="${languages}">
            ${lang.name}
            <c:choose>
            <c:when test="${lang.off eq 'F'}">
            <li style="background-color: red;">${lang.name} // IsOfficial:${lang.off}</li>
            </c:when>
            <c:otherwise>
             <li style="background-color: green;">${lang.name} // IsOfficial:${lang.off}</li>
            </c:otherwise>
            </c:choose>
   </c:forEach>
   <c:forEach var="lang" items="${languagesC}">
               <c:choose>
               <c:when test="${lang.off eq 'F'}">
               <li style="background-color: red;">${lang.name} // IsOfficial:${lang.off}</li>
               </c:when>
               <c:otherwise>
                <li style="background-color: green;">${lang.name} // IsOfficial:${lang.off}</li>
               </c:otherwise>
               </c:choose>
      </c:forEach>

</ul>
</html>