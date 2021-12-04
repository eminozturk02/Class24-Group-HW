package com.company.class24.HW3;

public class CarATester {
    public static void main(String[] args) {
        CarA truck = new Truck(40000, "metallic grey", 2000);
        System.out.println("Final Truck price is " + truck.calculateSalePrice()+" $");
        CarA sedan = new Sedan(27000, "white", 30);
        System.out.println("Final Sedan price is: " + sedan.calculateSalePrice()+" $");
    }
}
