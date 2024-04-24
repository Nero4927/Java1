package Deco;

// Classe représentant un décorateur ajoutant du sucre à une boisson
public class Sucre extends Decorateur {

    // Constructeur prenant une boisson à décorer en paramètre
    public Sucre(Boisson boisson) {
        super(boisson);
    }

    // Re modifie la methode description de la classe boisson pour ajouter sucre 
    public String description() {
        return boisson.description() + ", Sucre";
    }

    // Re modifie la méthode cout pour ajouter le coût du sucre au coût de la boisson
    public double cout() {
        return boisson.cout() + 1; // Ajoute 1 au coût de la boisson pour le sucre
    }
}
