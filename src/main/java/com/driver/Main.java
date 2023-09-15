package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

         //rw.name = "adarsh";
        //it will not work because variable is private in other pachage

        rw.setName("Adarsh");
        rw.getName();

    }
}