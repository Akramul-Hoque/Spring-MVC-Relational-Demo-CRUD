<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/27/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="../product-update" method="post">
        <table>
            <tr>
                <td><input type="hidden" name="id" value="${product.id}"></td>
            </tr>
            <tr>
                <th>Company Name: </th>
                <td><input type="text" name="productName" value="${product.productName}"></td>
            </tr>
            <tr>
                <th>Product Type: </th>
                <td><input type="text" name="productType" value="${product.productType}"></td>
            </tr>
            <tr>
                <th>Product Price: </th>
                <td><input type="text" name="productPrice" value="${product.productPrice}"></td>
            </tr>
           <tr>
               <td>
                   <select name="companyId" id="">
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
