package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.awt.Font;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ConfirmationPageController {
	@FXML
	private AnchorPane mainPane;
	@FXML
	private Label nameLabel;
	@FXML
	private Label destinationLabel;
	@FXML
	private Label travelDateLabel;
	@FXML
	private Label pickUpTimeLabel;
	@FXML
	private Label pickUpLocationLabel;
	@FXML
	private Button cancelButton;
	@FXML
	private Button finishButton;
	@FXML
	private BusReservationController callingController;
	
	private String name = "";
	
	private String destination = "";
	
	private String travelDate = "";
	
	private String pickuptime = "";
	
	private String pickupLocation = "";
	
	public void setCallingController(BusReservationController busReservationController){
		this.callingController = busReservationController;
	}
	
	// Write the public methods here for setting the values to lable
	//Setters for each label
	@FXML
	public void setName(String name) {
		nameLabel.setText(name);
	}
	
	@FXML
	public void setDestination(String desti) {
		destinationLabel.setText(desti);
	}
	
	@FXML
	public void setTravelDate(String date) {
		travelDateLabel.setText(date);
	}
	
	@FXML
	public void setPickuptime(String time) {
		pickUpTimeLabel.setText(time);
	}
	
	@FXML 
	public void setPickuplocation(String location) {
		pickUpLocationLabel.setText(location);
	}
	
	
	// Event Listener on Button[#cancelButton].onAction
	@FXML
	public void cancelButtonClicked(ActionEvent event) {
		
		// Write your code here
		//cancel button will return control to bus reservation window
		Stage stage=(Stage) cancelButton.getScene().getWindow();
		stage.close();

	}
	// Event Listener on Button[#finishButton].onAction
	@FXML
	public void finishButtonClicked(ActionEvent event) {
		
		// Write your code here
		//call the clear method in BusReservationController to clear the fields in BusReservation window
		callingController.clearOrder();
		
		
		
		
		
		
	}
}
