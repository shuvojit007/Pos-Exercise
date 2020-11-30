package command.example2;

public class LightOneCommand implements Command{
    private Light light;

    public LightOneCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
