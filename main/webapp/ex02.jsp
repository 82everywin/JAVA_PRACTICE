<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="num" value="100"/>

 <c:if test="${num==100}">
	100이다
	</c:if>
<c:if test="${num != 100}">
	100이 아니다!
	</c:if>
<br>
${num==100 ? '100이다~':'100이 아니다!'}
<br>
<c:set var="age" value="02"/>
<c:choose>
	<c:when test="${age<8 }">
	<h1>유치원생</h1>
	</c:when>
	<c:when test="${age<14}">
	초등학생
	</c:when>
	<c:when test="${age<17 }">
	중학생
	</c:when>
	<c:when test="${age<20 }">
	고등학생
	</c:when>
	<c:otherwise >
	성인!
	</c:otherwise>
	
</c:choose>