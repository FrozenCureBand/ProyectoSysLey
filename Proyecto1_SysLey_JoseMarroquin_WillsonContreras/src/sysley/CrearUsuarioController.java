package sysley;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

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
    public void CrearUsuario(ActionEvent event) {
    	
    	    String nomUs = ingresonombre.getText().toString();
		String apUs = ingresoapellido.getText().toString();
		String anioUs = ingresoyear.getText().toString();
		String partidoUs = selectpartido.getValue().toString();
		String tagUs = ingresousuario.getText().toString();
		String Parlamentos = "";
		if((!nomUs.equals("")) && (!apUs.equals("")) && (!anioUs.equals("")) && (!partidoUs.equals("")) && (!tagUs.equals(""))) {
			Users UserObj = new Users(nomUs,apUs, anioUs, partidoUs, tagUs, Parlamentos);
			Parlamento PT;
			for(int i = 0; i < HomeData.parlamentos.size(); i++) {
				PT = HomeData.parlamentos.get(i);
				if(PT != null) {
					if(PT.getId() == PT1.getId()){
						PT.miembros.add(HomeData.contU, UserObj);
						HomeData.parlamentos.set(i, PT);
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
