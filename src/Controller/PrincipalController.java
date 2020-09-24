package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import Pages.Menu;
import Pages.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PrincipalController implements Initializable {

	@FXML
	private TextField txUsuario;

	@FXML
	private PasswordField txSenha;

	@FXML
	private Button btEntrar;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		btEntrar.setOnMouseClicked((MouseEvent e) -> {
			Conectar();
		});

		btEntrar.setOnKeyPressed((KeyEvent e) -> {
			Conectar();
		});

		// TODO
	}

	public void Fechar() {
		Principal.getStage().close();
	}

	public void Conectar() {
		String Usuario = txUsuario.getText();
		String Senha = txSenha.getText();
		if(Usuario.equals("leticia") && Senha.equals("12345")) {
			abreMenu();
		} else {
			Alert al = new Alert(Alert.AlertType.ERROR);
			al.setHeaderText("Erro na Conecão!");
			al.show();
		}
	}

	public void abreMenu() {
		Menu p = new Menu();
		Fechar();
		try {
			p.start(new Stage());
		} catch (IOException ex) {
			Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

