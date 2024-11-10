package fr.xavier_maziere.jee;

import java.io.IOException;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/afficherColis")
public class AfficherColisServelet extends HttpServlet {
    @EJB
    private Operation ejb;

    public AfficherColisServelet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Colis colis = ejb.getColis(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/afficherColis.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }

}
