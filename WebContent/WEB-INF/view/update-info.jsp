<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Info</title>
</head>
<body>
<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication property="principal.username" /> 
</security:authorize>
<div id="wrapper">
                <div id="header">
                        <h2>Current Communication Info</h2>
                </div>
        </div>

        <div id="container">
                <div id="content">
                        <table>
                                <tr>
                                		<th>Email</th>
                                        <th>Telephone Number</th>
                                </tr>
                                <c:forEach var="tempStud" items="${students}">

                                        <tr>
                                        		<td>${tempStud.email}</td>
                                                <td>${tempStud.telnumber}</td>
                                        </tr>
                                </c:forEach>
                        </table>
                </div>
        </div>

<form action="do-update">
Write your new email if you want to change it:<br><input type="text" name="email">
<br> 
Write your new telephone number if you want to change it:<br><input type="number" name="telnumber">
<br>
<input type="submit" value="Update!!">

</body>
</html>