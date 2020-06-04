package CommaandPattern;

public class TurnOffKitchenLightCommand implements Command {

    KitchenLight kitchenLight;

    public TurnOffKitchenLightCommand(KitchenLight kitchenLight){
        this.kitchenLight = kitchenLight;
    }
    @Override
    public void execute() {
        this.kitchenLight.turnOff();
    }

    @Override
    public void undo() {
        this.kitchenLight.turnOn();
    }
}
