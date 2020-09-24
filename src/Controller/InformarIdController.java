package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Pages.AlterarProdutos;
import Pages.Deletar;
import Pages.InformarId;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static Model.GlobalProdutos.idAlterar;

public class InformarIdController implements Initializable {

	@FXML
	private Button btFechar;

	@FXML
	private TextField txId;

	@FXML
	private Button btSeguinte;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btSeguinte.setOnMouseClicked((MouseEvent e) -> {
			abreAlterar();
		});
		btFechar.setOnMouseClicked((MouseEvent e) -> {
			Fechar();
		});
	}

	public void abreAlterar() {
		idAlterar = Integer.parseInt(txId.getText());
		AlterarProdutos p = new AlterarProdutos();
		try {
			p.start(new Stage());
			Fechar();
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Fechar() {
		InformarId.getStage().close();
	}
}
