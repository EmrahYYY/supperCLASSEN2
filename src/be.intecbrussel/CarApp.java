package be.intecbrussel;

import be.intecbrussel.geometry.Rectangle;

public class CarApp {

    public static void main(String[] args) {


        Car c1 = new Car();

        c1.getColor();

        System.out.println(c1.getColor());

        ElectricalCar electricalCar= new ElectricalCar();
        System.out.println(electricalCar.getBatteryPercentage());

        electricalCar.charge();
        System.out.println("Our Battery: " + electricalCar.getBatteryPercentage());
        electricalCar.setColor("Pink");
        System.out.println(electricalCar.getColor());
        electricalCar.accelerate();
        electricalCar.decelerate();

    }
}
