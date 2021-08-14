package application;


import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private Button btLogin;

	@FXML
	private Label lblUserName;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	public void Login(ActionEvent event) throws Exception {

		Stage primaryStage = new Stage();
		
		Parent root;
		
		try {
			root = FXMLLoader.load(getClass().getResource("WaitingRoomDesign.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			Stage stage11 = (Stage) btLogin.getScene().getWindow();
			Platform.runLater(() -> {
			stage11.close();
				});
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}	
	


