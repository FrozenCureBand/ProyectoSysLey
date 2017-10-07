package application;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HomePageController {
	public String user1 = "dipune502";
	public String user2 = "dipfcn502";
	public String user3 = "diplider502";
	public String user4 = "dipgana502";
	public String user5 = "dipunionista502";
	public String law1 = "Ley 12, ART 34";
	public String law2 = "Ley 56, ART 12";
	public String law3 = "Ley 89, ART 09";
	public String[] Users = new String[999];
	public String[] Laws = new String[999];
	@FXML
	private TitledPane HomePage;
	@FXML
	private Label mostrarfecha;
	@FXML
	private Button userbutton;
	@FXML
	private Button lawbutton;
	@FXML
	private Button rulebutton;
	@FXML
	public void Users(ActionEvent event) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Users.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));
		stage.show();
		
		/*
		Users[0] = user1;
		Users[2] = user2;
		Users[3] = user3;
		Users[4] = user4;
		Users[5] = user5;
		BorderPane root = new BorderPane();
	    Scene scene = new Scene(root, 400, 250, Color.WHITE);

	    GridPane gridpane = new GridPane();
	    gridpane.setPadding(new Insets(5));
	    gridpane.setHgap(10);
	    gridpane.setVgap(10);
	    ColumnConstraints column1 = new ColumnConstraints(150, 150,
	        Double.MAX_VALUE);
	    ColumnConstraints column2 = new ColumnConstraints(50);
	    ColumnConstraints column3 = new ColumnConstraints(150, 150,
	        Double.MAX_VALUE);
	    column1.setHgrow(Priority.ALWAYS);
	    column3.setHgrow(Priority.ALWAYS);
	    gridpane.getColumnConstraints().addAll(column1, column2, column3);

	    Label candidatesLbl = new Label("Usuarios Activos");
	    GridPane.setHalignment(candidatesLbl, HPos.CENTER);
	    gridpane.add(candidatesLbl, 0, 0);

	    Label selectedLbl = new Label("Ban Users");
	    gridpane.add(selectedLbl, 2, 0);
	    GridPane.setHalignment(selectedLbl, HPos.CENTER);

	    // Candidates
	    final ObservableList<String> candidates = FXCollections
	        .observableArrayList(user1, user2, user3, user4, user5);
	    final ListView<String> candidatesListView = new ListView<>(candidates);
	    gridpane.add(candidatesListView, 0, 1);

	    final ObservableList<String> selected = FXCollections.observableArrayList();
	    final ListView<String> heroListView = new ListView<>(selected);
	    gridpane.add(heroListView, 2, 1);

	    Button sendRightButton = new Button(" > ");
	    sendRightButton.setOnAction((ActionEvent event1) -> {
	      String potential = candidatesListView.getSelectionModel()
	          .getSelectedItem();
	      if (potential != null) {
	        candidatesListView.getSelectionModel().clearSelection();
	        candidates.remove(potential);
	        selected.add(potential);
	      }
	    });

	    Button sendLeftButton = new Button(" < ");
	    sendLeftButton.setOnAction((ActionEvent event2) -> {
	      String s = heroListView.getSelectionModel().getSelectedItem();
	      if (s != null) {
	        heroListView.getSelectionModel().clearSelection();
	        selected.remove(s);
	        candidates.add(s);
	      }
	    });
	    VBox vbox = new VBox(5);
	    vbox.getChildren().addAll(sendRightButton, sendLeftButton);

	    gridpane.add(vbox, 1, 1);
	    root.setCenter(gridpane);

	    GridPane.setVgrow(root, Priority.ALWAYS);
	    Stage stage = new Stage();
	    stage.setScene(scene);
	    stage.show();
	    */
	  }
	public void Laws(ActionEvent event) throws IOException {
		
		BorderPane root = new BorderPane();
	    Scene scene = new Scene(root, 400, 250, Color.WHITE);

	    GridPane gridpane = new GridPane();
	    gridpane.setPadding(new Insets(5));
	    gridpane.setHgap(10);
	    gridpane.setVgap(10);
	    ColumnConstraints column1 = new ColumnConstraints(150, 150,
	        Double.MAX_VALUE);
	    ColumnConstraints column2 = new ColumnConstraints(50);
	    ColumnConstraints column3 = new ColumnConstraints(150, 150,
	        Double.MAX_VALUE);
	    column1.setHgrow(Priority.ALWAYS);
	    column3.setHgrow(Priority.ALWAYS);
	    gridpane.getColumnConstraints().addAll(column1, column2, column3);

	    Label candidatesLbl = new Label("Leyes Disponibles");
	    GridPane.setHalignment(candidatesLbl, HPos.CENTER);
	    gridpane.add(candidatesLbl, 0, 0);

	    Label selectedLbl = new Label("Ley para prestamo");
	    gridpane.add(selectedLbl, 2, 0);
	    GridPane.setHalignment(selectedLbl, HPos.CENTER);

	    // Candidates
	    final ObservableList<String> candidates = FXCollections
	        .observableArrayList(law1, law2, law3);
	    final ListView<String> candidatesListView = new ListView<>(candidates);
	    gridpane.add(candidatesListView, 0, 1);

	    final ObservableList<String> selected = FXCollections.observableArrayList();
	    final ListView<String> heroListView = new ListView<>(selected);
	    gridpane.add(heroListView, 2, 1);

	    Button sendRightButton = new Button(" > ");
	    sendRightButton.setOnAction((ActionEvent event1) -> {
	      String potential = candidatesListView.getSelectionModel()
	          .getSelectedItem();
	      if (potential != null) {
	        candidatesListView.getSelectionModel().clearSelection();
	        candidates.remove(potential);
	        selected.add(potential);
	      }
	    });

	    Button sendLeftButton = new Button(" < ");
	    sendLeftButton.setOnAction((ActionEvent event2) -> {
	      String s = heroListView.getSelectionModel().getSelectedItem();
	      if (s != null) {
	        heroListView.getSelectionModel().clearSelection();
	        selected.remove(s);
	        candidates.add(s);
	      }
	    });
	    VBox vbox = new VBox(5);
	    vbox.getChildren().addAll(sendRightButton, sendLeftButton);

	    gridpane.add(vbox, 1, 1);
	    root.setCenter(gridpane);

	    GridPane.setVgrow(root, Priority.ALWAYS);
	    Stage stage = new Stage();
	    stage.setScene(scene);
	    stage.show();
		
		}
	
	
	
public void Laws1(ActionEvent event) throws IOException {
	
	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Laws.fxml"));
	Parent root1 = (Parent) fxmlLoader.load();
	Stage stage = new Stage();
	stage.setScene(new Scene(root1));
	stage.show();
	}
}
		

	
