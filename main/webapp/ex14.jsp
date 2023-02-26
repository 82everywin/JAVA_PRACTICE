<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	String[] fruits={"apple", "melon","orange"};
%>
<c:set var="fruits" value="Apple,Mango,Melon"/>
<c:set var="fruits2" value="<%=fruits %>"/>
${fn:join(fruits2,',')}
<br>

<c:forEach var="fruit" items="${fn:split(fruits,',')}">
${fruit}<br>
</c:forEach>
<br>
${fn:replace(fruits,',','#')}