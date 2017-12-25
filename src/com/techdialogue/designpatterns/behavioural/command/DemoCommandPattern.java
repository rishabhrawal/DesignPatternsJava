package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 */
public class DemoCommandPattern {

    public static void main(String[] args){

        Light light = new Light();
        FlipUpCommand flipUp = new FlipUpCommand(light);
        FlipDownCommand flipDown = new FlipDownCommand(light);
        IncreaseBrightnessCommand increaseBrightnessCommand = new IncreaseBrightnessCommand(light);
        ReduceBrightnessCommand reduceBrightnessCommand =  new ReduceBrightnessCommand(light);

        Switch mySwitch = new Switch();

        //turn on
        mySwitch.storeAndExecute(flipUp);

        //turn off
        mySwitch.storeAndExecute(flipDown);

        //increase brightness
        mySwitch.storeAndExecute(increaseBrightnessCommand);

        //undo all the commands
        mySwitch.undoLastCommand();

        //undo rest of the commands;
        mySwitch.undoAllTheCommands();

    }
}
