package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
       //obj.name = "vivek"; // Error because private

        obj.setName("Vivek");
        obj.getName();
    }
}