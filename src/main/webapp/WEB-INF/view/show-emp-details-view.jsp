<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<body>

<!-- <h2>Dear ${param.employeeName}, you are welcome!</h2> -->
<h2>Dear ${employee.name}, you are welcome!</h2>
<br><br>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department.description}
<!-- Your department: ${employee.department} -->
<br>
Your favorite car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Email: ${employee.email}
<br>
Phone number: ${employee.phoneNumber}
</body>

</html>