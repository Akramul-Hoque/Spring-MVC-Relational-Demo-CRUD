<%--
  Created by IntelliJ IDEA.
  User: Fahim Mahmud
  Date: 9/15/2021
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Company</title>
</head>
<body>
<div>
    <form action="company-create" method="post">
        <table>
            <tr>
                <th>Company Name: </th>
                <td><input type="text" name="companyName"></td>
            </tr>
            <tr>
                <th>Address: </th>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <th>Dealer Name: </th>
                <td><input type="text" name="dealerName"></td>
            </tr>
            <tr>
                <th>Dealer Number: </th>
                <td><input type="text" name="dealerNumber"></td>
            </tr>
            <tr>
                <th>Company Mail: </th>
                <td><input type="text" name="companyMail"></td>
            </tr>
            <tr>
                <td><button type="submit">Save</button></td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
