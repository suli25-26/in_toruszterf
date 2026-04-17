/*
* File: TestTorus.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft IN
* Date: 2026-04-17
* Github: https://github.com/eros12345/
* Licenc: MIT
*/

package com.example;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTorus {
    @Test
    public void testCalcVolume_30_35() {
        double expected = 621785.07;
        double actual = Torus.calcVolume(30, 35);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcVolume_12_47() {
        double expected = 133594.96;
        double actual = Torus.calcVolume(12, 47);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcVolume_1_35() {
        double expected = 690.87;
        double actual = Torus.calcVolume(1, 35);
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_0_35() {
        Torus.calcVolume(0, 35);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_neg20_35() {
        Torus.calcVolume(-20, 35);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_30_0() {
        Torus.calcVolume(30, 0);
    }
    
}
