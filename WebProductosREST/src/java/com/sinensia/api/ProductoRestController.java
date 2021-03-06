/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Decoradores en forma de anotación
@WebServlet( asyncSupported = true , urlPatterns = "/api/productos")
public class ProductoRestController extends HttpServlet {

@Override
@SuppressWarnings("empty-statement")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        PrintWriter escritoRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");
        
        
        BufferedReader bufRead = request.getReader();
        
        StringBuilder textoJson = new StringBuilder();
        for (String lineaJson = bufRead.readLine();
                lineaJson != null;
               lineaJson = bufRead.readLine()){//iteración 
        
        textoJson.append(lineaJson);
        
    }
        bufRead.close();
        escritoRespuesta.println(textoJson.toString().toUpperCase());
        System.out.println(">>>>>" + textoJson.toString().toUpperCase());

   }
}
