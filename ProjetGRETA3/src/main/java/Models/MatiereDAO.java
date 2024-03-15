package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MatiereDAO {

	public boolean existe (Matiere f)  {
		int nb=0;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projetgreta",
                "root",
                "") ;
           System.out.println("Connexion réussie!");
           
           Statement s=connection.createStatement();
           ResultSet res=s.executeQuery("select count(*) as nb from Matiere where id='"+f.getId()+"' and matiere = '"+f.getMatiere()+"' limit 1 ");
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
	
	
	public void ajoute (Matiere f)  {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projetgreta",
                "root",
		                "") ;
           System.out.println("Connexion réussie!");
           
           Statement s=connection.createStatement();
           System.err.println("INSERT INTO matiere (id, matiere) VALUES ('"+f.getId()+"', '"+f.getMatiere()+"')");
           s.executeUpdate("INSERT INTO matiere (id, matiere) VALUES ('"+f.getId()+"', '"+f.getMatiere()+"')");
           System.out.println("Matière ajouté");
           

           
       } catch (ClassNotFoundException ex) {
    	   System.err.println("Erreur avec le driver");
           ex.printStackTrace();
       }catch(SQLException e ) {
    	   System.err.println("Autre erreur que le driver.");
    	   e.printStackTrace();}
	   }
		
		
		
		
		public ArrayList<Matiere> AfficherMatiere ()  {
			ArrayList<Matiere> listMatiere=new ArrayList<Matiere>();
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/projetgreta",
	                "root",
			                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("select * from matiere");
	           ResultSet r=s.executeQuery("select * from matiere");
	           System.out.println("Matière afficher");
	           while(r.next()) {
	        	   String matiere=r.getString("Matiere");
	        	   String id=r.getString("id");
	        	   Matiere c = new Matiere (new Integer(id), matiere);
	        	   listMatiere.add(c);
	           }

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
			return listMatiere;
		}
		
		
		
		public void supprimer (Matiere f)  {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/projetgreta",
	                "root",
			        "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("delete from matiere where id = '"+f.getId()+"'");
	           s.executeUpdate("delete from matiere where id = '"+f.getId()+"'");
	           System.out.println("Matière supprimé");
	           

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
	
		
		public void modifier (Matiere f)  {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://127.0.0.1:3306/projetgreta",
	                "root",
			                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           System.err.println("update matiere set login = ?, password = ? where id = '\"+f.getId()+\"'");
	           s.executeUpdate("update matiere set id = '"+f.getId()+"', matiere = '"+f.getMatiere()+"'");
	           System.out.println("Matière modifier");
	           

	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Autre erreur que le driver.");
	    	   e.printStackTrace();
	       }
		
	}
		
		public Matiere recuperer (Matiere f) {
			
			Matiere matt = new Matiere();
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://127.0.0.1:3306/projetgreta",
	                "root",
			                "") ;
	           System.out.println("Connexion réussie!");
	           
	           Statement s=connection.createStatement();
	           ResultSet res=s.executeQuery("select * from Matiere id='"+f.getId()+"' limit 1 ");
	           while(res.next()) {
	        	    int id=res.getInt("id");
	        	    String matiere=res.getString("matiere");
	        	 matt.setId(id);
	        	 matt.setMatiere(matiere);
	        	    
	           }
	           
	            return matt;
	           
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println("Erreur avec le driver");
	           ex.printStackTrace();
	       }catch(SQLException e ) {
	    	   System.err.println("Erreur lors de la connexion à la BDD.");
	       }
			return matt;
			
		}
	
	
}
