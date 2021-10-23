<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    
    <link rel="stylesheet" type="text/css" href="my.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="css/materialize.min.css">
<link rel="stylesheet" type="text/css" href="css/tooplate.css">

</head>

<body id="login">
<form action="loginservelet "  method="post">
<%
String msg=(String)request.getAttribute("msg");
if(msg!=null){
	
out.println(msg);
}

%>
    <div class="container">
        <div class="row tm-register-row tm-mb-35">
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-l">
                <form action="" method="post" class="tm-bg-black p-5 h-100">
                <header class="font-weight-light tm-bg-black p-5 h-100">
                    <div class="input-field">
                        <input placeholder="Username" id="username" name="username" type="text" class="validate">
                    </div>
                    <div class="input-field mb-5">
                        <input placeholder="Password" id="password" name="password" type="password" class="validate">
                    </div>
                    <div class="row">
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-6 pl-0 tm-pr-xs-0">
                            <select name="Designation">
                                <option >Admin</option>
                                <option >Student</option>
                                 </select>
                        </div>
                    
                    
                    <div class="tm-flex-lr">
                        <a href="#" class="black-text small">Forgot Password?</a>
                        <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text rounded-0">Login</button>
                    </div>
                </header>
                </form>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-r">
                <header class="font-weight-light tm-bg-black p-5 h-100">
                    <h3 class="mt-0 text-white font-weight-light">Your Login</h3>
                    <p>Wi,group Placement Portal!!!.</p>
                    <p class="mb-0">Coming together is a beginning; keeping together is progress; working together is success. ...Be a Part Of Your Growth</p>
 						<p></p>
                <h5 class="mt-0 text-white font-weight-light">Wi,Group...</h5>
               
                </header>
            </div>
        </div>
        <div class="row">
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 ml-auto mr-0 text-center">
                <a href="register.jsp" class="waves-effect btn-large btn-large-white px-4 black-text rounded-0">Create New Account</a>
            </div>
        </div>
        <footer class="row tm-mt-big mb-3">
            <div class="col-xl-12 text-center">
                <p class="d-inline-block tm-bg-black white-text py-2 tm-px-5">
                    Copyright &copy; 2018 Company Name 
                    
                    - <a rel="nofollow" href="http://www.tooplate.com/view/2105-input">Input</a> by 
                    <a rel="nofollow" href="http://tooplate.com" class="tm-footer-link">Tooplate</a>
                </p>
            </div>
        </footer>
    </div>
</form>
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script>
        $(document).ready(function () {
            $('select').formSelect();
        });
    </script>

</body>

</html>