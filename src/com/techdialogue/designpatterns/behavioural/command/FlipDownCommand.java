package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * concrete command to switch off light
 */
public class FlipDownCommand implements Command{

    private Light light;

    FlipDownCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
