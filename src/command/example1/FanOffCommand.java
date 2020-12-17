package command.example1;

public class FanOffCommand implements Command{
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.switchOff();
        System.out.println("Fan is Turn Off");
    }
}

