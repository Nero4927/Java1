package all;

public class Light {
    private boolean isOn;
    private int brightness;

    public Light() {
        isOn = false;
        brightness = 0;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light turned off");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness set to " + brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isOn() {
        return isOn;
    }
}
