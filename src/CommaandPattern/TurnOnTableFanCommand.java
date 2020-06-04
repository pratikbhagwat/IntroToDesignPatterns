package CommaandPattern;

public class TurnOnTableFanCommand  implements Command{
    TableFan tableFan;
    public TurnOnTableFanCommand(TableFan tableFan){
        this.tableFan = tableFan;
    }

    @Override
    public void execute() {
        this.tableFan.turnOn();
    }
}
