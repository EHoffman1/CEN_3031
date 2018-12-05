package sample;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.Extension;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class LeaseDocument {
  @FXML
  private JFXButton uploadButton;
  private Desktop desktop = Desktop.getDesktop();

  public void goback(ActionEvent event) throws IOException {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
  }
  public void upload(ActionEvent event) throws IOException{
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    FileChooser fileChooser = new FileChooser();
      FileChooser.ExtensionFilter pdfChecker = new FileChooser.ExtensionFilter("PDF Files", "*.pdf");
    fileChooser.setTitle("Select Lease Document");
    fileChooser.getExtensionFilters().add(pdfChecker);
  fileChooser.setSelectedExtensionFilter(pdfChecker);

    uploadButton.setOnAction(
            new EventHandler<ActionEvent>() {
              @Override
              public void handle(final ActionEvent e) {
                File file = fileChooser.showOpenDialog(signUpScreen);
                if (file != null) {
                  openFile(file);
                }
              }
            });
  }


  private void openFile(File file) {
    try {
      desktop.open(file);
    } catch (IOException ex) {
      Logger.getLogger(
              LeaseDocument.class.getName()).log(
              Level.SEVERE, null, ex
      );
    }
  }
}
