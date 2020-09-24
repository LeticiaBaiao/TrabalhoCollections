package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Produto;
import Pages.CadastrarProdutos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static Model.GlobalProdutos.produtoList;

public class CadastrarProdutosController implements Initializable {
	@FXML
	private Button btFechar;

	@FXML
	private TextField txDescr;

	@FXML
	private Button btCadastrar;

	@FXML
	private TextField txPreco;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btCadastrar.setOnMouseClicked((MouseEvent e) -> {
			Cadastrar();
		});
		btFechar.setOnMouseClicked((MouseEvent e) -> {
			Fechar();
		});
	}

	public void Cadastrar() {
		String Desc = txDescr.getText(),
				Preco = txPreco.getText();
		float preco = Float.parseFloat(Preco);

		Produto p = new Produto();
		p.setDescr(Desc);
		p.setPreco(preco);
		p.setCodigo(produtoList.size());
		produtoList.add(p);
		Fechar();
	}

	public void Fechar() {
		CadastrarProdutos.getStage().close();
	}

}
