<%-- 
    Document   : new_pedido
    Created on : 9/12/2019, 04:34:46 PM
    Author     : dayisboada
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
	<title>Gestion Pedidos</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-6">
				<h4 class="text-center">Agregar Nuevo Pedido</h4>
				<hr>
				<form:form method="post" action="savePedido">
					<div class="form-group">
						<label for = "name">Producto </label>
			 <form:select path="id_producto" class="form-control">
                               <form:option value="0">Seleccione...</form:option>
                             <c:forEach var="produ" items="${pro}">
                             <form:option value="${produ.id_producto}">${produ.producto}</form:option>
                             </c:forEach>        
                              </form:select>
					</div>
					<div class="form-group">
						<label for = "salary">Cantidad </label>
						<form:input path="cantidad" class="form-control"/>
					</div>
					<div class="form-group">
						<label for ="designation">precio total:</label>
						<form:input path="precio_total" class="form-control"/>
					</div>
                                        
                                        <div class="form-group">
						<label for ="designation">Empleado: </label>
                                                  <form:select path="id_empleado" class="form-control">
                                                      <form:option value="0">Seleccione...</form:option>
                                                     <c:forEach var="em" items="${list}">
                             <form:option value="${em.id_empleado}">${em.empleado}</form:option>
                             </c:forEach> 
                                                    
</form:select>
					</div>
                                        <div class="form-group">
						<label for ="designation">Estado:</label>
						<form:select path="estado" class="form-control">
                                                    <form:option value="En Tramite">En tramite</form:option>
                                                    <form:option value="Entregado">Entregado</form:option>
                                                    
</form:select>
					</div>
					<div class="form-group">
						<input type="submit" value="Guardar" class="btn btn-success"/>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
