<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*, Models.CompteDAO, Models.Compte"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8"/>
    <title>Liste Utilisateurs</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            padding: 2rem;
        }

        form {
            max-width: 300px;
            margin: auto;
            border: 1px solid #ccc;
            padding: 1rem;
            box-shadow: 0 0 10px rgba(0, 0, 0, .2);
        }

        label {
            display: block;
            text-align: left;
            margin-bottom: .5rem;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: .75rem;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: .25rem;
        }

        th { text-align: left; padding: 5px; }
    	td { padding: 5px; }
    	.modify_btn, .delete_btn { cursor: pointer; background: none; border: none; font-size: 16px; }
    </style>
</head>
<body>
    <h1>Liste des Utilisateurs</h1>
    <!-- Tableau HTML -->
    <table border="1">
        <thead>
            <tr>
            	<th style="width: 30%;">Identifiant</th>
            	<th style="width: 30%;">Mot de passe</th>
            	<th style="width: 15%;">Modifier</th>
            	<th style="width: 15%;">Supprimer</th>
            </tr>
        </thead>
        
        <tbody>
        <a href="Add.jsp" type="button" class=".delete_btn">Ajouter utilisateur</a>
        

            
           <%  
           CompteDAO d=new CompteDAO();
           ArrayList<Compte> listUtilisateurs=d.Afficher();
           for (Compte c: listUtilisateurs){%>
                <tr>
                    <td><%= c.getLogin() %></td>
                    <td><%= c.getPassword() %></td>
                    <td><a href="Modifier.jsp?id=<%= c.getId() %>" class="modify_btn">Modifier</a></td>
                   <td> <a href="Supprimer?id=<%= c.getId() %>" class="delete_btn">Supprimer</a></td>
                </tr>
                
            <% }  %>
            
        </tbody>
    </table>
</body>
</html>
