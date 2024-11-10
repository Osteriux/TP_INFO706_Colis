package fr.xavier_maziere.jee;

import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editerColis")
public class EditerColisServelet extends HttpServlet {
    @EJB
    private Operation ejb;

    public EditerColisServelet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));

        Colis colis = ejb.getColis(id);

        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/editerColis.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        String emplacement = request.getParameter("emplacement");
        String etat = request.getParameter("etat");

        if(etat == null) {
            Colis colis = ejb.getColis(id);
            etat = colis.getEtat();
        }

        Colis colis = ejb.updatePositionColis(id, longitude, latitude, emplacement, etat);

        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/afficherColis.jsp").forward(request, response);
    }

}
