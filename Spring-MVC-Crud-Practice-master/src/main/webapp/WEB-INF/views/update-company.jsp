<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/26/2021
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
  <form action="../company-update" method="post">
    <table>
      <tr>
        <td><input type="hidden" name="id" value="${company.id}"></td>
      </tr>
      <tr>
        <th>Company Name: </th>
        <td><input type="text" name="companyName" value="${company.companyName}"></td>
      </tr>
      <tr>
        <th>Address: </th>
        <td><input type="text" name="address" value="${company.address}"></td>
      </tr>
      <tr>
        <th>Dealer Name: </th>
        <td><input type="text" name="dealerName" value="${company.dealerName}"></td>
      </tr>
      <tr>
        <th>Dealer Number: </th>
        <td><input type="text" name="dealerNumber" value="${company.dealerNumber}"></td>
      </tr>
      <tr>
        <th>Company Mail: </th>
        <td><input type="text" name="companyMail" value="${company.companyMail}"></td>
      </tr>
      <tr>
        <td><button type="submit">Save</button></td>
      </tr>

    </table>
  </form>
</div>
</body>
</html>
