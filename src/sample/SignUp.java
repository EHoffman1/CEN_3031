package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class SignUp {

    @FXML
    private JFXButton resetButton;

    @FXML
    private JFXButton submitButton;

    @FXML
    private JFXButton goBack;

    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXTextField userID;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXTextField address;

    @FXML
    private JFXTextField phoneNumber;

    @FXML
    private JFXTextField DOB;

    @FXML
    private JFXTextField city;

    @FXML
    private JFXTextField state;

    @FXML
    private JFXTextField zipCode;

    @FXML
    private JFXComboBox<?> gender;

    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField building;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        //      loginScreen.getStylesheets().add
        //            (Login.class.getResource("Login.css").toExternalForm());
        loginStage.show();

    }

    @FXML
    void resetAll(ActionEvent event) {

        firstName.clear();
        userID.clear();
        address.clear();
        phoneNumber.clear();
        DOB.clear();
        lastName.clear();
        password.clear();
        city.clear();
        email.clear();
        state.clear();
        zipCode.clear();
        gender.getSelectionModel().clearSelection();
        gender.setPromptText("Sex");
    }

    @FXML
    void signupError() {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Please Fill Out All Fields", ButtonType.CLOSE);
        alert.showAndWait();

    }

    @FXML
    void submit(ActionEvent event) throws IOException {
        if (firstName.getText().isEmpty() ||
                userID.getText().isEmpty() ||
                address.getText().isEmpty() ||
                phoneNumber.getText().isEmpty() ||
                DOB.getText().isEmpty() ||
                lastName.getText().isEmpty() ||
                password.getText().isEmpty() ||
                city.getText().isEmpty() ||
                email.getText().isEmpty() ||
                state.getText().isEmpty() ||
                zipCode.getText().isEmpty()
        ) {
            signupError();
        } else try (
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("UserList.txt", true)))) {
            out.println(" First Name: " + firstName.getText());
            out.println(" Last Name: " + lastName.getText());
            out.println("");
            out.println(" ID: " + userID.getText());
            out.println("");
            out.println(" Email Address: " + email.getText());
            out.println("");
            out.println(" Address: " + address.getText());
            out.println(" City: " + city.getText());
            out.println(" State: " + state.getText());
            out.println(" Zip Code: " + zipCode.getText());
            out.println("");
            out.println(" Date of Birth: " + DOB.getText());
            out.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        try(
            PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("UserLoginCredentials.txt", true)))) {

            out1.println(email.getText());
            out1.println(password.getText());

            out1.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        try(
            PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("ResidentFirstName.txt", true)))) {
            out2.println(firstName.getText());
            out2.println("");
        } catch (IOException ioe) {
        ioe.printStackTrace();
    }
            //
        try(
            PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter("ResidentLastName.txt", true)))){
            out3.println(lastName.getText());
            out3.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
            //
        try(
            PrintWriter out4 = new PrintWriter(new BufferedWriter(new FileWriter("ResidentEmail.txt", true)))){
            out4.println(email.getText());
            out4.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
            //
        try(
            PrintWriter out5 = new PrintWriter(new BufferedWriter(new FileWriter("ResidentBuilding.txt", true)))){
            out5.println(building.getText());
            out5.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
            //


        Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));

        loginStage.show();


    }

}
