<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
	.error {
		color: red;
	}
</style>


<form:form
	action="/add-student"
	method="POST"
	modelAttribute="studentModel">
	
	<form:input path="fullName"/> <form:errors path="fullName" cssClass="error"/> <br>
	<form:input path="age"/> <form:errors path="age" cssClass="error"/> <br>
	<form:input path="email"/> <form:errors path="email" cssClass="error"/> <br>

	<form:select path="country" items="${ countries }" itemLabel="name" itemValue="id"/> <form:errors path="country" cssClass="error"/> <br>
	<input type="submit" value="Add student">
</form:form>