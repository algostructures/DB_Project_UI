<%--
  Created by IntelliJ IDEA.
  User: prajapas
  Date: 7/24/2017
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DMS : Admin</title>
    <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>
    <script src="https://use.fontawesome.com/9d0c2e3dbb.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
<nav class='navbar navbar-inverse navbar-fixed'>
    <div class='container-fluid'>
        <div class='navbar-header'>
            <a class='navbar-brand' href='#'>DMS</a>
        </div>
        <ul class='nav navbar-nav'>
            <li><a href='Home.jsp'><span class= " glyphicon glyphicon-home" aria-hidden = "true"></span> Home</a></li>
            <li><a href='ViewOperator.jsp'><span class= "glyphicon glyphicon-user" aria-hidden = "true"></span> Operators</a></li>
            <li><a href='ViewVehicle.jsp'><i class="fa fa-car" aria-hidden="true"></i> Vehicle</a></li>
            <li class="active"><a href='ViewSpareParts.jsp'><i class="fa fa-wrench" aria-hidden="true"></i> SpareParts</a></li>
            <li><a href='#'><i class="fa fa-list-alt" aria-hidden="true"></i> Orders</a></li>
            <li><a href='ViewService.jsp'><i class="fa fa-cog" aria-hidden="true"></i> Service</a></li>
            <li><a href='AboutUs.jsp'><i class="fa fa-address-book" aria-hidden="true"></i> About</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a id="login-link">
                <span class="glyphicon glyphicon-log-in"></span> <%=session.getAttribute("username")%></a>
            </li>
        </ul>
    </div>
</nav>
<div class="row">
    <div class="col-sm-2">
        <ul class="nav nav-pills nav-stacked">
            <li><a href='ViewSpareParts.jsp'><i class="fa fa-wpforms" aria-hidden="true"></i> View</a></li>
            <li class = 'active'><a href='AddSpareParts.jsp'><i class="fa fa-plus" aria-hidden="true"></i> Add</a></li>
            <li><a href='#'><i class="fa fa-minus" aria-hidden="true"></i> Remove</a></li>
        </ul>
    </div>
    <div class = "col-sm-8">
        <form action="../AddSpare" method="post">
            <div class = "form-group row">
                <label for="OrderID" class="col-sm-2 col-form-label">Order ID</label>
                <div class="col-sm-10">
                    <input class="form-control"  type="text"  id="OrderID" name="oid">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Vehicle_Model" class="col-sm-2 col-form-label">Vehicle Model</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" id="Vehicle_Model" name="vm">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Spare_Part_ID" class="col-sm-2 col-form-label">Spare Part ID</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" id="Spare_Part_ID" name="spi">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Spare_Part_Name" class="col-sm-2 col-form-label">Spare Parts Name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text"  id="Spare_Part_Name" name="spn">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Units" class="col-sm-2 col-form-label">Units</label>
                <div class="col-sm-10">
                    <input class="form-control" type="number" value="0" id="Units" name="units">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Price" class="col-sm-2 col-form-label">Price</label>
                <div class="col-sm-10">
                    <input class="form-control" type="number" value="0" id="Price" name="price">
                </div>
            </div>
            <div class = "form-group row">
                <label for="Tax" class="col-sm-2 col-form-label">Tax</label>
                <div class="col-sm-10">
                    <input class="form-control" type="number" value="0" id="Tax" name="tax">
                </div>
            </div>
            <div class="form-group row">
                <label for="example-date-input" class="col-sm-2 col-form-label">Date</label>
                <div class="col-sm-10">
                    <input class="form-control" type="date" value="2011-08-19" id="example-date-input" name="date">
                </div>
            </div>
            <button type="submit" class="btn btn-success">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
