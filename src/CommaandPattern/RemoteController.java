package CommaandPattern;

import java.util.ArrayList;

public class RemoteController {

    private ArrayList<Command> commandArrayList ;
    private Command lastExecutedCommand = null;
    public RemoteController(){
        this.commandArrayList = new ArrayList<>();
    }

    public void pressButton(int i){
        if (i < this.commandArrayList.size()){
            this.commandArrayList.get(i).execute();
            this.lastExecutedCommand = this.commandArrayList.get(i);
        }
    }

    public void addButton(Command command){
        this.commandArrayList.add(command);
    }

    public boolean setCommand(Command command , int i){
        if (i < this.commandArrayList.size()){
            this.commandArrayList.set(i,command);
            return true;
        }else {
            return false;
        }
    }

    public void pressUndoButton(){
        if (this.lastExecutedCommand != null){
            this.lastExecutedCommand.undo();
        }
    }

}
