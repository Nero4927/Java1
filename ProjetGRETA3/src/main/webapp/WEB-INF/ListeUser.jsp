<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*, Models.CompteDAO, Models.Compte, Models.Matiere, Models.MatiereDAO"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8"/>
    <title>Liste Utilisateurs et Matières</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            padding: 2rem;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 2rem;
        }

        th, td {
            padding: 0.75rem;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        th:first-child, td:first-child {
            width: 30%;
        }

        th:nth-child(2), td:nth-child(2) {
            width: 30%;
        }

        th:nth-child(3), td:nth-child(3), th:nth-child(4), td:nth-child(4) {
            width: 15%;
        }

        .button {
            display: inline-block;
            padding: 0.5rem 1rem;
            font-size: 1rem;
            border: none;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 0.25rem;
        }

        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Liste des Utilisateurs</h1>
    <p>Vous êtes connecté : <b><%= session.getAttribute("a") %></b></p>
    <!-- Lien pour la déconnexion -->
	<form action="Deconnexion">
    	<button type="submit" class="button">Déconnexion</button>
	</form>
    <table>
        <thead>
            <tr>
                <th>Identifiant</th>
                <th>Mot de passe</th>
                <th>Modifier</th>
                <th>Supprimer</th>
            </tr>
        </thead>
        <tbody>
        <a href="Ajouter" type="button" class="button">Ajouter utilisateur</a>
            <%  
            CompteDAO compteDAO = new CompteDAO();
            ArrayList<Compte> listUtilisateurs = compteDAO.Afficher();
            for (Compte compte : listUtilisateurs) {
            %>
            <tr>
                <td><%= compte.getLogin() %></td>
                <td><%= compte.getPassword() %></td>
                <td><a href="Modifier?id=<%= compte.getId() %>" class="button">Modifier</a></td>
                <td><a href="Supprimer?id=<%= compte.getId() %>" class="button">Supprimer</a></td>
            </tr>
            <% } %>
        </tbody>
    </table>

    <h1>Liste des Matières</h1>  

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Matières</th>
                <th>Modifier</th>
                <th>Supprimer</th>
            </tr>
        </thead>
        <tbody>
        <a href="AjouterMatiere" type="button" class="button">Ajouter Matière</a>
            <%  
            MatiereDAO matiereDAO = new MatiereDAO();
            ArrayList<Matiere> listMatiere = matiereDAO.AfficherMatiere();
            for (Matiere matiere : listMatiere) {
            %>
            <tr>
                <td><%= matiere.getId() %></td>
                <td><%= matiere.getMatiere() %></td>
                <td><a href="ModifierMatiere?id=<%= matiere.getId() %>" class="button">Modifier</a></td>
                <td><a href="SupprimerMatiere?id=<%= matiere.getId() %>" class="button">Supprimer</a></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
