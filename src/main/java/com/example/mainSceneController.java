package com.example;

import java.util.InputMismatchException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class mainSceneController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc() {
        this.testInput();

        try {
            double radius = Double.parseDouble(radiusField.getText());
            double height = Double.parseDouble(heightField.getText());
            double surface = Cylinder.calcSurface(radius, height);    
            surfaceField.setText(String.valueOf(surface));
        } catch (InputMismatchException e) {
            String msg = e.getMessage();
            showMsg(msg);
            throw new InputMismatchException(msg);
        }
    }

    void testInput() {
        String radiusStr = radiusField.getText();
        String heightStr = heightField.getText();
        if (radiusStr.isEmpty() || heightStr.isEmpty()) {
            String msg = "Hiba! A mezők nem lehetnek üresek!";
            this.showMsg(msg);
            throw new InputMismatchException(msg);            
        }
        if (!radiusStr.matches("-?[0.-9.]+") || !heightStr.matches("-?[0.-9.]+")) {
            String msg = "Hiba! A bemenet csak valós szám lehet";
            this.showMsg(msg);
            throw new InputMismatchException(msg);
        }    
    }

    void showMsg(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(msg);
        alert.setHeaderText("Hibás bemenet.");
        alert.setTitle("Hiba");
        alert.initOwner(App._stage);
        alert.showAndWait();
    }
}

