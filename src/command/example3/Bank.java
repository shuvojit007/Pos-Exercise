package command.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Bank {
    private List<Command> commands = new ArrayList<>();

    public Command lastCommand;

    public void addCommand(Command command) {
        commands.add(command);
    }


    public void executeCommand(int i) {
        if (i > commands.size()) {
            throw new NoSuchElementException(String.format("The dashboard screen has only %d commands", commands.size()));
        }
        commands.get(i).execute();
        lastCommand = commands.get(i);
    }

    public void executeAllCommand(){
        for (Command cmd:commands) {
            cmd.execute();
            this.lastCommand = cmd;
        }
    }

    public void executeLastCommand(){
       commands.get(commands.size()-1).execute();
       this.lastCommand = commands.get(commands.size()-1);
    }

    public void undo() {
        lastCommand.undo();
    }

}
