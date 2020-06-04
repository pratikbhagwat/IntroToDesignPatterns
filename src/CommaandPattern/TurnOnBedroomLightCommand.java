package CommaandPattern;

public class TurnOnBedroomLightCommand implements Command {
    BedroomLight bedroomLight;
    public TurnOnBedroomLightCommand(BedroomLight bedroomLight){
        this.bedroomLight = bedroomLight;
    }

    @Override
    public void execute() {
        this.bedroomLight.turnOn();
    }

    @Override
    public void undo() {
        this.bedroomLight.turnOff();
    }
}
