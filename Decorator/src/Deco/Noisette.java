package Deco;

// Classe représentant un décorateur ajoutant de la saveur de noisette à une boisson
public class Noisette extends Decorateur {

    // Constructeur prenant une boisson à décorer en paramètre
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    // Re modifie la méthode description pour inclure "Noisette" dans la description de la boisson
    public String description() {
        return boisson.description() + ", Noisette";
    }

    // Re modifie la méthode cout pour ajouter le coût de la saveur de noisette au coût de la boisson
    public double cout() {
        return boisson.cout() + 10; // Ajoute 10 au coût de la boisson pour la saveur de noisette
    }
}
