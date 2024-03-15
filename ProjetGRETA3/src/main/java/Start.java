import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Start") // Remplacez par votre propre URL
public class Start extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3384764500040224001L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String targetPage = "/WEB-INF/Login.jsp"; // Chemin relatif à votre webapp ou absolu si nécessaire
        getServletContext().getRequestDispatcher(targetPage).forward(request, response);
    }
}
