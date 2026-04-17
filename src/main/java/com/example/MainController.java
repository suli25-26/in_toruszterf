/*
* File: MainController.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft IN
* Date: 2026-04-17
* Github: https://github.com/eros12345/
* Licenc: MIT
*/

package com.example;

import java.util.InputMismatchException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField distanceField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc() {
        String radiusStr = radiusField.getText();
        if(!isNumber(radiusStr)) {
            throw new InputMismatchException();
        }
        double radius = Double.parseDouble(radiusStr);

        String distanceStr = distanceField.getText();
        if(!isNumber(distanceStr)) {
            throw new InputMismatchException();
        }        
        double distance = Double.parseDouble(distanceStr);

        double volume = Torus.calcVolume(radius, distance);
        volumeField.setText(String.valueOf(volume));
    }

    boolean isNumber(String input) {
        return input.matches("^[0-9]+$");
    }



}
