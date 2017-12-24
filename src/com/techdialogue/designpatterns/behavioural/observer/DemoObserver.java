package com.techdialogue.designpatterns.behavioural.observer;

import java.util.Scanner;

public class DemoObserver {

    public static void main (String[] args){
        InputReader reader = new InputReader();
        InputRecorder recorder = new InputRecorder();

        //attach reader
        reader.attach(recorder);

        reader.readInput();
        recorder.printRecord();
    }
}
