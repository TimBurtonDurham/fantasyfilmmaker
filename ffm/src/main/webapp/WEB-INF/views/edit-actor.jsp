<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>Edit ${actor.firstname} ${actor.lastname}</h2>

<form:form method="post" modelAttribute="actor" action="${contextpath}/save/actor">

    <form:input path="firstname" value="${actor.firstname}"/>
    <form:input path="lastname" value="${actor.lastname}"/>

    <form:hidden id="id" path="id"/>

    <button type="submit" id="actor">Save</button>

</form:form>