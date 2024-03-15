package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Models.Matiere;
import Models.MatiereDAO;


public class AjouterMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/WEB-INF/AddMatiere.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a = request.getParameter("id");
		String b = request.getParameter("matiere");
		Matiere f = new Matiere (new Integer(a), b);
		MatiereDAO D = new MatiereDAO ();
		
		D.ajoute(f);
		
		getServletContext().getRequestDispatcher("/WEB-INF/ListeUser.jsp").forward(request, response);
		
		
			
		}

}
