<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>test</title>
</head>
<body>
    <h4>test</h4>
    <c:forEach items="${alist }" var="account">
    	${account.primarykey } / ${account.date } / ${account.type } / ${account.amount }<br>
    </c:forEach>
    <script>

    </script>
</body>
</html>