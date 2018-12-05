package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


import javafx.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javafx.stage.Stage;

public class ResidentEvent {
    @FXML
    private TextArea eventText;
    @FXML
    private Button eventButton;
    
    BufferedReader in;
    String read;
//this method reads through the EventList text file and copies each line to the textarea 'eventText' and adds a new line in between
    @FXML
   public void showEvents(ActionEvent actionEvent) {
                try {
                    in = new BufferedReader(new FileReader("EventList.txt"));
                    while ((read = in.readLine()) != null) {
                        eventText.appendText( read + "\n");
                        //eventText.setText(sb.toString());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

  @FXML
  void goBack(ActionEvent event) throws IOException {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();

  }
}
