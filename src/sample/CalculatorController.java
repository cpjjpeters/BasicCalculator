package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private javafx.scene.control.TextField firstNumberTextField, secondNumberTextField, resultTextField;
    @FXML
    private javafx.scene.control.Button btnLogin, btnExit;

    @FXML
    private void handleAdditionAction(ActionEvent event){
        double first= Double.parseDouble(firstNumberTextField.getText());
        double second= Double.parseDouble(secondNumberTextField.getText());
        double result = first + second;
            resultTextField.setText(String.valueOf(result));

    }
    @FXML
    private void handleMultiplicationAction(ActionEvent event){
        double first= Double.parseDouble(firstNumberTextField.getText());
        double second= Double.parseDouble(secondNumberTextField.getText());
        double result = first * second;
        resultTextField.setText(String.valueOf(result));

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}