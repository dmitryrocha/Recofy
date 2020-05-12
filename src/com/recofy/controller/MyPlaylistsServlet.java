package com.recofy.controller;

import com.recofy.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyPlaylistsServlet")
public class MyPlaylistsServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paginaRetorno;

        Usuario usuario = (Usuario)request.getSession().getAttribute("Usuario");
        if(usuario == null) {
            paginaRetorno = "index.jsp";
        } else {
            paginaRetorno = "/myplaylists.jsp";
        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher(paginaRetorno);
        disp.forward(request,response);
    }
}
