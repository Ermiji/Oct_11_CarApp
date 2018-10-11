package com.seb;

public class Car extends Vehicle {

    private String start;
    private String accelerate;
    private int speed;
    private String carName;
    private String otherCar;

    //defalt constructor
    public Car() {

    }

    public Car(String surname) {
        this.carName = surname;
        System.out.println("This is the overloaded constructor.");
    }

    @Override
    public String start(){
        return "The " + carName + " is starting";
    }

    @Override
    public String accelerate(){
        return "The " + carName + " is accelerating";
    }

    @Override
    public String stop(){
        return "The " + carName + " has stopped";
    }

    @Override
    public String stop1(){
        return "The " + carName + " has stopped to have its emissions checked";
    }

    @Override
    public String emission(){
        return "The " + carName + " passes its emission text";
    }

    @Override
    public String race(){
        return "The " + carName + " just passed the " + otherCar;
    }

    //Overloaded method
    public String race(String otherCar){
        return "The " + carName + " just passed the " + otherCar;
    }
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name){
        this.carName = name;
    }

    public String getCarName(){
        return carName;
    }

    public String getDisplaySpeed(){
        return "The red Porsche is going " + speed + " mph";
    }
}
