<%--
  Created by IntelliJ IDEA.
  User: dmy_s
  Date: 5/11/2020
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="Usuario" type="com.recofy.model.Usuario" scope="session"/>


<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>.: Recofy, um tocador canino -- Minhas Playlists:.</title>

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
                Minhas playlists
            </h4>
        </div>
    </div>
    <div class="row" id="menu">
        <div class="col-md-2">
            &nbsp;&nbsp;
        </div>
        <div class="col-md-8">
            <ul class="nav">
                <li class="nav-item " >
                    <a class="nav-link" href="#">Nova Playlist</a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link" href="/myplaylists.jsp">Minha Playlist</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Upload Música</a>
                </li>
            </ul>
        </div>
        <div class="col-md-2">
            &nbsp;
        </div>
    </div>
    <c:forEach var="playlist" items="${Usuario.playlists}">
        <div class="row">
            <div class="col-md-2">&nbsp;</div>
            <div class="col-md-8">
                ${playlist.titulo}
                <ul>
                <c:forEach var="musica" items="${playlist.musicas}">
                    <li><strong>${musica.titulo}</strong> - ${musica.artista}</li>
                </c:forEach>
                </ul>
            </div>
            <div class="col-md-2">&nbsp;</div>
        </div>
    </c:forEach>

</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>