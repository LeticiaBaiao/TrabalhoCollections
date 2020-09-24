package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import Pages.ListarProdutos;
import Pages.Menu;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//import Pages.ListarProdutos;

public class MenuController implements Initializable {

	@FXML
	private Button btListarProdutos;

	@FXML
	private Button btSair;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btSair.setOnMouseClicked((MouseEvent e) -> {
			Fechar();
		});

		btSair.setOnKeyPressed((KeyEvent e) -> {
			if(e.getCode() == KeyCode.ENTER) {
				Fechar();
			}
		});
		btListarProdutos.setOnMouseClicked((MouseEvent e) -> {
			abreProdutos();
		});
	}

		public void abreProdutos(){
		ListarProdutos p = new ListarProdutos();
		Menu.getStage().close();
		try {
			p.start(new Stage());
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void Fechar() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText("Aplicaço encerrada!");
		alert.setContentText("Vale um 10");
		alert.showAndWait();
		if(alert.getResult() == ButtonType.OK) {
			Menu.getStage().close();
		}
	}
}
