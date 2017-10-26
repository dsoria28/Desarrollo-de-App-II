/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.utng.dsoria.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.utng.dsoria.dom.ActoDOM;
import mx.utng.dsoria.model.Acto;

/**
 *
 * @author MENDOZA
 */
@WebServlet("/ActoController")

public class ActoController extends HttpServlet {
    private Acto acto;
    private List<Acto> actos;
    private ActoDOM actoDOM;

    public ActoController() {
        super();
        acto = new Acto();
        actos = new ArrayList();
        actoDOM = new ActoDOM();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btn_guardar") != null) {
            acto.setFecha(request.getParameter("fecha"));
            acto.setCod(request.getParameter("cod"));
            if(acto.getId().equals("0")){
                acto.setId(request.getParameter("id"));
                actoDOM.add(acto);
            }else{
                actoDOM.update(acto);
            }
            actos= actoDOM.getAll();
            request.setAttribute("actos", actos);
            request.getRequestDispatcher("actos_list.jsp").forward(request, response);
        } else if (request.getParameter("btn_nuevo") != null) {
            acto = new Acto();
            request.getRequestDispatcher("acto_form.jsp").
                    forward(request, response);
        } else if (request.getParameter("btn_editar") != null) {
            try {
                String id = request.getParameter("id");
                acto = actoDOM.finById(id);
            } catch (IndexOutOfBoundsException e) {
                acto = new Acto();
            }
            request.setAttribute("acto", acto);
            request.getRequestDispatcher("acto_form.jsp").forward(request, response);
        } else if (request.getParameter("btn_eliminar") != null) {
            try {
                String id = request.getParameter("id");
                actoDOM.delete(id);

            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            actos = actoDOM.getAll();
            request.setAttribute("actos", actos);
            request.getRequestDispatcher("actos_list.jsp").forward(request, response);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
