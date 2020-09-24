package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.Produto;
import Pages.CadastrarProdutos;
import Pages.Deletar;
import Pages.InformarId;
import Pages.ListarProdutos;
import Pages.Menu;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static Model.GlobalProdutos.produtoList;

public class ListarProdutosController implements Initializable {

	@FXML
	private Button btVoltar;

	@FXML
	private Button btAtualizar;

	@FXML
	private TableView<Produto> tabela;

	@FXML
	private TableColumn<Produto, Integer> clnId;

	@FXML
	private TableColumn<Produto, String> clnDescr;

	@FXML
	private TableColumn<Produto, Float> clnPreco;

	@FXML
	private Button btCadastrar;

	@FXML
	private Button btAlterar;

	@FXML
	private Button btDeletar;

	@FXML
	private TextField txPesquisar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btCadastrar.setOnMouseClicked((MouseEvent e) -> {
			abreCadastrar();
		});

		btAtualizar.setOnMouseClicked((MouseEvent e) -> {
			atualizatabela();
		});
		btVoltar.setOnMouseClicked((MouseEvent e) -> {
			abreMenu();
		});
		btAlterar.setOnMouseClicked((MouseEvent e) -> {
			abreInformarId();
		});
		btDeletar.setOnMouseClicked((MouseEvent e) -> {
			abreDeletar();
		});

		txPesquisar.setOnKeyPressed((KeyEvent k) -> {
			pesquisar();
		});

		initable();
	}

	private void pesquisar() {
		List<Produto> produtoPesquisado = new ArrayList<>();
		if(!txPesquisar.getText().equals("")) {
			for(int i = 0; i < produtoList.size(); i++) {
				if(produtoList.get(i).getDescr().contains(txPesquisar.getText())) {
					if(!produtoPesquisado.contains(produtoList.get(i))) {
						produtoPesquisado.add(produtoList.get(i));
					}
				}
			}
			tabela.setItems(FXCollections.observableArrayList(produtoPesquisado));
			tabela.refresh();
		}
		else {
			atualizatabela();
		}

	}

	public void atualizatabela() {
		tabela.setItems(FXCollections.observableArrayList(produtoList));
		tabela.refresh();
	}

	private void abreInformarId() {
		InformarId informarId = new InformarId();
		try {
			informarId.start(new Stage());
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initable() {
		clnId.setCellValueFactory(new PropertyValueFactory("codigo"));
		clnDescr.setCellValueFactory(new PropertyValueFactory("descr"));
		clnPreco.setCellValueFactory(new PropertyValueFactory("preco"));
	}

	public void abreCadastrar() {
		CadastrarProdutos p = new CadastrarProdutos();

		try {
			p.start(new Stage());
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Fechar() {
		ListarProdutos.getStage().close();
	}

	public void abreMenu() {
		Menu menu = new Menu();
		try {
			menu.start(new Stage());
			Fechar();

		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void abreDeletar() {
		Deletar deletar = new Deletar();
		try {
			deletar.start(new Stage());

		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
