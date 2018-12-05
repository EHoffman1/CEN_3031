package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViewResidents {
    BufferedReader in1;
    BufferedReader in2;
    BufferedReader in3;
    BufferedReader in4;
    String read;

    @FXML
    private TextArea firstName;

    @FXML
    private TextArea lastName;

    @FXML
    private TextArea email;

    @FXML
    private TextArea building;

    @FXML
    private JFXButton goBack;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();

    }

    @FXML
    void populateResident(ActionEvent event) throws IOException {
        in1 = new BufferedReader(new FileReader("ResidentFirstName.txt"));
        in2 = new BufferedReader(new FileReader("ResidentLastName.txt"));
        in3 = new BufferedReader(new FileReader("ResidentEmail.txt"));
        in4 = new BufferedReader(new FileReader("ResidentBuilding.txt"));
        while ((read = in1.readLine()) != null) {
            firstName.appendText(read + "\n");

        }
        while ((read = in2.readLine()) != null) {
            lastName.appendText(read + "\n");

        }
        while ((read = in3.readLine()) != null) {
            email.appendText(read + "\n");

        }
        while ((read = in4.readLine()) != null) {
            building.appendText(read + "\n");

        }
    }
}
