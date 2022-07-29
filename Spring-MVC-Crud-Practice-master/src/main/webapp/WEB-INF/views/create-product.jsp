<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/26/2021
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<div>
    <form action="product-create" method="post">
        <table>
            <tr>
                <th>Product Name: </th>
                <td><input type="text" name="productName"></td>
            </tr>
            <tr>
                <th>Product Type: </th>
                <td><input type="text" name="productType"></td>
            </tr>
            <tr>
                <th>Select Company: </th>
                <td><select name="companyId" id="">
                    <c:forEach items="${companies}" var="company">
                        <option  value="${company.id}">${company.companyName}</option>
                    </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td><button type="submit">Save</button></td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
