package builder;

public class CoffeeShop {
    public static void main(String[] args) {
        // Construire des commandes de café avec le pattern Builder
        CoffeeOrder order1 = new CoffeeOrder.Builder("Espresso")
                .addMilk()
                .setMilkType("almond")
                .build();

        CoffeeOrder order2 = new CoffeeOrder.Builder("Latte")
                .addMilk()
                .addSugar()
                .addChocolate()
                .build();

        CoffeeOrder order3 = new CoffeeOrder.Builder("Black Coffee").build();

        // Afficher les commandes de café
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}