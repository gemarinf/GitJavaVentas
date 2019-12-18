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
                            <div class="col-md-2">
                                <a href="viewemp" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i>Ir</a>
                            </div>
                            <div class="col-md-3">
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                    Login
                                </button>
                            </div>
                            <div class="col-md-3">
                                <c:if test="${user.USUUsuario eq 'ADMIN'}">
                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalU">
                                        NewUser
                                    </button>
                                </c:if>                              
                            </div>
                            <div class="col-md-4">
                                <p>Bienvenido: ${user.USUUsuario}</p>
                                <c:if test="${message !=  null}">
                                    <p>
                                        Mensaje: ${message}
                                    </p>
                                </c:if>
                            </div>

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
                <!--login-->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">Login</h4>
                            </div>
                            <div class="modal-body">
                                <form:form method="post" action="login" >
                                    <div class="form-group">
                                        <label for = "USUUsuario">Usuario: </label>
                                        <form:input path="USUUsuario" class="form-control"/>
                                    </div>
                                    <div class="form-group">
                                        <label for = "USUPassword">Clave: </label>
                                        <form:input path="USUPassword" type="password" class="form-control"/>
                                    </div>

                                    <div class="form-group">
                                        <center><input type="submit" value="Login" class="btn btn-success"/></center>
                                    </div>

                                </form:form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!--bew usuaio-->
                <div class="modal fade" id="myModalU" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">Nuevo Usuario</h4>
                            </div>
                            <div class="modal-body">
                                <form:form method="post" action="newUser" >
                                    <div class="form-group">
                                        <label for = "USUUsuario">Usuario: </label>
                                        <form:input path="USUUsuario" class="form-control"/>
                                    </div>
                                    <div class="form-group">
                                        <label for = "USUPassword">Clave: </label>
                                        <form:input path="USUPassword" type="password" class="form-control"/>
                                    </div>
                                    <div class="form-group">
                                        <label for = "USUTipo">Tipo: </label>
                                        <form:input path="USUTipo"  class="form-control"/>
                                    </div>

                                    <div class="form-group">
                                        <center><input type="submit" value="Guardar" class="btn btn-success"/></center>
                                    </div>
                                </form:form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>  
    </body>
</html>
