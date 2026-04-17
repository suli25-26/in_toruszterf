/*
* File: Tourus.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft IN
* Date: 2026-04-17
* Github: https://github.com/eros12345/
* Licenc: MIT
*/

package com.example;

import java.util.InputMismatchException;

public class Torus {
    public static double calcVolume(double radius, double distance) {
        if(radius <= 0 || distance <= 0) {
            throw new InputMismatchException();
        }
        double volume = 2*Math.pow(Math.PI, 2) *
        distance * Math.pow(radius, 2);
        return volume;
    }
}
