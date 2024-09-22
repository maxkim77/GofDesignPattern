package Main;

import abst.BikeFactory;
import Sam.SamFactory;
import abst.Body;
import abst.Wheel;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}