<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Modifier un compte</title>
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

        button[type="submit"] {
            background-color: #4CAF50; /* Vert */
            color: white;
            padding: .75rem 1rem;
            border: none;
            border-radius: .25rem;
            cursor: pointer;
        }

        button[type="submit"]:hover {
            background-color: #3e8e41;
        }
    </style>
</head>
<body>
    <h1>Modifier un compte</h1>
    
    <!-- Formulaire de connexion -->
    <form action="Modifier" method="POST">
        Identifiant : <input type="text" name="login"><br/>
        Mot de passe : <input type="password" name="password"><br/>
        
        <button type="submit">Modifier</button>
    </form>
</body>
</html>
