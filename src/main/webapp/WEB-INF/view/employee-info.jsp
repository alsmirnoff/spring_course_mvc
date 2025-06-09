<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Employee info</h2>
<br>

<%-- <form:form action="saveEmployee" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK">
</form:form> --%>

<form:form action="saveEmployee" modelAttribute="employee">

    <from:hidden path="id"/>

    <table>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname</td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td>Department</td>
            <td><form:input path="department"/></td>
        </tr>
        <tr>
            <td>Salary</td>
            <td><form:input path="salary"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="OK"></td>
        </tr>
    </table>
</form:form>

</body>
</html>