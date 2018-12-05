package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateEvents {
    @FXML
    private JFXTextField eventName;
    @FXML
    private JFXTextField date;
    @FXML
    private JFXTextField type;
    @FXML
    private JFXTextField time;
    @FXML
    private JFXButton goBack1;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();
    }

    @FXML
    void submitButton(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("EventList.txt", true)))) {
            out.println(" Event Name: " + eventName.getText());
            out.println(" Event Type: " + type.getText());
            out.println(" Event Time: " + time.getText());
            out.println(" Event Date: " + date.getText());


            out.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
