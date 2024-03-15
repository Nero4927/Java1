package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.Singleton;


public class CompteDAO {

	public boolean existe (Compte C)  {
		int nb=0;
		try {
			 Connection connection = Singleton.getInstance().getConnection();

           System.out.println("Connexion réussie!");
           
           Statement s=connection.createStatement();
           ResultSet res=s.executeQuery("select count(*) as nb from Compte where login='"+C.getLogin()+"' and password = '"+C.getPassword()+"' limit 1 ");
           while(res.next()) {
        	    nb=res.getInt("nb");
           }
           
           if (nb == 0) return false;
           else return true;
           
       } catch(SQLException e ) {
    	   System.err.println("Erreur lors de la connexion à la BDD.");
       }
		return false;
		
	}
	
	
	public void ajoute (Compte C)  {
		try {
			
				Connection connection = Singleton.getInstance().getConnection();

           
           Statement s=connection.createStatement();
           System.err.println("INSERT INTO compte (login, password) VALUES ('"+C.getLogin()+"', '"+C.getPassword()+"')");
           s.executeUpdate("INSERT INTO compte (login, password) VALUES ('"+C.getLogin()+"', '"+C.getPassword()+"')");
           System.out.println("Compte ajouté");
           

           
       } catch(SQLException e ) {
    	   System.err.println("Autre erreur que le driver.");
    	   e.printStackTrace();}
	   }
		
		
		public ArrayList<Compte> Afficher () throws ClassNotFoundException  {
			ArrayList<Compte> listUtilisateurs=new ArrayList<Compte>();
			try {
				Connection connection = Singleton.getInstance().getConnection();
	           
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

	           
	       } catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
			return listUtilisateurs;
		}
		
		
		
		public void supprimer (Compte C) throws ClassNotFoundException  {
			try {
				Connection connection = Singleton.getInstance().getConnection();
	           
	           Statement s=connection.createStatement();
	           System.err.println("delete from compte where id = '"+C.getId()+"'");
	           s.executeUpdate("delete from compte where id = '"+C.getId()+"'");
	           System.out.println("Compte supprimé");
	           

	           
	       } catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
	
		
		public void modifier (Compte C) throws ClassNotFoundException  {
			try {
				Connection connection = Singleton.getInstance().getConnection();
	           
	           Statement s=connection.createStatement();
	           System.err.println("update compte set login = ?, password = ? where id = '\"+C.getId()+\"'");
	           s.executeUpdate("update compte set login = '"+C.getLogin()+"', password = '"+C.getPassword()+"' where id = '"+C.getId()+"'");
	           System.out.println("Compte modifier");
	           

	           
	       } catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
		
		public Compte recuperer (Compte C) throws ClassNotFoundException  {
			 Compte compte = null;
			try {
				Connection connection = Singleton.getInstance().getConnection();
	           
	           Statement s=connection.createStatement();
	           ResultSet res=s.executeQuery("select * from Compte where id='"+C.getId()+"' limit 1 ");
	           while(res.next()) {
	        	    int id=res.getInt("id");
	        	    String login=res.getString("login");
	        	    String password=res.getString("password");
	        	    compte = new Compte (id, login, password);
	           }
	           
	            return compte;
	           
	       } catch(SQLException e ) {
	    	   System.err.println("Erreur lors de la connexion à la BDD.");
	       }
			return compte;
			
		}
	
	
}
