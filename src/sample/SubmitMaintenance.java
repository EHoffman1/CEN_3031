package sample;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SubmitMaintenance {

  @FXML
  private JFXTextField room;

  @FXML
  private JFXTextField email;

  @FXML
  private JFXTextArea details;

  @FXML
  private JFXTextField name;

  @FXML
  private JFXTextField type;

  public String maintenanceStatus = "Incomplete";
  public LocalDateTime currentDate = LocalDateTime.now();

  @FXML
  public void goBack(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();

  }

  public void resetAll() {
    name.clear();
    room.clear();
    details.clear();
    email.clear();
    type.clear();

    type.setPromptText("Issue");
  }

  public void submit(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
    try (
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("MaintenanceRequests.txt", true)))) {
      out.write(" Maintenance Type: " + type.getText());
      out.println("");
      out.write(" Room Number: " + room.getText());
      out.println("");
      out.write(" Details: " + details.getText());
      out.println("");
      out.write(" Full Name: " + name.getText());
      out.println("");
      out.write(" Email: " + email.getText());
      out.println("");

    } catch (
            IOException ioe) {
      ioe.printStackTrace();
    }
    try (
            PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("MaintenanceRequestType.txt", true)))) {
      out1.write( type.getText());
      out1.println("");
    } catch (
            IOException ioe) {
      ioe.printStackTrace();
    }
    try (
            PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("MaintenanceRequestStatus.txt", true)))) {
      out2.write(  maintenanceStatus);
      out2.println("");
    } catch (
            IOException ioe) {
      ioe.printStackTrace();
    }
    try (
            PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter("MaintenanceRequestRoom.txt", true)))) {
            out3.write( room.getText());
            out3.println("");
    } catch (
            IOException ioe) {
      ioe.printStackTrace();
    }
    try (
            PrintWriter out4 = new PrintWriter(new BufferedWriter(new FileWriter("MaintenanceRequestDate.txt", true)))) {
      out4.write(String.valueOf(currentDate.toLocalDate()));
      out4.println("");
    } catch (
            IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
