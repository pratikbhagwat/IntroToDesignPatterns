package CommaandPattern;

import java.util.ArrayList;

public class TurnEverythingOn implements Command {

    ArrayList<Command> commands ;
    public TurnEverythingOn(ArrayList<Command> commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: this.commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command:this.commands){
            command.undo();
        }
    }
}
