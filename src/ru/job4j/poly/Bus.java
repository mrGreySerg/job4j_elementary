package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Этот новый автобус может ехать очень быстро.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Максимальное количество пассажиров - 60");
        int maxPas = 60;
        if (maxPas >= number) {
            System.out.println("Без проблем, довезем!");
        } else {
            System.out.println("Часть пойдет пешком!");
        }
    }

    @Override
    public double fill(int liters) {
        double priceOneLiter = 50.2;
        return priceOneLiter * liters;
    }
}
