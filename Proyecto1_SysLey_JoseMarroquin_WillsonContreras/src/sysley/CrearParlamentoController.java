package sysley;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class CrearParlamentoController {
	@FXML
	private Label lbl1;
	@FXML
	private Label lbl2;
	@FXML
	private TextField txtNuevoNomParlamento;
	@FXML
	private TextField txtNuevoIdParlamento;
	@FXML
	private Label lbl3;
	@FXML
	private Button btnCrear;
	Parlamento PT;
	public void crearParlamento(ActionEvent event) throws IOException{
		
		String nuevonomparlamento = txtNuevoNomParlamento.getText().toString();
		int nuevoidparlamento = Integer.parseInt(txtNuevoIdParlamento.getText());
		int cont = 0;
		if((!nuevonomparlamento.equals("")) && (nuevoidparlamento != 0)) {
			
			if(HomeData.parlamentos.size() == 0) {
				PT = new Parlamento(nuevonomparlamento, nuevoidparlamento);
				HomeData.parlamentos.add(HomeData.contP, PT);
				HomeData.contP = HomeData.contP + 1;
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CrearUsuario.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root1));
				stage.show();
			}
			else {
				Parlamento PT2 = new Parlamento();
				for(int i = 0; i <HomeData.parlamentos.size(); i++) {
					PT2 = HomeData.parlamentos.get(i);
					if((PT2.getId() == nuevoidparlamento) || (PT2.getNombre().equals(nuevonomparlamento))) {
						//mostrar mensaje de que ya existe un parlamento con el mismo nombre o identificador ingresado
						break;
					}
					cont++;
				}
				if(cont == HomeData.parlamentos.size()) {
					PT = new Parlamento(nuevonomparlamento, nuevoidparlamento);
					HomeData.parlamentos.add(HomeData.contP, PT2);
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CrearUsuario.fxml"));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setScene(new Scene(root1));
					stage.show();
				}
			}
		}
		else {
			//mostrar mensaje de que los text box deben tener valores ingresados para brear parlamento
		}
		
	}
	
}
