package prob3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {
	@FXML private Text actiontarget;
	@FXML private TextField userName;
	@FXML private PasswordField passwordField;
	
	@FXML protected void handleSignInButtonAction(ActionEvent e){ 
		actiontarget.setText("Sign in button pressed");
		System.out.println("User Name: " + userName.getText());
		System.out.println("Password: " + passwordField.getText());
	}
}
