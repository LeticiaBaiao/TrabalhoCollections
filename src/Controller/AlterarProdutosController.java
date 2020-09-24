package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Produto;
import Pages.AlterarProdutos;
import Pages.CadastrarProdutos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static Model.GlobalProdutos.produtoList;
import static Model.GlobalProdutos.idAlterar;

public class AlterarProdutosController implements Initializable {

	Produto produto = null;
	@FXML
	private Button btFechar;

	@FXML
	private TextField txDescr;

	@FXML
	private Button btAlterar;

	@FXML
	private TextField txPreco;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btAlterar.setOnMouseClicked((MouseEvent e) -> {
			Alterar();
		});
		btFechar.setOnMouseClicked((MouseEvent e) -> {
			Fechar();
		});
		initCampos();
	}

	public void initCampos() {
		for(int i = 0; i < produtoList.size(); i++) {
			if(idAlterar == produtoList.get(i).getCodigo()) {
				produto = produtoList.get(i);
			}
		}
		String descr = produto.getDescr();
		Float preco = produto.getPreco();
		txDescr.appendText(descr);
		txPreco.appendText(String.valueOf(preco));
	}

	public void Alterar() {
		for(int i = 0; i < produtoList.size(); i++) {
			if(idAlterar == produtoList.get(i).getCodigo()) {
				produtoList.get(i).setDescr(txDescr.getText());
				produtoList.get(i).setPreco(Float.parseFloat(txPreco.getText()));
			}
		}
		Fechar();
	}

	public void Fechar() {
		AlterarProdutos.getStage().close();
	}
}
