package fr.xavier_maziere.jee;

import java.io.IOException;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listColis")
public class ListColisServelet extends HttpServlet{
    @EJB
    private Operation ejb;

    public ListColisServelet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String editer = request.getParameter("editer");
        
        List<Colis> listColis = ejb.getAllColis();

        // response.getWriter().println("nb colis : " + listColis.size());

        request.setAttribute("colisList", listColis);
        request.setAttribute("editer", editer);
        request.getRequestDispatcher("/listeColis.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }

}
