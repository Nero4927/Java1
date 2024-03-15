<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Ajouter une Mati�re</title>
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

        input[type="text"] {
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
    <h1>Ajouter une Mati�re</h1>
    
    <!-- Formulaire d'ajout de mati�re -->
    <form action="AjouterMatiere" method="POST">
        <label for="id">ID :</label>
        <input type="text" id="id" name="id">
        
        <label for="matiere">Mati�re :</label>
        <input type="text" id="matiere" name="matiere">
        
        <button type="submit">Ajouter</button>
    </form>
</body>
</html>
