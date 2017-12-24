package com.techdialogue.designpatterns.creational.builder;

public class Car {

    String reg;
    String model;
    String colour;

    //private constructor
    private Car(){
    }

    //static method to get builder object
    public static CarBuilder getCarBuilder(){
        return new CarBuilder();
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append(super.toString());
        sb.append("reg='").append(reg).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //inner static builder class
    public static class CarBuilder {

        private Car car;

        //new instance of object created with the builder
        public CarBuilder(){
            car = new Car();
        }

        //last method to be called after setting enough parameters
        public Car build(){
            return car;
        }

        public CarBuilder setReg(String reg){
            car.setReg(reg);
            return this;
        }

        public CarBuilder setModel(String model){
            car.setModel(model);
            return this;
        }

        public CarBuilder setColour(String colour){
            car.setColour(colour);
            return this;
        }

    }
}
