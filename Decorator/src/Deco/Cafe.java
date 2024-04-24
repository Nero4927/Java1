package Deco;
public class Cafe implements Boisson {
    @Override
    public String description() {
        return "Café de base chef";
    }

   
    public double cout() {
        return 2.5;
    }
    
}