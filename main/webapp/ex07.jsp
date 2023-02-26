<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="ex" value="/ex06"/> <%-- 컨택스트 경로 포함 절대 경로 --%>
${ex} <br>
<c:url value="ex06.jsp"/>  <%-- 현재 경로 기준 상대경로 --%>
<br>
<c:url value="https://www.naver.com"/>
<br>
<c:url value="ex06.jsp">
	<c:param name="num1" value="100"/>
	</c:url>