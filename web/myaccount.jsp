<%--
  Created by IntelliJ IDEA.
  User: dmy_s
  Date: 5/9/2020
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="Usuario" type="com.recofy.model.Usuario" scope="session"/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>.: Recofy, um tocador canino :.</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <h4 class="text-center">
                Bem vindo, ${Usuario.nome}
            </h4>
        </div>
    </div>
    <div class="row" id="conteudo">
        <div class="col-md-2">
            &nbsp;
        </div>
        <div class="col-md-8">
            <ul class="nav">
                <li class="nav-item ml-md-auto" >
                    <a class="nav-link" href="#">Nova Playlist</a>
                </li>
                <li class="nav-item ml-md-auto">
                    <a class="nav-link" href="myplaylists.jsp">Minha Playlist</a>
                </li>
                <li class="nav-item ml-md-auto">
                    <a class="nav-link" href="#">Upload Música</a>
                </li>
            </ul>
        </div>
        <div class="col-md-2">
            &nbsp;
        </div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>