package com.xha.patterns.creater.factory.question;

public class TestDemo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
