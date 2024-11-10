package fr.xavier_maziere.jee;

import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/supprimerColis")
public class SupprimerColisServelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private Operation operation;

    public SupprimerColisServelet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id != null) {
            operation.deleteColis(Long.parseLong(id));
        }
        response.sendRedirect(request.getContextPath() + "/listColis?editer=1");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
