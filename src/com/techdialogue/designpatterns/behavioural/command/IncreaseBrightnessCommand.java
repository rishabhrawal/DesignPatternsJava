package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * concrete command
 */
public class IncreaseBrightnessCommand implements Command{

    private Light light;

    public IncreaseBrightnessCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.increaseBrightness();
    }

    @Override
    public void undo() {
        light.reduceBrightness();
    }
}
