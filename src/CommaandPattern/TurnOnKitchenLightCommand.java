package CommaandPattern;

public class TurnOnKitchenLightCommand implements Command {
    KitchenLight kitchenLight;

    public TurnOnKitchenLightCommand(KitchenLight kitchenLight){
        this.kitchenLight = kitchenLight;
    }

    @Override
    public void execute() {
        this.kitchenLight.turnOn();
    }
}
