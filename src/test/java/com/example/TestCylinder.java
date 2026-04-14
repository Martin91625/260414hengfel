package com.example;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCylinder {
    
    @Test
    public void testCalcSurface() {
        Assert.assertTrue(true);
    }

    @Test
    public void testCalcSurface_30_35() {
        double radius = 30;
        double height = 35;
        double expected = 12252.211349000194;
        double actual = Cylinder.calcSurface(radius, height);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalcSurface_132_48() {
        double radius = 132;
        double height = 48;
        double expected = 149288.48289858698;
        double actual = Cylinder.calcSurface(radius, height);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalcSurface_1_35() {
        double radius = 1;
        double height = 35;
        double expected = 226.1946710584651;
        double actual = Cylinder.calcSurface(radius, height);

        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcSurface_0_27() {
        double radius = 0;
        double height = 27;
        Cylinder.calcSurface(radius, height);       
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcSurface_30_0() {
        double radius = 0;
        double height = 27;
        Cylinder.calcSurface(radius, height);       
    }
    

}
