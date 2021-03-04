package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField textField;

    @FXML
    TextArea textArea;
    
    private int oneNumber;
    private int twoNumber;
    private int result;
    private int intermediateResult;
    private int effect;

    public void btn7ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("7");
    }
    public void btn4ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("4");
    }
    public void btn1ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("1");
    }
    public void btn8ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("8");
    }
    public void btn5ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("5");
    }
    public void btn2ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("2");
    }
    public void btn9ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("9");
    }
    public void btn6ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("6");
    }
    public void btn3ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("3");
    }
    public void btn0ClickAction(javafx.event.ActionEvent actionEvent) {
        textField.appendText("0");
    }
    
    
    public void btnCClickAction(javafx.event.ActionEvent actionEvent) {
        textField.clear();
    }
    public void btnCEClickAction(ActionEvent actionEvent) {
        textField.clear();
        textArea.clear();
    }
    public void btnMinusClickAction(ActionEvent actionEvent) {
            String line = textField.getText();
            effect = 1;
            oneNumber = Integer.parseInt(line);

            textField.clear();

    }
    public void btnPlusClickAction(ActionEvent actionEvent) {
        String line = textField.getText();
        effect = 2;
        oneNumber = Integer.parseInt(line);
        textField.clear();
    }

    public void btnOutputClickAction(ActionEvent actionEvent) {
            switch (effect){
                case 1:
                    if(intermediateResult == 0) {
                        String line = textField.getText();
                        twoNumber = Integer.parseInt(line);
                        result = oneNumber - twoNumber;
                        intermediateResult = result;
                        textArea.appendText(String.valueOf(result) + " \n");
                    } else {
                        String line = textField.getText();
                        twoNumber = Integer.parseInt(line);
                        result = intermediateResult - twoNumber;
                        intermediateResult = result;
                        textArea.appendText(String.valueOf(result) + " \n");
                    }
                    break;
                case 2:
                    if(intermediateResult == 0) {
                        String line = textField.getText();
                        twoNumber = Integer.parseInt(line);
                        result = oneNumber + twoNumber;
                        intermediateResult = result;
                        textArea.appendText(String.valueOf(result) + " \n");
                    } else {
                        String line = textField.getText();
                        twoNumber = Integer.parseInt(line);
                        result = intermediateResult + twoNumber;
                        intermediateResult = result;
                        textArea.appendText(String.valueOf(result) + " \n");
                    }
                    break;
            }

    }
}
