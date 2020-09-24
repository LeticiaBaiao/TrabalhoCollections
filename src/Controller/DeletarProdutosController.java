package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Pages.Deletar;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static Model.GlobalProdutos.produtoList;

public class DeletarProdutosController implements Initializable {

	@FXML
	private Button btFechar;

	@FXML
	private TextField txId;

	@FXML
	private Button btDeletar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btDeletar.setOnMouseClicked((MouseEvent e) -> {
			Deletar();
		});
		btFechar.setOnMouseClicked((MouseEvent e) -> {
			Fechar();
		});
	}

	public void Deletar() {
		int id = Integer.parseInt(txId.getText());
		for(int i = 0; i < produtoList.size(); i++) {
			if(id == produtoList.get(i).getCodigo()) {
				produtoList.remove(i);
			}
		}
		Fechar();
	}

	public void Fechar() {
		Deletar.getStage().close();
	}
}