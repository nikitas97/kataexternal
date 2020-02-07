<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
  <form action="submit-form">
  ID:<br>
  <input type="number" name="id" >
  <br><br>
  First name:<br>
  <input type="text" name="firstname" >
  <br><br>
  Last name:<br>
  <input type="text" name="lastname" >
  <br><br>
  Home City:<br>
  <input type="text" name="city" >
  <br><br>
  Studying city:<br>
  <input type="text" name="studCity" >
  <br><br>
  Personal Income:<br>
  <input type="number" name="studIncome" >
  <br><br>
  Family Income:<br>
  <input type="number" name="familyInc" >
  <br><br>
  Number of studying siblings:<br>
  <input type="number" name="studSibs" min="0" max="10">
  <br><br>
  
  Is at least one of your parents employeed? <br>
  <input type="radio" name="workingParents" value="true"> Yes<br>
  <input type="radio" name="workingParents" value="false"> No<br><br>
  <select name="department">
    <option >DIT</option>
    <option >NUT</option>
    <option >GD</option>
  </select>
  <br><br>

  <input type="submit">

</body>
</html>