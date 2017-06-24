<%-- 
    Document   : index
    Created on : 24/06/2017, 09:08:38
    Author     : aos
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cinemaClasses.DAOCinema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1> Filmes em cartaz! </h1>
         
         <%
             
            DAOCinema filmes = new DAOCinema();
            
            filmes.listaFilmes();
            
            out.println(filmes);
            
            ArrayList   aaa = new ArrayList();
            
            

         %>
         
    </body>
</html>
