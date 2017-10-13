package sysley;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CrearUsuarioController implements Initializable{
	
	Parlamento PT1;
	
	@FXML
    private TextField ingresonombre;

    @FXML
    private TextField ingresoapellido;

    @FXML
    private TextField ingresousuario;

    @FXML
    private TextField ingresoyear;

    @FXML
    private ChoiceBox<String> selectpartido;

    @FXML
    private Button crearusuario;

    @FXML
    private TextField ingresopass;
    ObservableList<String> PartidoPolitico = FXCollections.observableArrayList("UNE","GANA","UNIONISTA","PARTIDO PATRIOTA","LIDER");
    /**
	 * @author Jose
	 * @param Metodo que inicia el form para crear Usuarios
	 */
    public void CrearUsuario(ActionEvent event) throws IOException{
    	
    	    String nomUs = ingresonombre.getText().toString();
		String apUs = ingresoapellido.getText().toString();
		String anioUs = ingresoyear.getText().toString();
		String partidoUs = selectpartido.getValue().toString();
		String tagUs = ingresousuario.getText().toString();
		String Parlamentos = PT1.getNombre();
		String PassUs = ingresopass.getText().toString();
		if((!nomUs.equals("")) && (!apUs.equals("")) && (!anioUs.equals("")) && (!partidoUs.equals("")) && (!tagUs.equals(""))) {
			Users UserObj = new Users(tagUs, PassUs, nomUs,apUs, anioUs, partidoUs, PT1.getNombre());
			Parlamento PT;
			for(int i = 0; i < HomeData.parlamentos.size(); i++) {
				PT = HomeData.parlamentos.get(i);
				if(UserObj == null) {
					break;
				}
				if(PT != null) {
					if(PT.getId() == PT1.getId()){
						PT.miembros.add(HomeData.contU, UserObj);
						HomeData.contU = HomeData.contU + 1;
						HomeData.parlamentos.set(i, PT);
						UserObj = null;
						FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeSystem.fxml"));
						Parent root1 = (Parent) fxmlLoader.load();
						Stage stage = new Stage();
						stage.setScene(new Scene(root1));
						stage.show();
					}
				}
			}
		}
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		CrearParlamentoController obj = new CrearParlamentoController();
		PT1 = obj.PT;
		selectpartido.setItems(PartidoPolitico);
	}
}
