package command.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
Whenever a user presses any button, the switch board can then call the execute method without actually
knowing the receiver of method, the device.
*/

//invoker
public class SwitchBoard {

    //the list of the commands
    private  List<Command>commands = new ArrayList<>();

    // this attribute stores the command that was last executed.
    // it is used for undo
    private Command lastCommand;

//    public Command getCommand(int i) {
//        if (i > commands.size()) {
//            throw new NoSuchElementException(String.format("The dashboard screen has only %d commands", commands.size()));
//        }
//        return commands.get(i);
//    }

    public void addCommand(Command command) {
        commands.add(command);
    }

//    public void setCommand(int i, Command command) {
//        commands.add(i, command);
//    }

    public void executeCommand(int i) {
        if (i > commands.size()) {
            throw new NoSuchElementException(String.format("The dashboard screen has only %d commands", commands.size()));
        }
        commands.get(i).execute();
        lastCommand = commands.get(i);
    }

    public void undo() {
        lastCommand.undo();
    }
}
