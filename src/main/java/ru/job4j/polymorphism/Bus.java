package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public int charge(int fuel) {
        System.out.println("Заправляемся на " + fuel + " литров");
        int coast = 3;
        System.out.println("Цена за 1 литр: " + coast + " доллара");
        int sum = coast * fuel;
        System.out.println("Итого заплатили " + sum + " долларов");
        return sum;
    }
}
