package _19_Interface.SmartDevice;

import org.w3c.dom.html.HTMLObjectElement;

public class Main {
    public static void main(String[] args) {
        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();


        SmartLight smartLight = new SmartLight();

        SmartSpeaker smartSpeaker = new SmartSpeaker();


        SmartHomeHub HomeHub = new SmartHomeHub(smartAirConditioner, smartLight, smartSpeaker);
        HomeHub.showStatus();

        HomeHub.turnOnAll();
        HomeHub.turnOffAll();

        HomeHub.showStatus();
    }
}
