package Deco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sélection du café de base
        System.out.println("Choisissez votre café de base:");
        System.out.println("1. Café");
        System.out.println("2. Café au Lait");
        int choixCafe = scanner.nextInt();

        Boisson cafe = null;

        switch (choixCafe) {
            case 1:
                cafe = new Cafe(); // Sélection du café simple
                break;
            case 2:
                cafe = new Lait(new Cafe()); // Sélection du café au lait
                break;
            default:
                System.out.println("Choix invalide.");
                System.exit(1);
        }

        // Ajout d'ingrédients supplémentaires
        while (true) {
            System.out.println("Voulez-vous ajouter des ingrédients supplémentaires ? (O/N)");
            String reponse = scanner.next();

            if (reponse.equalsIgnoreCase("O")) {
                System.out.println("Sélectionnez un ingrédient supplémentaire:");
                System.out.println("1. Lait");
                System.out.println("2. Sucre");
                System.out.println("3. Caramel");
                int choixIngredient = scanner.nextInt();

                switch (choixIngredient) {
                    case 1:
                        cafe = new Lait(cafe); // Ajout de lait
                        break;
                    case 2:
                        cafe = new Sucre(cafe); // Ajout de sucre
                        break;
                    case 3:
                        cafe = new Caramel(cafe); // Ajout de caramel
                        break;
                    default:
                        System.out.println("Choix invalide.");
                        System.exit(1);
                }
            } else if (reponse.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Réponse invalide.");
                System.exit(1);
            }
        }

        scanner.close();

        // Affichage de la description et du coût final de la boisson personnalisée
        System.out.println("Description de la boisson: " + cafe.description());
        System.out.println("Coût de la boisson: " + cafe.cout());
    }
}
