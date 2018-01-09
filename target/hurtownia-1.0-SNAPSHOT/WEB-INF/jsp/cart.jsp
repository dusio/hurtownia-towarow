<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KubaPC1
  Date: 07.01.2018
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
</head>
<body>


<header>
    <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <a class="navbar-brand" href="#">HurtexTowarex</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="<spring:url value="/"/>">Home</a>
                </li>
                <li class="nav-item"><a class="nav-link" href="#">Products</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Help</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
            </ul>

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search"/>
                <a href="<spring:url value="/product?=${product.productId}"/>"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">sss</button></a>
            </form>

            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="#">Cart</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Account</a></li>
            </ul>
        </div>
    </nav>
    <div class="jumbotron">
        <h1 class="display-2">Your cart</h1>
    </div>
</header>

<main>
    <section>
        <div class="container">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Product name</th>
                    <th>Quantity</th>
                    <th>Price per piece</th>
                    <th>Sum</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>
                        <p><strong>Młotek</strong></p>
                        <section class="additional-info">
                            <p>Kod Towaru: 420PL</p>
                            <p>Producent: Kush</p>
                        </section>
                    </td>
                    <td><input type="number" name="quantity" min="0" max="15" step="1" value="2"></td>
                    <td>60zł</td>
                    <td>90zł</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>
                        <p><strong>Gwoździe Opakowanie 10 szt.</strong></p>
                        <section class="additional-info">
                            <p>Kod Towaru: 555ML</p>
                            <p>Producent: Manta</p>
                        </section>
                    </td>
                    <td><input type="number" name="quantity" min="0" max="15" step="1" value="1"></td>
                    <td>15zł</td>
                    <td>15zł</td>
                </tr>
                </tbody>
            </table>
        </div>

        <div class="container d-flex justify-content-between">
            <button class="btn btn-info" type="submit">Odśwież koszyk</button>
            <button class="btn btn-primary" type="button">Dodaj towar do koszyka</button>
        </div>
    </section>

    <section class="container" id="cart-summary">
        <h2 class="display-3">Podsumowanie</h2>
        <section>
            <table class="table table-success">
                <tr>
                    <td>Ilość Towarów:</td>
                    <td>2</td>
                </tr>
                <tr>
                    <td>Do zapłaty:</td>
                    <td>105zł</td>
                </tr>
            </table>
            <button class="float-right btn btn-success" type="submit">Place an order</button>
        </section>

    </section>
</main>


<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
        integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
        integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>
</body>
</html>
