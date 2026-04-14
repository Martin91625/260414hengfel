package com.example;

public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        double surface = (2 * Math.PI * Math.pow(radius, 2)) + (2 * radius * height * Math.PI);
        return surface;
    }
}
