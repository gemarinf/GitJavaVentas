<%-- 
    Document   : index
    Created on : 26/11/2019
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">   
            <div class="row">
                <div class="jumbotron" style="margin-top: 20px">
                    <h1>Admin Ventas!</h1>
                    <p></p>

                </div>
                <div class="col-md-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Usuarios</h3>
                        </div>
                        <div class="panel-body">
                          <a href="viewemp" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i>Ir</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">Productos</h3>
                        </div>
                        <div class="panel-body">
                          <a href="viewProductos" class="btn btn-success"><i class="glyphicon glyphicon-check"></i>Ir</a>
                        </div>
                    </div>
                </div>
                 <div class="col-md-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">Pedidos</h3>
                        </div>
                        <div class="panel-body">
                          <a href="view_pedido" class="btn btn-success"><i class="glyphicon glyphicon-check"></i>Ir</a>
                        </div>
                    </div>
                </div>
                    <div class="col-md-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">Proveedores</h3>
                        </div>
                        <div class="panel-body">
                          <a href="view_proveedor" class="btn btn-success"><i class="glyphicon glyphicon-check"></i>Ir</a>
                        </div>
                    </div>
                </div>
                
                <!--                <div class="col-md-3" >
                                    <div class="list-group">
                                        <a href="#" class="list-group-item active">
                                            Opciones
                                        </a>
                                        <a href="viewemp" class="list-group-item">Usuarios</a>
                                        <a href="#" class="list-group-item">Productos</a>
                                    </div>
                                </div>
                                <div class="col-md-9" >
                <%--<%@include file="viewemp.jsp" %>--%>
               
            </div>-->
            </div>
        </div>  
    </body>
</html>
