package Deco;

public class Caramel extends Decorateur {
    public Caramel(Boisson boisson) {
        super(boisson);
    }
  // on ajoute a la liste des description de boisson caramel 
    public String description() {
        return boisson.description() + ", Caramoule";
    }

    public double cout() {
        return boisson.cout() + 6.5;
    }
}