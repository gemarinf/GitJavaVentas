<%-- 
    Document   : new_producto
    Created on : 10/11/2019
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
                    <h4 class="text-center">Agregar Nuevo Producto</h4>
                    <hr>
                    <form:form method="post" action="savePedido">
                        <div class="form-group">
                            <label for = "PDTNombre">Nombre: </label>
                            <form:input path="PDTNombre" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for = "PDTMarca">Marca: </label>
                            <form:input path="PDTMarca" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPrecio">Precio</label>
                            <form:input type="number" path="PDTPrecio" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTCantidad">Cantidad</label>
                            <form:input type="number" path="PDTCantidad" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPeso">Peso</label>
                            <form:input type="number" path="PDTPeso" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTTamanio">Tamaño</label>
                            <form:input path="PDTTamanio" class="form-control"/>
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
