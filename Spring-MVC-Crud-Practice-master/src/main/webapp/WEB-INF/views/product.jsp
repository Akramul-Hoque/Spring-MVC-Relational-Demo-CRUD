<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/26/2021
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <div>
        <table>
            <tr>
                <td>
                    <h3>Product List</h3>
                </td>
                <td>
                    <a href="product-add">Add New Product</a>
                </td>
            </tr>
        </table>
    </div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Product Name</th>
            <th>Product Type</th>
            <th>Product Price</th>
            <th>Company</th>
            <th>Action</th>
        </tr>
       <% int i = 1; %>
        <c:forEach items="${products}" var="product">
            <tr>
                <td><%= i %><% i++; %></td>
                <td>${product.productName}</td>
                <td>${product.productType}</td>
                <td>${product.productPrice}</td>
                <td>${product.company.companyName}</td>
                <td>
                    <a href="product-edit/${product.id}">Edit</a>
                    <a href="product-delete/${product.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
