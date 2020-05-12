package com.recofy.controller;

import com.recofy.DAO.UsuarioDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("txtEmail");
        String senha = request.getParameter("txtSenha");
        String pagina;

        List<Object> res;
        UsuarioDAO userDAO = new UsuarioDAO();
        res = userDAO.read(null);

        if(email.equals("dmy_s@hotmail.com") && senha.equals("1234")) {

            request.getSession().setAttribute("Usuario", res.get(0));

            pagina = "/myaccount.jsp";
        } else {
            request.setAttribute("erroSTR", "Email / Senha não encontrados");
            pagina = "/error.jsp";
        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher(pagina);
        disp.forward(request, response);
    }


}
