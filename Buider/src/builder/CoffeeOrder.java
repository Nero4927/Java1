package builder;

class CoffeeOrder {
    private final String coffeeType;
    private final boolean milk;
    private final boolean sugar;
    private final boolean chocolate;
    private final String milkType;

    // Constructeur privé, seulement accessible via le Builder
    CoffeeOrder(Builder builder) {
        this.coffeeType = builder.coffeeType;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.chocolate = builder.chocolate;
        this.milkType = builder.milkType;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeType='" + coffeeType + '\'' +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", chocolate=" + chocolate +
                ", milkType='" + milkType + '\'' +
                '}';
    }}
