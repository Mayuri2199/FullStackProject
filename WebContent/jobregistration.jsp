<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register - Input Form by Tooplate</title>
	<!--
    Template 2105 Input
	http://www.tooplate.com/view/2105-input
	-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>
<form action="studentdocument" method="post" enctype="multipart/form-data" > 

<body id="register">
    <div class="container">
        <div class="row tm-register-row">
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-register-col-l">
           
           <h2 class="mt-0 text-white"> Attach Documnets</h2>
            
            

            
            
            
                <div class="input-field">
                  <input placeholder="AdharNumber" id="adhar" type="text" name="adharid"  />
                     </div>
                
                <div class="input-field">
                  <input placeholder="RegistrationID" id="RegistrationID" type="text" name="id"  />
                     </div>
                 
                <div class="input-field">
                  <input placeholder="EbillId" id="EbillId" type="text" name="ebillid"  />
                     </div>
                
                <div class="input-field">
                  <input placeholder="Univercity Rollno" id="Univercity Rollno" type="text" name="eid"  />
                     </div>
                           
           
                <div class="input-field">
                  <h4 class="mt-0 text-white"> AdharCard</h3>
                    
                  <input placeholder="Resume" id="resume" type="file" name="adhar" size="50" />
                     </div>
                 
                 <br>
                 
                  <div class="input-field">
                  <h4 class="mt-0 text-white">  Resume</h4>
                    
                  <input placeholder="Resume" id="resume" type="file" name="resume" size="50" />
                     </div>
                 <br>
                 
                  <div class="input-field">
                  <h4 class="mt-0 text-white"> Pancard</h3>
                    
                  <input placeholder="Resume" id="resume" type="file" name="pancard" size="50" />
                     </div>
                    
                <!--  <div class="row">
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-6 pl-0 tm-pr-xs-0">
                            <select name="Designation">
                                <option >Admin</option>
                                <option >Student</option>
                                 </select>
                        </div>
                          
                        </form> 
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-6 pr-0 tm-pl-xs-0">
                            <div class="input-field">
                                <input placeholder="Zip Code" id="zipcode" name="zipcode" type="text" class="validate">
                            </div>
                        </div>
                    </div>
                 -->    
                    <div class="text-right mt-4">
                        <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text">Upload File</button>
                    </div> 

</form>
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
                    <h3 class="mt-0 text-white"> Placment Registration</h3>
                    <p class="white-text">The Journy of Our is Start from 1978 We 
                    provider exicallence in Market Be a Part Of Next Exciallance!!!</p>
                    <p class="white-text">  </p>
                </header>

            </div>
        </div>
        <footer class="row tm-mt-big mb-3">
            <div class="col-xl-12">
             
            </div>
        </footer>
    </div>


    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script>
        $(document).ready(function () {
            $('select').formSelect();
        });
    </script>
</form>
</body>

</html>