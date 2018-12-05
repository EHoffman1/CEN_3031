package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentScreen {

  @FXML
  private JFXTextField residentsName;
  
  @FXML
  private JFXButton LeaseDocument;

  @FXML
  void maintenance(ActionEvent event) throws IOException {

    Parent maintenance = FXMLLoader.load(getClass().getResource("SubmitMaintenance.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(maintenance));
    signUpScreen.show();
  }

  @FXML
  void payment(ActionEvent event) throws IOException {

    Parent maintenance = FXMLLoader.load(getClass().getResource("SubmitPayment.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(maintenance));
    signUpScreen.show();
  }

  @FXML
  void lease(ActionEvent event) throws IOException {

    Parent maintenance = FXMLLoader.load(getClass().getResource("LeaseDocument.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(maintenance));
    signUpScreen.show();
  }
@FXML
  public void logOut(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
  }
  @FXML
  void event(ActionEvent event) throws Exception {

    Parent eventScreen = FXMLLoader.load(getClass().getResource("residentEvent.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(eventScreen));

    loginStage.show();
  }

  }

