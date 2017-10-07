package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserCreationController {
	@FXML
    private Button test;
	
    @FXML // fx:id="ingresonombre"
    private TextField ingresonombre; // Value injected by FXMLLoader

    @FXML // fx:id="ingresoapellido"
    private TextField ingresoapellido; // Value injected by FXMLLoader

    @FXML // fx:id="ingresoyear"
    private TextField ingresoyear; // Value injected by FXMLLoader

    @FXML // fx:id="ingresouser"
    private TextField ingresouser; // Value injected by FXMLLoader

    @FXML // fx:id="ingresopass"
    private TextField ingresopass; // Value injected by FXMLLoader

    @FXML // fx:id="partido"
    private ChoiceBox<?> partido; // Value injected by FXMLLoader

    @FXML // fx:id="parlamento"
    private ChoiceBox<?> parlamento; // Value injected by FXMLLoader

    @FXML // fx:id="finalcreation"
    private Button finalcreation; // Value injected by FXMLLoader
	int k = 0;
	public Users [ ] ExistUsers = new Users [1000];
	public void ingresoDeDatos(ActionEvent event) {
		ingresonombre.getText().toString();
		ingresoapellido.getText().toString();
		ingresoyear.getText().toString();
		ingresouser.getText().toString();
		parlamento.getValue().toString();
		partido.getValue().toString();
		ingresopass.getText().toString();
		k++;
		Users UserObj = new Users(ingresouser.getText(),ingresonombre.getText(), ingresoapellido.getText(), ingresoyear.getText(), parlamento.getValue().toString(), ingresonombre.getText());
		ExistUsers [k] = UserObj;
	}
	
	public void OpenTest(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestForm.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));
		stage.show();
	}
}



