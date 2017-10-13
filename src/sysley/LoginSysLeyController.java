package sysley;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginSysLeyController implements Initializable{
	
	@FXML
    private ImageView logosysley;

    @FXML
    private TextField userfield;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button usercreator;

    @FXML
    private Button loginbutton;

    @FXML
    private Label indicadoringreso;
    
    public String user1 = "dipune502";
	public String user2 = "dipfcn502";
	public String user3 = "diplider502";
	public String user4 = "dipgana502";
	public String user5 = "dipunionista502";
	public String password1 = "123";
    
    public void Login(ActionEvent event) throws IOException {
		indicadoringreso.setText("");
		if(userfield.getText().equals(user1) && passwordfield.getText().equals(password1)) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Test.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			Stage stage1 = (Stage) loginbutton.getScene().getWindow();
			stage1.hide();
			stage.show();
		}else {
			indicadoringreso.setText("Ingreso Denegado");
		}
		if(userfield.getText().equals(user2) && passwordfield.getText().equals(password1)) {
		}else {
			indicadoringreso.setText("Ingreso Denegado");
		}
		if(userfield.getText().equals(user3) && passwordfield.getText().equals(password1)) {
		}else {
			indicadoringreso.setText("Ingreso Denegado");
		}
		if(userfield.getText().equals(user4) && passwordfield.getText().equals(password1)) {
		}else {
			indicadoringreso.setText("Ingreso Denegado");
		}
		if(userfield.getText().equals(user5) && passwordfield.getText().equals(password1)) {
		}else {
			indicadoringreso.setText("Ingreso Denegado");
		}
		
	}
	
	    public void UserCreator(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("Test.fxml"));
		Parent root2 = (Parent) fxmlLoader1.load();
		Stage stage1 = new Stage();
		stage1.setScene(new Scene(root2));
		stage1.show();
		
		
	}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			File file = new File("sysley/SysLeyLogo.png");
	        Image image = new Image(file.toURI().toString());
	        logosysley.setImage(image);
		}

}
