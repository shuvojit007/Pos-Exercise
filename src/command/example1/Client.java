package command.example1;

//link : codiwan.com/command-design-pattern-real-world-example-java/

import org.junit.Test;

//Client
public class Client {
    @Test
    public void clientInteraction() {
        RemoteControl control = new RemoteControl();
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        control.setCommand(lightsOn);
        control.pressButton();

        control.setCommand(lightsOff);
        control.pressButton();
    }
}
