package all;

import java.util.ArrayList;
import java.util.List;

//Classe LightControlPanel représentant un panneau de contrôle pour les lampes
class LightControlPanel {
 private List<Light> lights;

 public LightControlPanel() {
     lights = new ArrayList<>();
 }

 public void addLight(Light light) {
     lights.add(light);
 }

 public void removeLight(Light light) {
     lights.remove(light);
 }

 public void turnOnAllLights() {
     for (Light light : lights) {
         light.turnOn();
     }
 }

 public void turnOffAllLights() {
     for (Light light : lights) {
         light.turnOff();
     }
 }

 public void setBrightnessForAllLights(int brightness) {
     for (Light light : lights) {
         light.setBrightness(brightness);
     }
 }
}