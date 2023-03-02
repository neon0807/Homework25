<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>

<h1>Public Information</h1>
<br>
<br>

<security:authorize access="hasAnyRole('Employee', 'IT', 'Stuff', 'Director')">
<input type="button" value="For employee"
       onclick="window.location.href = 'employee_info'">
Only for all
</security:authorize>

<br>
<br>
<security:authorize access="hasAnyRole('IT', 'Stuff', 'Director')">
<input type="button" value="For it"
       onclick="window.location.href = 'it_info'">
Only for it, stuff and director
</security:authorize>
<br>
<br>
<security:authorize access="hasAnyRole('Stuff', 'Director')">
<input type="button" value="For stuff"
       onclick="window.location.href = 'stuff_info'">
Only for stuff and director
</security:authorize>
<br>
<br>
<security:authorize access="hasAnyRole('Director')">
<input type="button" value="For director"
       onclick="window.location.href = 'director_info'">
Only for director
</security:authorize>

</body>
</html>