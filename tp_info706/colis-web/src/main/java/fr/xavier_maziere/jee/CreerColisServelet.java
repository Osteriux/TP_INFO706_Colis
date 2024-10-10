package fr.xavier_maziere.jee;


import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/creerColis")
public class CreerColisServelet extends HttpServlet{

    @EJB
    private Operation ejb;

    public CreerColisServelet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        float poids = Float.parseFloat(request.getParameter("poids"));
        String destination = request.getParameter("dest");
        String origine = request.getParameter("orig");
        float valeur = Float.parseFloat(request.getParameter("val"));
        double longitude = Double.parseDouble(request.getParameter("long"));
        double latitude = Double.parseDouble(request.getParameter("lat"));

        // response.getWriter().println("poids : " + poids);
        // response.getWriter().println("destination : " + destination);
        // response.getWriter().println("origine : " + origine);
        // response.getWriter().println("valeur : " + valeur);
        // response.getWriter().println("longitude : " + longitude);
        // response.getWriter().println("latitude : " + latitude);

        Colis colis = ejb.creeColis(poids, destination, origine, valeur, longitude, latitude);

        // response.getWriter().println("Colis cree : " + colis.getId());

        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/afficherColis.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }
}