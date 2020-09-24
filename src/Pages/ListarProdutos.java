/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Home
 */
public class ListarProdutos extends Application {
    private static Stage stage;//uma jenla
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/ListarProduto.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Lista de Produtos");
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
    	ListarProdutos.stage = stage;
    }

}
