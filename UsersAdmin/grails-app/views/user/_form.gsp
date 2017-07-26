<%@ page import="usersadmin.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		
	</label>
	<g:textField name="password" maxlength="8" value="${userInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="user.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${userInstance.age}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="user.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${userInstance?.nombre}"/>
</div>

