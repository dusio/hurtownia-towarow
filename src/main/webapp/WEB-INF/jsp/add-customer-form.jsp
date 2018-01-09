<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KubaPC1
  Date: 06.01.2018
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Welcome to add form!
<form:form action="addCustomerForm" modelAttribute="newCustomer" method="post">

    <form:label path="customerFirstName">First Name</form:label>
    <form:input path="customerFirstName"/>
    <form:errors path="customerFirstName"/><br/>
    <form:label path="customerLastName">Last Name</form:label>
    <form:input path="customerLastName"/>
    <form:errors path="customerLastName"/><br/>
    <form:label path="customerEmail">Email</form:label>
    <form:input path="customerEmail"/>
    <form:errors path="customerEmail"/><br/>
    <button type="submit">Add new customer</button>
</form:form>
</body>
</html>
