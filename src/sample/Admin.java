package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Date;

public class Admin extends User{

  public void logOut(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }
  //fields
  protected String organization = "Default Organization Name";

  // default constructor
  public Admin() {

  }

  // overloaded constructor
  public Admin(String organization) {
    this.organization = organization;

  }
  //methods
  protected void createEvent(String nameOfEvent, String address, String description, Date dateAndTime){
    Event eventName = new Event(nameOfEvent,address, description, dateAndTime);
  }
  protected void setResidentLease(){
    //to be filled out later
  }
}

