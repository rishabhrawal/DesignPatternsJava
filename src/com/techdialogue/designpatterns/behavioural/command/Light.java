package com.techdialogue.designpatterns.behavioural.command;

/**
 * @author Rishabh Rawal
 * @date 12/25/17
 *
 * receiver class
 */
public class Light {

    public void turnOn(){
        System.out.println("The light is On!");
    }

    public void turnOff(){
        System.out.println("The light is Off!");
    }

    public void reduceBrightness(){
        System.out.println("Dimming lights");
    }

    public void increaseBrightness(){
        System.out.println("Increasing Brightness");
    }
}
