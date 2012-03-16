<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Weather Page</title>
</head>
<body>
<%
    String[][] data = {
            {"Nov 6", "Sunny", "32", "26"},
            {"Nov 7", "Sunny", "32", "26"},
            {"Nov 8", "Sunny", "32", "26"},
            {"Nov 9", "Partly Cloudy", "32", "26"},
            {"Nov 10", "Isolated T-Storms", "32", "26"}
    };
    request.setAttribute("weathers", data);
%>
<strong>5-Days Weather for Denpasar, Indonesia</strong>

<table border="1">
    <tr>
        <th>DATE</th>
        <th>CONDITION</th>
        <th>TEMP. HIGH</th>
        <th>TEMP. LOW</th>
    </tr>
    <c:forEach var="weather" items="${weathers}">
        <tr>
            <td>${weather[0]}</td>
            <td>${weather[1]}</td>
            <td align="center">${weather[2]}&#8451;</td>
            <td align="center">${weather[3]}&#8451;</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>