package com.techdialogue.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * Invoker class
 */
public class Switch {

    //stores command history, can be used to undo
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(Command command){
        history.add(command); //Optional to support undo
        command.execute();
    }

    public void undoLastCommand(){
        int lastIndex = history.size() -1;
        Command c = history.remove(lastIndex);
        c.undo();
    }

    public void undoAllTheCommands(){
        //TODO traverse in reverse
        for(Command c: history){
            c.undo();
        }
        history.clear();
    }
}
