package sysley;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	/**
	 * @author Jose
	 * @param Metodo que inicia el primer form al inciar el programa
	 * 
	 */
	  public void start(Stage primaryStage) {
	    try {
	    	Parent root1 = FXMLLoader.load(getClass().getResource("ingresoParlamento.fxml"));
	    	Scene scene = new Scene(root1);
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	  }
	  String useradmin2 = "willson61";
	  String adminpass2 = "5761";
	  
	public String getUseradmin2() {
		return useradmin2;
	}

	public void setUseradmin2(String useradmin2) {
		this.useradmin2 = useradmin2;
	}

	public String getAdminpass2() {
		return adminpass2;
	}

	public void setAdminpass2(String adminpass2) {
		this.adminpass2 = adminpass2;
	}

	public static void main(String[] args) {
		  launch(args);
	  }
}
