package ru.job4j.oop;

import java.util.Objects;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object objectCar = new Car();
        Car carFromObject = (Car) objectCar;
    }
}
