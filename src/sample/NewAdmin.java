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

public class NewAdmin {

    @FXML
    private JFXButton backButton;

    @FXML
    private JFXButton submitButton;
    @FXML
    private JFXTextField firstName;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXTextField adminID;
    @FXML
    private JFXTextField password;
    @FXML
    private JFXTextField email;

    /*



   */
    @FXML
    public void add(ActionEvent event) throws Exception {

        Parent add = FXMLLoader.load(getClass().getResource("NewAdmin.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(add));
        signUpScreen.show();
    }

    @FXML
    void maintenance(ActionEvent event) throws IOException {

        Parent maintenance = FXMLLoader.load(getClass().getResource("Maintenance.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(maintenance));
        signUpScreen.show();
    }

    @FXML
    void viewPayments(ActionEvent event) throws IOException {

        Parent viewPayments = FXMLLoader.load(getClass().getResource("AdminPayments.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(viewPayments));
        signUpScreen.show();
    }

    @FXML
    void viewResidents(ActionEvent event) throws IOException {

        Parent viewResidents = FXMLLoader.load(getClass().getResource("ViewResidents.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(viewResidents));
        signUpScreen.show();
    }

    @FXML
    void CreateEvent(ActionEvent event) throws IOException {

        Parent createEvent = FXMLLoader.load(getClass().getResource("CreateEvents.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(createEvent));
        signUpScreen.show();
    }
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

            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("AdminList.txt", true)))) {
                out.println("First Name: " + firstName.getText());
                out.println(" Last Name: " + lastName.getText());
                out.println(" ID: " + adminID.getText());
                out.println(" Email Address: " + email.getText());
                out.println("");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        try (PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("AdminLoginCredentials.txt", true)))) {
            out1.println("");
            out1.println( email.getText());
            out1.println( password.getText());
            out1.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        }


    @FXML
    void logOut(ActionEvent event) throws Exception {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
    //    loginScreen.getStylesheets().add
      //      (Login.class.getResource("Login.css").toExternalForm());
        loginStage.show();
    }
}
