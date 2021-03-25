package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class Controller {
    @FXML
    Label helloWorld;
    @FXML
    AnchorPane pozadina;
    public void dugme(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
        pozadina.setStyle("-fx-background-color: #FFCCCB ");
    }
}
