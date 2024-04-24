package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompteDAO {

	public boolean existe (Compte C)  {
		int nb=0;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/greta",
                "root",
                "") ;
           System.out.println("Connexion réussie!");
           
           Statement s=connection.createStatement();
           ResultSet res=s.executeQuery("select count(*) as nb from compte where login='"+C.getLogin()+"' and password = '"+C.getPassword()+"' limit 1 ");
           while(res.next()) {
        	    nb=res.getInt("nb");
           }
           
           if (nb == 0) return false;
           else return true;
           
       } catch (ClassNotFoundException ex) {
    	   System.err.println("Erreur avec le driver");
           ex.printStackTrace();
       }catch(SQLException e ) {
    	   System.err.println("Erreur lors de la connexion à la BDD.");
       }
		return false;
		
	}
	
	
	public void ajoute (Compte C)  {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/greta",
                "root",
                "") ;
           System.out.println("Connexion réussie!");
           
           Statement s=connection.createStatement();
           System.err.println("INSERT INTO compte (login, password) VALUES ('"+C.getLogin()+"', '"+C.getPassword()+"')");
           s.executeUpdate("INSERT INTO compte (login, password) VALUES ('"+C.getLogin()+"', '"+C.getPassword()+"')");
           System.out.println("Compte ajouté");
           

           
       } catch (ClassNotFoundException ex) {
    	   System.err.println("Erreur avec le driver");
           ex.printStackTrace();
       }catch(SQLException e ) {
    	   System.err.println("Autre erreur que le driver.");
    	   e.printStackTrace();}
	   }
		
		
		public ArrayList<Compte> Afficher ()  {
			ArrayList<Compte> listUtilisateurs=new ArrayList<Compte>();
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/greta",
	                "root",
	                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("select * from compte");
	           ResultSet r=s.executeQuery("select * from compte");
	           System.out.println("Compte afficher");
	           while(r.next()) {
	        	   String login=r.getString("login");
	        	   String password=r.getString("password");
	        	   String id=r.getString("id");
	        	   Compte c = new Compte (new Integer(id), login, password);
	        	   listUtilisateurs.add(c);
	           }

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
			return listUtilisateurs;
		}
		
		
		public void supprimer (Compte C)  {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/greta",
	                "root",
	                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("delete from compte where id = '"+C.getId()+"'");
	           s.executeUpdate("delete from compte where id = '"+C.getId()+"'");
	           System.out.println("Compte supprimé");
	           

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
	
		
		public void modifier (Compte C)  {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/greta",
	                "root",
	                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("update compte set login = ?, password = ? where id = '\"+C.getId()+\"'");
	           s.executeUpdate("update compte set login = ?, password = ? where id = '"+C.getId()+"'");
	           System.out.println("Compte modifier");
	           

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
	
	
}
