package CommaandPattern;

public class TurnOffTableFanCommand implements Command {
    TableFan tableFan;
    public TurnOffTableFanCommand(TableFan tableFan){
        this.tableFan = tableFan;
    }

    @Override
    public void execute() {
        this.tableFan.turnOff();
    }

    @Override
    public void undo() {
        this.tableFan.turnOn();
    }
}
