<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head></head>

<body>
<jsp:useBean id="date" class="java.util.Date"/>
Today is: <fmt:formatDate value="${date}" type="date" pattern="dd-MMM-yyyy"/>
</body>
</html>