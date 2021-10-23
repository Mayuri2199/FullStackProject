<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register </title>
	<!--
    Template 2105 Input
	http://www.tooplate.com/view/2105-input
	-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>
<form action="studenteducationprofile" method="post">
<body id="register">
<%
HttpSession httpSession=request.getSession();
String tempid=(String)httpSession.getAttribute("tempid");

request.setAttribute("etempid", tempid);

%>
<a href="studenteducationprofile?etempid=<%=(String)request.getAttribute("tempid") %>"></a>

    <div class="container">
        <div class="row tm-register-row">
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-register-col-l">
                <form action="" method="post">
            <!--         <div class="mb-2">
                        <label class="mr-4">
                            <input class="with-gap" name="title" type="radio" value="mr" />
                            <span>Mr.</span>
                        </label>
                        <label class="mr-4">
                            <input class="with-gap" name="title" type="radio" value="ms" />
                            <span>Ms.</span>
                        </label>
                        <label>
                            <input class="with-gap" name="title" type="radio" value="mrs" />
                            <span>Mrs.</span>
                        </label>
                    </div>
 -->                      <div class="input-field">
                        <input placeholder="EID" id="EID" name="eid" type="text"   >
                    </div>
                    
 
 
                    <div class="input-field">
                        <input placeholder="Stream" id="gstream" name="gstream" type="text"   >
                    </div>
                    <div class="input-field">
                        <input placeholder="percentage" id="percentage" name="percentage" type="text" >
                    </div>
                    <div class="input-field">
                        <input placeholder="polymarks/12th" id="polymarks" name="polymarks" type="text" >
                    </div>
                   
                    <div class="input-field">
                        <input placeholder="be marks" id="be marks" name=bemarks marks type="text" >
                    </div>
                   
                   
                    <div class="input-field">
                        <input placeholder="UniqueId" id="UniqueId" name="UniqueId" type="text" >
                    </div>
                    <div class="input-field">
                        <input placeholder="Pincode" id="pincode" name="pincode" type="text" >
                    </div>
                    
                        
                    <div class="text-right mt-4">
                        <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text">SUBMIT</button>
                    </div> 
              <%
              String msg=(String)request.getAttribute("msg");
              if(msg!=null){
              %>
                 
                    <div class="text-right mt-4">
                    <p class="green-text"> You Have Register Sucessfully. </p>
                    
                    </div>
              <%
              }
              
              %>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-register-col-r">
                <header class="mb-5">
                    <h3 class="mt-0 text-white">Education Details</h3>
                    <p class="grey-text"> 
                    Be a Part Of Next Exciallance!!!</p>
                    <p class="grey-text">   </p>
                </header>

            </div>
        </div>
        <footer class="row tm-mt-big mb-3">
            <div class="col-xl-12">
             
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