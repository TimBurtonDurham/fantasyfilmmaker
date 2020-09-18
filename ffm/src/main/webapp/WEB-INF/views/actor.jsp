<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>${actor.firstname} ${actor.lastname}</h2>
<a href="${contextpath}/edit/actor/${actor.id}">Edit</a>