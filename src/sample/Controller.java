package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
        @FXML
        TextField minutesTaken;
        @FXML
        TextField distanceRan;
        @FXML
        Label output;

    public void click(ActionEvent actionEvent) {
        if(!(distanceRan.getText().equals("")&&minutesTaken.getText().equals(""))) {
            double milesPerHour = Double.parseDouble(distanceRan.getText()) / Double.parseDouble(minutesTaken.getText());
            output.setText("Miles per hour(approximately): " + milesPerHour);
        } else {
            output.setText("Check your input!");
        }
    }
}
