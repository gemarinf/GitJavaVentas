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
                    <form:form method="post" action="saveProducto">
                        <div class="form-group">
                            <label for = "PDTNombre">Nombre: </label>
                            <form:input path="pDTNombre" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for = "PDTMarca">Marca: </label>
                            <form:input path="pDTMarca" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label for = "PDTMarca">Proveedor:  </label>
                            <form:select path="fK_Proveedor" class="form-control">
                               <form:option value="0">Seleccione...</form:option>
                             <c:forEach var="produ" items="${prod}">
                             <form:option value="${produ.fK_Proveedor}">${produ.proveedor}</form:option>
                             </c:forEach>        
                              </form:select>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPrecio">Precio Unitario</label>
                            <form:input type="number" path="pDTPrecio" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTCantidad">Cantidad</label>
                            <form:input type="number" path="pDTCantidad" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPeso">Peso</label>
                            <form:input type="number" path="pDTPeso" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTTamanio">Tamaño</label>
                            <form:input path="pDTTamanio" class="form-control"/>
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
