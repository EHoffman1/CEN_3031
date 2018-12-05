package sample;

import com.jfoenix.controls.JFXButton;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.util.Collection;
import java.util.stream.Collectors;

public class AdminPayments {
    BufferedReader in1;
    BufferedReader in2;
    BufferedReader in3;

    String read;
    @FXML
    private TextArea paymentNameText;
    @FXML
    private TextArea dateText;
    @FXML
    private TextArea amountText;
    @FXML
    private JFXButton goBack2;
    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();

    }

    @FXML
    public void showPayments(ActionEvent actionEvent){
        try {
            in1 = new BufferedReader(new FileReader("PaymentListName.txt"));
            in2 = new BufferedReader(new FileReader("PaymentListDate.txt"));
            in3 = new BufferedReader(new FileReader("PaymentListAmount.txt"));
            while ((read = in1.readLine()) != null) {
                paymentNameText.appendText( read + "\n");

            }
            while ((read = in2.readLine()) != null) {
               dateText.appendText( read + "\n");

            }
            while ((read = in3.readLine()) != null) {
                amountText.appendText( read + "\n");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    }

