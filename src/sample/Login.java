package sample;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Login {


    @FXML
    private JFXTextField UserID;

    @FXML
    private JFXPasswordField userPass;

    @FXML
    private Button login;

    @FXML
    private Label loginFail;

    @FXML
    private Button createAccount;

    BufferedReader in;
    public void signInAdmin(ActionEvent event) throws Exception {
        Boolean valid = false;
        File loginCredentials = new File("AdminLoginCredentials.txt");
        String user = "";
        String correctUser = UserID.getText();
        String correctPass = userPass.getText();
        Scanner scan = new Scanner(loginCredentials);
        while (user.equals(correctUser) == false && scan.hasNextLine()){
            user = scan.nextLine();
        }

        if (user.equals( correctUser)){
            if (scan.nextLine().equals( correctPass)) {
                valid = true;
            }
            else {
                loginFail.setVisible(true);
            }
        }
        else {
            loginFail.setVisible(true);
        }


        if (valid) {
            Parent adminDash = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            Stage adminScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
            adminScreen.setScene(new Scene(adminDash));
            adminScreen.show();
        }


        }

    public void signIn(ActionEvent event) throws Exception{
    Boolean valid = false;
    File loginCredentials = new File("UserLoginCredentials.txt");
        String user = "";
        String correctUser = UserID.getText();
        String correctPass = userPass.getText();
        Scanner scan = new Scanner(loginCredentials);
        while (user.equals(correctUser) == false && scan.hasNextLine()){
            user = scan.nextLine();
        }

        if (user.equals( correctUser)){
            if (scan.nextLine().equals( correctPass)) {
                valid = true;
            }
            else {
                loginFail.setVisible(true);
            }
        }
        else {
            loginFail.setVisible(true);
        }


        if (valid) {
            Parent studentDash = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
            Stage studentScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
            studentScreen.setScene(new Scene(studentDash));
            studentScreen.show();
        }

    }

    public void createAccount(ActionEvent event) throws Exception {

        Parent createAccount = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(createAccount));
        signUpScreen.show();
    }

    public void checkAdminCredentials(String username, String password, ActionEvent event) throws IOException {
        String user = "";
        Scanner scan = new Scanner("AdminLoginCredentials.txt.txt");
        while (user != username && scan.hasNext()){
            user = scan.nextLine();
        }
        if (user == username){
            if (scan.nextLine() == " Password: " + password) {
                Parent adminDash = FXMLLoader.load(getClass().getResource("Admin.fxml"));
                Stage adminScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
                adminScreen.setScene(new Scene(adminDash));
                adminScreen.show();
            }
            else {
                loginFail.setVisible(true);
            }
        }
        else {
            loginFail.setVisible(true);
        }

    }

}
