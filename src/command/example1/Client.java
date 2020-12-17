package command.example1;

//link : codiwan.com/command-design-pattern-real-world-example-java/

import org.junit.Test;

//Client
public class Client {
    @Test
    public void clientInteraction() {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Fan fan = new Fan();


        Command lightsOn = new LightOnCommand(light);
        control.setCommand(lightsOn);
        control.pressButton();


        Command lightsOff = new LightOffCommand(light);
        control.setCommand(lightsOff);
        control.pressButton();

        Command fanOn = new FanOnCommand(fan);
        control.setCommand(fanOn);
        control.pressButton();


        Command fanOff = new FanOffCommand(fan);
        control.setCommand(fanOff);
        control.pressButton();
    }
}
