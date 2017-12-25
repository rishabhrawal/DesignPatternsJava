package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * Concrete command to switch on light
 */
public class FlipUpCommand implements Command{

    private Light light;

    public FlipUpCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
