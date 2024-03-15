package Controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Models.Compte;
import Models.CompteDAO;


public class Modifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modifier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String a = request.getParameter("id");
		Compte C = new Compte (new Integer(a), "", "");
		CompteDAO D = new CompteDAO ();
		
		C=D.recuperer(C);
		request.setAttribute("login", C.getLogin());
		request.setAttribute("password", C.getPassword());
		
		getServletContext().getRequestDispatcher("/WEB-INF/Modifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String a = request.getParameter("id");
		String b = request.getParameter("username");
		String c = request.getParameter("password");
		Compte C = new Compte (new Integer(a), b, c);
		CompteDAO D = new CompteDAO ();
		
		D.modifier(C);
		
		getServletContext().getRequestDispatcher("/WEB-INF/ListeUser.jsp").forward(request, response);
		
			
		}

}
