package all;

public class LightingSystemTest {
    public static void main(String[] args) {
        // Création des lampes
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();

        // Création du panneau de contrôle d'éclairage
        LightControlPanel controlPanel = new LightControlPanel();
        controlPanel.addLight(livingRoomLight);
        controlPanel.addLight(kitchenLight);

        // Instanciation des objets de commande
        Command turnOnLivingRoomLightCommand = new TurnOnLightCommand(livingRoomLight);
        Command turnOffKitchenLightCommand = new TurnOffLightCommand(kitchenLight);
        Command adjustBrightnessLivingRoomCommand = new AdjustBrightnessCommand(livingRoomLight, 50);

        // Utilisation du système
        turnOnLivingRoomLightCommand.execute(); // Allumage de la lumière du salon
        adjustBrightnessLivingRoomCommand.execute(); // Réglage de l'intensité lumineuse du salon
        controlPanel.turnOffAllLights(); // Extinction de toutes les lumières

        // Test de l'annulation de la dernière commande (extinction des lumières)
        controlPanel.turnOnAllLights(); // Allumage de toutes les lumières
        turnOffKitchenLightCommand.undo(); // Annulation de la commande d'extinction de la lumière de la cuisine
    }
}
