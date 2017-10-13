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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ingresoParlamentoController implements Initializable {
	@FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private TextField txtNombreParlamento;

    @FXML
    private TextField txtIdParlamento;

    @FXML
    private Button btnIngresar;
    Parlamento PT;
	@Override
	public void initialize(URL location, ResourceBundle resources){
		if(HomeData.getParlamentos().size() == 0) {
			if(HomeData.parlamentos.size() == 0) {
				try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("crearParlamento.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root1));
				stage.show();
				}catch(IOException e) {
				e.printStackTrace();
				}
			
			}
		}
	}	
	
	public void IngresarParlamento(ActionEvent event) throws IOException {
		String nombreparlamento = txtNombreParlamento.getText().toString();
		int idparlamento = Integer.parseInt(txtIdParlamento.getText());
		if(HomeData.parlamentos.size() != 0) {
			//Parlamento PT = new Parlamento();
			for(int i = 0; i <HomeData.getParlamentos().size(); i++) {
				PT = HomeData.parlamentos.get(i);
				if((PT.getId() == idparlamento) && (PT.getNombre().equals(nombreparlamento))) {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeSystem.fxml"));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setScene(new Scene(root1));
					stage.show();
				}
				else {
					//mostrar mensaje de que los datos ingresados son erroneos o no existe parlamento con tales datos
				}
			}
		}
	}

}
