package com.techdialogue.designpatterns.behavioural.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputRecorder implements Observer {

    private Map<String,String > record = new HashMap<>();

    public void printRecord(){

        System.out.println("Following data was recorded");
        System.out.println(record);
    }

    public void clearRecord(){
        record.clear();
    }

    @Override
    public void update(String s) {
        record.put(LocalDateTime.now().toString(),s);
    }
}
