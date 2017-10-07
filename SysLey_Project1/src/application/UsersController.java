package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UsersController implements Initializable {
	UserCreationController objusers = new UserCreationController();
	ObservableList<String> Users = FXCollections.observableArrayList("dipune502","dipgana502","dipParPat502","dipunion502","diplider502");
	String UserName1  = "Gordon";
	@FXML
    private Label DisplayUserName;

    @FXML
    private Label DisplayUserLastName;

    @FXML
    private Label DisplayUserBirth;

    @FXML
    private Button ModifyUser;

    @FXML
    private Button KillUser;

    @FXML
    private Label DisplayUserPP;

    @FXML
    private Label DisplayUserBirth1;

    @FXML
    private ComboBox<String> cbusers;
    
    @FXML
	private URL location;
	
	@FXML
	private ResourceBundle resources;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//cbusers.getItems().removeAll(cbusers.getItems());
		//cbusers.getItems().addAll("Option A", "Option B", "Option C");
		cbusers.setItems(Users);
	}
	
	public Users [ ] ExistUsers = new Users [1000];
	
    public void SelectedUser(ActionEvent event) throws IOException {
    	if(cbusers.getValue() == "dipune502") {
    		DisplayUserName.setText("Gordon");
    		DisplayUserLastName.setText("Cooper");
    		DisplayUserBirth.setText("1927");
    		DisplayUserPP.setText("UNE");
    	}
    	if(cbusers.getValue() == "dipgana502") {
    		DisplayUserName.setText("Walter");
    		DisplayUserLastName.setText("Schirra");
    		DisplayUserBirth.setText("1923");
    		DisplayUserPP.setText("GANA");
    	}
    	if(cbusers.getValue() == "dipParPat502") {
    		DisplayUserName.setText("Eugene");
    		DisplayUserLastName.setText("Cernan");
    		DisplayUserBirth.setText("1934");
    		DisplayUserPP.setText("Partido Patriota");
    	}
    	if(cbusers.getValue() == "dipunion502") {
    		DisplayUserName.setText("Alan");
    		DisplayUserLastName.setText("Shepard");
    		DisplayUserBirth.setText("1923");
    		DisplayUserPP.setText("Unionista");
    	}
    	if(cbusers.getValue() == "diplider502") {
    		DisplayUserName.setText("Neil");
    		DisplayUserLastName.setText("Amstrong");
    		DisplayUserBirth.setText("1931");
    		DisplayUserPP.setText("Lider");
    	}
    }
	}
	

