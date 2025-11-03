package br.senai.sp.jandira.tabuada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        Scene scene = new Scene(root);

        //Definir o tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);

        //
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: blue");

        scene.setRoot(header);
        stage.setScene(scene);
        stage.setTitle("Tabuada");
        stage.show();
    }
}
