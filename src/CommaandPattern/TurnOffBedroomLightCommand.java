package CommaandPattern;

public class TurnOffBedroomLightCommand implements Command {
    BedroomLight bedroomLight;
    public TurnOffBedroomLightCommand(BedroomLight bedroomLight){
        this.bedroomLight = bedroomLight;
    }

    @Override
    public void execute() {
        this.bedroomLight.turnOff();
    }
}
