package Pages;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlterarProdutos extends Application {
	private static Stage stage;//uma janela

	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/View/AlterarProduto.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Alterar Produtos");
		stage.setScene(scene);//Coloca a cena na Janela
		stage.show();//abre a janela2
		setStage(stage);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		AlterarProdutos.stage = stage;
	}
}
