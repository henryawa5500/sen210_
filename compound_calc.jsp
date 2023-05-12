<%-- 
    Document   : compound_calc
    Created on : Apr 27, 2023, 2:28:42 PM
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
        <div align="center">
            <h4>Compound Interest Calculator</h4>
            <form action="ComputeCompoundInt" method="post">
                <h1>Hello ${email}</h1>
                <p><label for="principallabel">Principal:</label>
                    <input type="number" placeholder="principal..." name="principal" id="principallabel" value="${p}"></p>
                <p>
                    <label for="ratelabel">Interest Rate:</label>
                    <input type="number" placeholder="rate.." name="rate" id="ratelabel" value="${r}"></p>
                <p><label for="timelabel">Time/yr:</label>
                <input type="number" placeholder="time/yr.." name="time" id="timelabel" value="${t}"></p> 
                <label for="noyearlabel">No of yrs:</label>
                <input type="number" placeholder="no of yr.." name="no/yr" id="noyearlabel" value="${y}">
                <br><br>
                <button>Calculate</button>
                <p><textarea>Result:${CI}</textarea></p>
            </form>
            <% //
        //        double r= (Double)request.getAttribute("SI");
        //        if
        //    %>
          <!--<h3>Result:${SI}</h3>-->
        </div>
    </body>
</html>
