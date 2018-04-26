<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<title>Students by page</title>
</head>
<body>

	<c:url var="firstUrl" value="students-by-page?page=0"/>
	<c:url var="lastUrl" value="students-by-page?page=${ studentsList.totalPages-1 }"/>
	<c:url var="nextUrl" value="students-by-page?page=${ currentIndex + 1 }"/>
	<c:url var="prevUrl" value="students-by-page?page=${ currentIndex - 1 }"/>
	
	<div class="container">
		<div class="row">
			<ul class="pagination">
				<c:choose>
					<c:when test="${ currentIndex == 0 }">
						<li class="disabled"> <a href="#">&lt;&lt;</a> </li>
						<li class="disabled"> <a href="#">&lt;</a> </li>
						<li class="active"> <a href="${ firstUrl }">1</a> </li>
					</c:when>
					
					<c:otherwise>
						<li> <a href="${ firstUrl }">&lt;&lt;</a> </li>
						<li> <a href="${ prevUrl }">&lt;</a> </li>
					</c:otherwise>
				</c:choose>
				<c:forEach var="i" begin="${ beginIndex }" end="${ endIndex }">
					<c:url var="pageUrl" value="students-by-page?page=${ i }"/>
					<c:choose>
						<c:when test="${ i == currentIndex }">
							<li class="active"> <a href="#">${ i + 1 }</a> </li>
						</c:when>
					
						<c:otherwise>
							<li> <a href="${ pageUrl }">${ i + 1 }</a> </li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:choose>
					<c:when test="${ currentIndex == studentsList.totalPages-1 }">
						<li class="disabled"> <a href="#">&gt;</a> </li>
						<li class="disabled"> <a href="#">&gt;&gt;</a> </li>
					</c:when>
					
					<c:otherwise>
						<li> <a href="${ nextUrl }">&gt;</a> </li>
						<li> <a href="${ lastUrl }">&gt;&gt;</a> </li>
					</c:otherwise>
				</c:choose>
				
			</ul>
		</div>
		
		<div class="row">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Full Name</th>
						<th>Email</th>
						<th>Age</th>
						<th>Country</th>
					</tr>
				</thead>
				
				<tbody> 
					<c:forEach items="${ studentsListByPageSize }" var="student">
						<tr>
							<td>${ student.id }</td>
							<td>${ student.fullName }</td>
							<td>${ student.email }</td>
							<td>${ student.age }</td>
							<td>${ student.country.name }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>