package Models;

public class Compte {

		Integer id;
		String login;
		String password;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Compte() {
	        
	    }
		public Compte(Integer id, String login, String password) {
			super();
			this.id = id;
			this.login = login;
			this.password = password;
		}
		public Compte(Integer id) {
			this.id = id;
		}
}
