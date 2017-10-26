package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.awt.Font;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

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

	// Event Listener on Button[#cancelButton].onAction
	@FXML
	public void cancelButtonClicked(ActionEvent event) {
		
		// Write your code here

	}
	// Event Listener on Button[#finishButton].onAction
	@FXML
	public void finishButtonClicked(ActionEvent event) {
		
		// Write your code here
		
	}
}
