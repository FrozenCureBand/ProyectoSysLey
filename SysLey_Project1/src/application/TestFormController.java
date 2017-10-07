package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TestFormController {
	
	@FXML
    private Label User;

    @FXML
    private Label UserName;

    @FXML
    private Label UserLastName;

    @FXML
    private Label PP;

    @FXML
    private Label Parl;

    @FXML
    private Label userpass;
    
    @FXML
    private Button test;	
    String nombre, apellido, usuario, contra, pp, par;
    Users objusers = new Users(null, null, null, null, null, null);
    
    public void Test(ActionEvent event) {
    		nombre = objusers.getUserName();
    		apellido = objusers.getUserName();
    		usuario = objusers.getUserTag();
    		UserName.setText(nombre);
    		UserLastName.setText(apellido);
    		User.setText(usuario);
    }

}
