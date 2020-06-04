package CommaandPattern;

public class RemoteControllerTester {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();


        BedroomLight bedroomLight = new BedroomLight();
        remoteController.addButton(new TurnOnBedroomLightCommand(bedroomLight));
        remoteController.addButton(new TurnOffBedroomLightCommand(bedroomLight));

        KitchenLight kitchenLight = new KitchenLight();
        remoteController.addButton(new TurnOnKitchenLightCommand(kitchenLight));
        remoteController.addButton(new TurnOffKitchenLightCommand(kitchenLight));

        remoteController.pressButton(0);
        remoteController.pressUndoButton();

        remoteController.pressButton(1);
        remoteController.pressUndoButton();

    }
}
