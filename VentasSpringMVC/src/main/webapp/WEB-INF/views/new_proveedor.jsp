<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<h4 class="text-center">Agregar Nuevo Proveedor</h4>
				<hr>
				<form:form method="post" action="saveProve">
					<div class="form-group">
						<label for = "name">Nombre: </label>
						<form:input path="nombre" class="form-control"/>
					</div>
					<div class="form-group">
						<label for = "salary">Nit: </label>
						<form:input path="nit" class="form-control"/>
					</div>
					<div class="form-group">
						<label for ="designation">Correo:</label>
						<form:input path="correo" class="form-control"/>
					</div>
                                        <div class="form-group">
						<label for ="designation">Telefono:</label>
						<form:input path="telefono" class="form-control"/>
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
