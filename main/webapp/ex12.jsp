<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="date" value="<%=new java.util.Date() %>"/>
<fmt:timeZone value="America/New_York">
	<f:formatDate type="both" value="${date}" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>
<br>
<fmt:timeZone value="Asia/Korea">
	<f:formatDate type="both" value="${date}"/>
</fmt:timeZone>