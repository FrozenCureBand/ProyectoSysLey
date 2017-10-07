package application;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.awt.Choice;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.MenuBar;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class AdminLoginController {
	
	    @FXML
	    private ChoiceBox<String> partido;
		
	 	@FXML
	    private TextField adminuser;
	    @FXML
	    private TextField adminpass;

	@FXML
	public String useradmin1 = "adminsysley1";
	@FXML
	public String adminpass1 = "1234";
	
	public void UserCreator(ActionEvent event) throws IOException {
		
		if(adminuser.getText().equals(useradmin1) && adminpass.getText().equals(adminpass1)) {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UserCreation.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.show();
			
		}
		
	}
	
	//@FXML
    //private void btnCitiesRefresh_action(ActionEvent event)
   // {
		
		//LMUParser lmuParser;
      //  ArrayList<String> cities = lmuParser.getCities();
       // ObservableList<String> list = FXCollections.observableArrayList(cities);


       // for (int i = 0; i < cities.size(); i++){

         //   list.add(i, cities.get(i));
            //list.add(i, cities.get(i));

       // }

      //  partido.setItems(FXCollections.observableArrayList("One","Two","Three"));
   // }

}


