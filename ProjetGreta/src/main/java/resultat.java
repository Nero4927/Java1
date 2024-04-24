import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class resultat
 */
public class resultat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Compteur</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>Compteur</h1>\r\n"
				+ "    <form action=\"Connexion\" method=\"post\">\r\n"
				+ "        <label for=\"user\">Nom:</label><br>\r\n"
				+ "        <input type=\"text\" id=\"user\" name=\"user\"><br>\r\n"
				+ "        <label for=\"NbHeures\">NbHeures:</label><br>\r\n"
				+ "        <input type=\"NbHeures\" id=\"NbHeures\" name=\"NbHeures\"><br>\r\n"
				+ "        <button type=\"submit\">Créer cette matière</button>\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
