package com.seb;

public class CarApp {
    public static void main(String[] args) {

        Car c = new Car();
        Car sc = new Car();
        c.setName("red Porsche");
        sc.setName("blue Jetta");
        c.setSpeed(50);
        sc.setSpeed(90);
        System.out.println(c.start());
        System.out.println(sc.start());
        System.out.println(c.accelerate());
        System.out.println(sc.accelerate());
        System.out.println(sc.stop1());
        System.out.println(sc.emission());
        System.out.println(c.getDisplaySpeed());
        System.out.println(c.stop());
        System.out.println(sc.race());

        }
}
