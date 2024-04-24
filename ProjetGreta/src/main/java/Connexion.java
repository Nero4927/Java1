import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import Models.Compte;
import Models.CompteDAO;


/**
 * Servlet implementation class Connexion
 */
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a = request.getParameter("login");
		String b = request.getParameter("password");
		Compte C = new Compte (0, a, b);
		CompteDAO D = new CompteDAO ();
		
		if (D.existe(C)) {
			HttpSession s=request.getSession();
			s.setAttribute("a", a);
			HttpSession d=request.getSession();
			d.setAttribute("b", b);
			response.sendRedirect("ListeUser.jsp");
			}else {
			response.sendRedirect("Launch?error=pasmath");
			}
		
			
		}

}
