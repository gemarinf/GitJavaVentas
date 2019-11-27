<%-- 
    Document   : new_pedido
    Created on : 26/11/2019, 08:05:54 PM
    Author     : dayisboada
--%>


<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gestión Pedido</title>
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
                            <label for = "PDTNombre">Producto: </label>
                            <form:input path="id_producto" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for = "PDTMarca">Cantidad: </label>
                            <form:input path="cantidad" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPrecio">Precio  Total:</label>
                            <form:input type="number" path="precio_total" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTCantidad">Empleado:</label>
                            <form:input  path="id_empleado" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for ="PDTPeso">Estado</label>
                           <form:select path="estado">
                                                    <form:option value="Tramitado">Tramitado</form:option>
                                                    <form:option value="Entregado">Entregada</form:option>
                                                  
                                                    
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
