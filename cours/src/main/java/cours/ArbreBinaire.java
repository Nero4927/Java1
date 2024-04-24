package cours;

public class ArbreBinaire {
    private Integer clef;
    private ArbreBinaire gauche;
    private ArbreBinaire droite;
    private static ArbreBinaire arbreVide;

    // Constructeur
    public ArbreBinaire() {
        this.clef = null;
        this.gauche = null;
        this.droite = null;
    }

    // Singleton pour l'arbre vide
    public static ArbreBinaire creer() {
        if (arbreVide == null) {
            arbreVide = new ArbreBinaire();
        }
        return arbreVide;
    }

    // Getters et setters
    public Integer getClef() {
        return clef;
    }

    public void setClef(Integer clef) {
        this.clef = clef;
    }

    public ArbreBinaire getGauche() {
        return gauche;
    }

    public void setGauche(ArbreBinaire gauche) {
        this.gauche = gauche;
    }

    public ArbreBinaire getDroite() {
        return droite;
    }

    public void setDroite(ArbreBinaire droite) {
        this.droite = droite;
    }

    // Méthode pour vérifier si l'arbre est vide
    public boolean estVide() {
        return clef == null && gauche == null && droite == null;
    }

    // Méthode pour calculer la taille de l'arbre
    public int taille() {
        if (estVide()) {
            return 0;
        }
        return 1 + (gauche == null ? 0 : gauche.taille()) + (droite == null ? 0 : droite.taille());
    }

    // Méthode pour insérer une valeur dans l'arbre
    public void inserer(Integer valeur) {
        if (clef == null) {
            clef = valeur;
            gauche = creer();
            droite = creer();
        } else {
            if (valeur < clef) {
                if (gauche == null) {
                    gauche = new ArbreBinaire();
                }
                gauche.inserer(valeur);
            } else if (valeur > clef) {
                if (droite == null) {
                    droite = new ArbreBinaire();
                }
                droite.inserer(valeur);
            }
        }
    }

    // Méthode pour rechercher une valeur dans l'arbre
    public boolean rechercher(Integer valeur) {
        if (clef == null) {
            return false;
        }
        if (clef.equals(valeur)) {
            return true;
        } else if (valeur < clef && gauche != null) {
            return gauche.rechercher(valeur);
        } else if (valeur > clef && droite != null) {
            return droite.rechercher(valeur);
        }
        return false;
    }

    // Méthode pour afficher l'arbre (parcours préfixe)
    public void afficher() {
        if (!estVide()) {
            System.out.print(clef + " ");
            if (gauche != null) {
                gauche.afficher();
            }
            if (droite != null) {
                droite.afficher();
            }
        }
    }

    // Main pour tester l'application
    public static void main(String[] args) {
        ArbreBinaire arbre = new ArbreBinaire();
        
        // Insertion de valeurs dans l'arbre
        arbre.inserer(10);
        arbre.inserer(5);
        arbre.inserer(15);
        arbre.inserer(3);
        arbre.inserer(8);
        arbre.inserer(12);
        arbre.inserer(18);
        
        // Affichage de l'arbre
        System.out.println("Arbre après insertion des valeurs :");
        arbre.afficher();
        System.out.println();
        
        // Test de la méthode de recherche
        System.out.println("Recherche de la valeur 8 dans l'arbre : " + arbre.rechercher(8));
        System.out.println("Recherche de la valeur 20 dans l'arbre : " + arbre.rechercher(20));
        
        // Test de la méthode estVide
        System.out.println("Est-ce que l'arbre est vide ? " + arbre.estVide());
        
        // Test de la méthode taille
        System.out.println("Taille de l'arbre : " + arbre.taille());
    }
}
