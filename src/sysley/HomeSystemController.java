package sysley;

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
import javafx.stage.Stage;

public class HomeSystemController implements Initializable{
	@FXML
	private Button btnParlamento;
	@FXML
	private Button btnUsuario;
	@FXML
	private Button btnLeyes;
	@FXML
	private Button btnReglamentos;
	@FXML
	private Button btnSalir;
	Parlamento PT1;
	
	/**
	 * @author Jose
	 * @param Metodo que inicia componentes antes de iniciar el form
	 * 
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ingresoParlamentoController ob1 = new ingresoParlamentoController();
				CrearUsuarioController ob2 = new CrearUsuarioController();
				if(ob1.PT != null) {
					PT1 = ob1.PT;
				}
				if(ob2.PT1 != null) {
					PT1 = ob2.PT1;
				}
	}
	/**
	 * @author Jose
	 * @param Metodo que inicia el form infoparlamento cuando da click al boton Parlamento
	 */
	public void abrirParlamentoInfo(ActionEvent event) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoParlamentos.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
	/**
	 * @author Jose
	 * @param Metodo que inicia el form infoUsuario cuando da click al boton Usuario
	 */
    public void abrirUsuarioInfo(ActionEvent event) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoUsuario.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));
		stage.show();
		
	}

}
