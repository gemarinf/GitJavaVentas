<%-- 
    Document   : new_producto
    Created on : 10/11/2019
    Author     : Andres
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Gestión Productos</title>
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
                    <h4 class="text-center">Lista de Productos</h4>
                    <hr>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Marca</th>
                                <th>Precio</th>
                                <th>Cantidad</th>
                                <th>Peso</th>
                                <th>Tamaño</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="pro" items="${list}">
                                <tr>
                                    <td>${pro.PKPDTProducto}</td>
                                    <td>${pro.PDTNombre}</td>
                                    <td>${pro.PDTMarca}</td>
                                    <td>${pro.PDTPrecio}</td>
                                    <td>${pro.PDTCantidad}</td>
                                    <td>${pro.PDTPeso}</td>
                                    <td>${pro.PDTTamanio}</td>
                                    <td><a href="editpro/${pro.PKPDTProducto}" class="btn btn-info btn-xs"><i class="glyphicon glyphicon-check"></i> Editar</a></td>
                                    <td><a href="deletepro/${pro.PKPDTProducto}" class="btn btn-danger btn-xs"><i class="glyphicon glyphicon-trash"></i> Eliminar</a></td>
                                </tr>
                            </c:forEach>				
                        </tbody>
                    </table>
                    <br />
                    <a href="new_producto" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i> Nuevo Producto</a>
                </div>
            </div>
        </div>
    </body>
</html>