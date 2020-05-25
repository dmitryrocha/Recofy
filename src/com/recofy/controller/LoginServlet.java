package com.recofy.controller;

import com.recofy.DAO.DataSource;
import com.recofy.DAO.UsuarioDAO;
import com.recofy.model.Usuario;

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
        Usuario incompleto = new Usuario();
        incompleto.setEmail(email);
        incompleto.setSenha(senha);
        String pagina = "/error.jsp";
        DataSource ds;

        try{
            ds = new DataSource();
            UsuarioDAO userDAO = new UsuarioDAO(ds);
            List<Object> res = userDAO.read(incompleto);
            if(res != null && res.size() > 0) {
                pagina = "/myaccount.jsp";
                request.getSession().setAttribute("Usuario", res.get(0));
            } else {
                request.setAttribute("erroSTR", "Usuário / Senha inválidos");
            }
            ds.getConnection().close();
        } catch (Exception ex) {
            request.setAttribute("erroSTR", "Deu erro ao recuperar seu usuário");
        }


        RequestDispatcher disp = getServletContext().getRequestDispatcher(pagina);
        disp.forward(request, response);
    }


}
