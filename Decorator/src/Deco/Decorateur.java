package Deco;
abstract class Decorateur implements Boisson {
	// Référence à la boisson à décorer
    protected Boisson boisson;
 // Constructeur prenant boisson a décorer comme paramètre
    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
}