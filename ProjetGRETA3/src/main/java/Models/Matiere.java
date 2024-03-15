package Models;

import java.io.Serializable;

public class Matiere implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Integer id;
		String Matiere;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMatiere() {
			return Matiere;
		}
		public void setMatiere(String matiere) {
			this.Matiere = matiere;
		}
		public Matiere() {
	        
	    }
		public Matiere(Integer a, String matiere) {
			super();
			this.id = a;
			this.Matiere = matiere;
		}
		public Matiere(Integer id) {
			this.id = id;
		}
}
