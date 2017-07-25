<%--
  Created by IntelliJ IDEA.
  User: prajapas
  Date: 7/24/2017
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DMS : Admin</title>
    <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>
</head>
<body>
<nav class='navbar navbar-inverse navbar-fixed'>
    <div class='container-fluid'>
        <div class='navbar-header'>
            <a class='navbar-brand' href='#'>DMS</a>
        </div>
        <ul class='nav navbar-nav'>
            <li  class='active'><a href='pages\Home.jsp'>Home</a></li>
            <li><a href='#'>Operators</a></li>
            <li><a href='#'>Vehicle</a></li>
            <li><a href='#'>SpareParts</a></li>
            <li><a href='#'>Orders</a></li>
            <li><a href='#'>About</a></li>
        </ul>
    </div>
</nav>
<div class="row">
    <div class="col-sm-2">
        <ul class="nav nav-pills nav-stacked">
            <li class = 'active'><a href='ViewSpareParts.jsp'>View</a></li>
            <li><a href='AddSpareParts.jsp'>Add</a></li>
            <li><a href='#'>Remove</a></li>
        </ul>
    </div>
    <div class = "col-sm-8">

    </div>
</div>
</body>
</html>
