package Deco;

public class Lait extends Decorateur {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    public String description() {
        return boisson.description() + ", Lait";
    }

    public double cout() {
        return boisson.cout() + 7.5;
    }
}