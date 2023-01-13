package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly p1 = new RWOnly();
        //p1.setMember("Vivek");
        // Error : Cannot Resolve the method 'setMember' in 'RWOnly'.

        p1.setMember("Vivek");
        System.out.println(p1.getMember());
    }
}