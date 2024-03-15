package Controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/deconnexion") // Mapping de la servlet à l'URL /deconnexion
public class Deconnexion extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer la session et l'invalider
        HttpSession session = request.getSession(false); // false signifie "ne pas créer si elle n'existe pas"
        if (session != null) {
            session.invalidate();
        }

        // Rediriger vers la page d'accueil
        response.sendRedirect(request.getContextPath() + "/index.jsp"); // Assurez-vous que le chemin est correct
    }
}
