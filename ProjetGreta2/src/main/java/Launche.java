import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Launche") // Remplacez par votre propre URL
public class Launche extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3384764500040224001L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String targetPage = "/Login.jsp"; // Chemin relatif à votre webapp ou absolu si nécessaire
        response.sendRedirect(request.getContextPath() + targetPage);
    }
}
