package com.example;

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
        double radius = Double.parseDouble(radiusStr);

        String distanceStr = distanceField.getText();
        double distance = Double.parseDouble(distanceStr);

        double volume = 0;
        volumeField.setText(String.valueOf(volume));
    }



}
