package command.example1;

public class FanOnCommand implements Command{
    Fan fan;

    public FanOnCommand(Fan Fan) {
        this.fan = Fan;
    }

    @Override
    public void execute() {
        fan.switchOn();
        System.out.println("Fan is Turn ON");
    }
}
