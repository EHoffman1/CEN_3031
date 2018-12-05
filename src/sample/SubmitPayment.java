package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.awt.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SubmitPayment {


  @FXML
  private JFXButton submitPayment;

  @FXML
  private JFXButton clearPayment;

  @FXML
  private JFXButton backPayment;



  @FXML
  private JFXTextField creditCardNumber;

  @FXML
  private JFXTextField CCV;
  @FXML
  private JFXTextField dollars;
  @FXML
  private JFXTextField cents;
  @FXML
  private JFXTextField date;
  @FXML
  private JFXTextField fullName;

  public void goBack(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
  }


  public void resetAll() {

    fullName.clear();
    creditCardNumber.clear();
    CCV.clear();
    dollars.clear();
    cents.clear();
    date.clear();
  }

  public void submit(ActionEvent event) throws Exception {
//makes a file that stores payment information in text
    try (PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("PaymentListName.txt", true)))) {
      out1.println("Full Name: " + fullName.getText());
      out1.println("");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    try (PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("PaymentListDate.txt", true)))) {
      out2.println("Date Paid: " + date.getText());
      out2.println("");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    try (PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter("PaymentListAmount.txt", true)))) {
      out3.println("Amount: " + dollars.getText() + "." + cents.getText());
      out3.println("");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));

    loginStage.show();
  }

  @FXML
  void ccv(ActionEvent event) {

  }

  @FXML
  void creditCardNumber(ActionEvent event) {

  }

  @FXML
  void fullName(ActionEvent event) {

  }


  @FXML
  void month(ActionEvent event) {

  }

  @FXML
  void resetAll(ActionEvent event) {

  }

  @FXML
  void year(ActionEvent event) {

  }


}
