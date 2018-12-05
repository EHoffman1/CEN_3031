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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Maintenance {
    BufferedReader in1;
    BufferedReader in2;
    BufferedReader in3;
    BufferedReader in4;
    String read;
    @FXML
    private JFXButton goBack;
    @FXML
    private TextArea mainType;
    @FXML
    private TextArea mainDate;
    @FXML
    private TextArea mainLocation;
    @FXML
    private TextArea mainStatus;
    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();

    }
    @FXML
    void populateMaintenance(ActionEvent event) throws IOException{
        try {
            in1 = new BufferedReader(new FileReader("MaintenanceRequestType.txt"));
            in2 = new BufferedReader(new FileReader("MaintenanceRequestStatus.txt"));
            in3 = new BufferedReader(new FileReader("MaintenanceRequestDate.txt"));
            in4 = new BufferedReader(new FileReader("MaintenanceRequestRoom.txt"));
            while ((read = in1.readLine()) != null) {
                mainType.appendText( read + "\n");

            }
            while ((read = in2.readLine()) != null) {
                mainDate.appendText( read + "\n");

            }
            while ((read = in3.readLine()) != null) {
                mainStatus.appendText( read + "\n");

            }
            while ((read = in4.readLine()) != null) {
                mainLocation.appendText( read + "\n");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
