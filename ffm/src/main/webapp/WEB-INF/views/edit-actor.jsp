<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h2>Edit ${actor.firstname} ${actor.lastname}</h2>

<f:form method="post" modelAttribute="actor" action="${contextpath}/save/actor">

    <f:input path="firstname" value="${actor.firstname}"/>
    <f:input path="lastname" value="${actor.lastname}"/>

    <f:hidden id="id" path="id"/>

    <button type="submit" id="actor">Save</button>

</f:form>