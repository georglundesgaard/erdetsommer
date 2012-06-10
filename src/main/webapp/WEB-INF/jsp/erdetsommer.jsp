<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %><%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>Er det sommer?</title>
</head>
<body>
<c:choose>
<c:when test="${erdetsommer}">
<h1>Er det sommer? JA!</h1>
<p>Hoyeste temperatur i Oslo de neste 24 timene er pa eller over FOO 20C: ${erdetsommer} ${highestTemp} C</p>
</c:when>
<c:otherwise>
<h1>Er det sommer? NEI!</h1>
<p>Hoyeste temperatur i Oslo de neste 24 timene er under 20C: <c:out value="highestTemp"/>C</p>
</c:otherwise>
</c:choose>
<p>Vervarsel fra yr.no, levert av Meteorologisk institutt og NRK: <a href="http://www.yr.no/sted/Norge/Oslo/Oslo/Oslo/">http://www.yr.no/sted/Norge/Oslo/Oslo/Oslo/</a></p>
</body>
</html>