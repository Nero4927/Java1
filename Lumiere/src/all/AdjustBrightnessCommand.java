package all;

public class AdjustBrightnessCommand implements Command {
    private Light light;
    private int previousBrightness;
    private int newBrightness;

    public AdjustBrightnessCommand(Light light, int newBrightness) {
        this.light = light;
        this.newBrightness = newBrightness;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness(); // Obtenir la luminosité actuelle
        light.setBrightness(newBrightness); // Définir la nouvelle luminosité
    }

    @Override
    public void undo() {
        light.setBrightness(previousBrightness); // Rétablir la luminosité précédente
    }
}
