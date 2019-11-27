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
        <title>Gestión Productos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            /* footer */

            .footer-style {
                padding-top: 50px;
                background-color: #1e364e;
            }
            footer {
                color: white;
            }
            footer h3 {
                margin-bottom: 30px;
                font-weight: 800;
            }
            footer .footer-above {
                padding-top: 50px;
                background-color: #2C3E50;
            }
            footer .footer-col {
                margin-bottom: 50px;
            }
            footer .footer-below {
                padding: 25px 0;
                background-color: #233140;
            }
        </style>
    </head>
    <body>

        <div class="container">   
            <div class="row">
                <div class="jumbotron" style="margin-top: 20px">
                    <center><h1>Admin Ventas!</h1></center>
                    <hr/>
                    <p>Administra tus vestas de la manera mas eficaz.</p>

                </div>
                <div class="panel panel-default">
                    <div class="panel-body">

                        <div class="col-md-4">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Usuarios</h3>
                                </div>
                                <div class="panel-body">
                                    <p>Aqui podra realizar la gestion de usuarios.</p>
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
                                    <p>Aqui podra realizar la gestion de productos.</p>
                                    <a href="viewProductos" class="btn btn-success"><i class="glyphicon glyphicon-check"></i>Ir</a>
                                </div>
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
                <footer class="text-center footer-style">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-4 footer-col">
                                <h3>Dirección</h3>
                                <p>
                                    Suba
                                </p>
                            </div>
                            <div class="col-md-4 footer-col">
                                <h3>Mis redes</h3>
                                <ul class="list-inline">
                                    <li>
                                        <a  target="_blank" href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                                    </li>

                                    <li>
                                        <a  target="_blank" href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                                    </li>
                                    <li>
                                        <a  target="_blank" href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                                    </li>
                                    <li>
                                        <a  target="_blank" href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                                    </li>
                                </ul>
                            </div>
                            <div class="col-md-4 footer-col">
                                <h3>VentasSpringMVC</h3>
                                <p>Integración Continua</p>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>  
    </body>
</html>
