<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border="1" style="height: 10px;">
    <c:forEach items="${list}" var="var">
        <tr style="height: 10px;">
            <td>${var.id}</td>
            <td>${var.outPoint}</td>
            <td>${var.outPointType}</td>
            <td>${var.outCustomerName}</td>
            <td>${var.outBirth}</td>
            <td>${var.outCarrierName}</td>
            <td>${var.outArea}</td>
            <td>${var.outCity}</td>
            <td>${var.outDegree}</td>
            <td>${var.inPoint}</td>
            <td>${var.inPointType}</td>
            <td>${var.inCustomerName}</td>
            <td>${var.inBirth}</td>
            <td>${var.inCarrierName}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
