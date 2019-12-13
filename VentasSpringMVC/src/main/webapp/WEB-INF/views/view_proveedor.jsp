<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Gestion Proveedores</title>
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
			<h4 class="text-center">Lista de Proveedores</h4>
			<hr>
			<table class="table table-bordered table-striped">
				<thead>
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Nit</th>
					<th>correo</th>
                                        <th>Telefono</th>
                                        
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="emp" items="${list}">
					<tr>
						<td>${emp.id_proveedor}</td>
						<td>${emp.nombre}</td>
						<td>${emp.nit}</td>
						<td>${emp.correo}</td>
                                                <td>${emp.telefono}</td>
                                                
						<td><a href="editproveedor/${emp.id_proveedor}" class="btn btn-info btn-xs"><i class="glyphicon glyphicon-check"></i> Editar</a></td>
						<td><a href="deleteProvee/${emp.id_proveedor}" class="btn btn-danger btn-xs"><i class="glyphicon glyphicon-trash"></i> Eliminar</a></td>
					</tr>
				</c:forEach>				
				</tbody>
			</table>
			<br />
			<a href="new_proveedor" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i> Nuevo Proveedor</a>
		</div>
	</div>
</div>
</body>
</html>