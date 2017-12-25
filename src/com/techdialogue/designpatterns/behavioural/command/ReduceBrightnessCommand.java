package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * concrete command
 */
public class ReduceBrightnessCommand implements Command {

    private Light light;

    public ReduceBrightnessCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.reduceBrightness();
    }

    @Override
    public void undo() {
        light.increaseBrightness();
    }
}
