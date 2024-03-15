<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Connexion</title>
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
            padding: 1.5rem;
            box-shadow: 0 0 10px rgba(0, 0, 0, .2);
            background-color: #fff;
        }

        label {
            display: block;
            margin-bottom: .5rem;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: calc(100% - 3rem);
            padding: .75rem;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: .25rem;
            margin-bottom: 1rem;
        }

        button[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: .75rem 1.5rem;
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
    <h1>Connexion</h1>
    
    <!-- Formulaire de connexion -->
    <form action="Connexion" method="POST">
        <label for="username">Identifiant :</label>
        <input type="text" id="username" name="username">
        
        <label for="password">Mot de passe :</label>
        <input type="password" id="password" name="password">
        
        <button type="submit">Se connecter</button>
    </form>
</body>
</html>
