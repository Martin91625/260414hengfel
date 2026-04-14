package com.example;

import java.util.InputMismatchException;

public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new InputMismatchException("Hiba! Az értékeknek 0-nál nagyobb számoknak kell lennie");
        }
        double surface = (2 * Math.PI * Math.pow(radius, 2)) + (2 * radius * height * Math.PI);
        return surface;
    }
}
