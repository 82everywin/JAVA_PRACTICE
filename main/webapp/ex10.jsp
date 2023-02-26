<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:formatNumber value="10000000"/><br>
<fmt:formatNumber value="10000000" groupingUsed="false"/>
<br>
<fmt:formatNumber value="1000.123456"  pattern="#,###.###"/>

