package javafxlogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class LoginScene1Controller implements Initializable {
    

    
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnLogin;
    @FXML
    private Label txtMessage;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clearMessage(KeyEvent event) {
        txtMessage.setText("");
    }

    @FXML
    private void btnCancelClicked(ActionEvent event) {
        txtUserName.setText("");
        txtPassword.setText("");
        txtMessage.setText("");
    }

    @FXML
    private void btnLoginClicked(ActionEvent event) {
        
        String user = txtUserName.getText();
        String pwd = txtPassword.getText();
        
        if( user.equals("Lisa Simpson") && 
            pwd.equals("saxophone")) {
            txtMessage.setText("Welcome valid user...");
            //TODO allow user to get in the system
        }
        else {
            txtMessage.setText("Invalid credentials - Try again");
        }
                  
    }
    
}
