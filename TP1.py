class ArbreBinaire:
    def _init_(self, clef=None, gauche=None, droite=None):
        self.clef = clef
        self.gauche = gauche
        self.droite = droite

    def estVide(self):
        return self.clef is None and self.gauche is None and self.droite is None

    def inserer(self, clef):
        if self.estVide():
            self.clef = clef
            self.gauche = ArbreBinaire()
            self.droite = ArbreBinaire()
        else:
            if clef < self.clef:
                self.gauche.inserer(clef)
            elif clef > self.clef:
                self.droite.inserer(clef)

    def taille(self):
        if self.estVide():
            return 0
        else:
            return 1 + self.gauche.taille() + self.droite.taille()

    def rechercher(self, clef):
        if self.estVide():
            return False
        if self.clef == clef:
            return True
        elif clef < self.clef:
            return self.gauche.rechercher(clef)
        else:
            return self.droite.rechercher(clef)

class Main:
    def _init_(self):
        self.arbre = ArbreBinaire()

    def construire_arbre(self, valeurs):
        for valeur in valeurs:
            self.arbre.inserer(valeur)

    def afficher_taille(self):
        print(f"Taille de l'arbre: {self.arbre.taille()}")

    def rechercher_valeur(self, valeur):
        result = self.arbre.rechercher(valeur)
        if result:
            print(f"La valeur {valeur} a été trouvée dans l'arbre.")
        else:
            print(f"La valeur {valeur} n'a pas été trouvée dans l'arbre.")

if __name__ == "_main_":
    valeurs = [7, 3, 9, 2, 5, 8, 10]
    main = Main()
    main.construire_arbre(valeurs)
    main.afficher_taille()
    main.rechercher_valeur(5)
    main.rechercher_valeur(4)