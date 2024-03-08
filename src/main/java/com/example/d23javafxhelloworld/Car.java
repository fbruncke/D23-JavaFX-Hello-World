package com.example.d23javafxhelloworld;

public class Car {
    private String Brand;

    public Car(String brand) {
        Brand = brand;

        System.out.println("Very expensive constructor invocation");
    }

    public String getBrand() {
        return Brand;
    }
}
