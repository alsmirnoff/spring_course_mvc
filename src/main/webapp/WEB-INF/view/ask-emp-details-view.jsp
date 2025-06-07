<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <%-- <form:option value="Information technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/> --%>
    <form:options items="${departments}"/>
    </form:select>
    <br><br>
    Which car do you want?
    <br>
    <%-- BMW <form:radiobutton path="carBrand" value="BMW"/>
    <br>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    <br>
    MB <form:radiobutton path="carBrand" value="Mersedes-Benz"/> --%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Language(s):
    <%-- EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="Deutch"/>
    FR <form:checkbox path="languages" value="French"/> --%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <input type="submit" value="Send">

</form:form>

</body>

</html>