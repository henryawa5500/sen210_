<%-- 
    Document   : index
    Created on : Apr 27, 2023, 2:24:20 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="Shaggi" method="post" align="center">
            <h1>Login Page</h1>
            <h3 style="color:red; text-align: center">${error}</h3>
            <div>
                <label for="uname"><b>Email: </b></label>
                <input type="email" placeholder="abc@gmail.com" name="email" id="uname"required>

                <p><label for="psw"><b>Password:</b></label>
                    <input type="password" placeholder="🔒" name="psw" id="psw" required style="text-align: center"></p> 
                <button>Login</button><br>
            </div>
        </form>
    </body>
</html>
