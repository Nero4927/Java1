package builder;

public class Builder {
     String coffeeType; // Obligatoire
     boolean milk = false; // Par défaut, pas de lait
     boolean sugar = false; // Par défaut, pas de sucre
     boolean chocolate = false; // Par défaut, pas de chocolat
     String milkType = "regular"; // Par défaut, lait régulier

    public Builder(String coffeeType) { // Le type de café est obligatoire
        this.coffeeType = coffeeType;
    }

    public Builder addMilk() {
        this.milk = true;
        return this;
    }

    public Builder setMilkType(String milkType) {
        this.milkType = milkType;
        return this;
    }

    public Builder addSugar() {
        this.sugar = true;
        return this;
    }

    public Builder addChocolate() {
        this.chocolate = true;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(this);
    }
}
