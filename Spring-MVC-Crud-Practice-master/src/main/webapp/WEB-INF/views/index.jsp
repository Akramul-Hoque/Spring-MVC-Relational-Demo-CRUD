<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/14/2021
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Company List</title>
</head>
<body>
<div align="center">
    <div>
        <table>
            <tr>
                <td>
                    <h3>Company List</h3>
                </td>
                <td>
                    <a href="company-add">Add New Company</a>
                </td>
                <td>
                    <a href="product"> Product List</a>
                </td>
            </tr>
        </table>
    </div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Company Name</th>
            <th>Address</th>
            <th>Dealer Name</th>
            <th>Dealer Number</th>
            <th>Company Email</th>
            <th>Action</th>
        </tr>
    <% int i = 1; %>
    <c:forEach items="${companies}" var="company">
        <tr>
            <td> <%=i%><%i++;%> </td>
            <td>${company.companyName}</td>
            <td>${company.address}</td>
            <td>${company.dealerName}</td>
            <td>${company.dealerNumber}</td>
            <td>${company.companyMail}</td>
            <td>
                <a href="company-edit/${company.id}">Edit</a>
                <a href="company-delete/${company.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

    </table>
</div>
</body>
</html>
