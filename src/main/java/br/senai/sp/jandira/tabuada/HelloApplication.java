package br.senai.sp.jandira.tabuada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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

        //cabeçalho da tela
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: blue");

        //Adicionar um label ao header
        Label labelTitulo = new Label("Tabuada");
        labelTitulo.setStyle("-fx-text-fill: white;-fx-font-size: 30;-fx-font-weight: bold");
        Label labelSubTitulo= new Label("Construa tabuadas sem limites");
        labelSubTitulo.setStyle("-fx-text-fill: beige;-fx-font-size: 15");

        header.getChildren().add(labelTitulo);
        header.getChildren().add(labelSubTitulo);

        //Colocar o header no root
        root.getChildren().addAll(header);

        //Criar o multiplicando
        HBox multiplicando = new HBox();
        Label labelMultiplicando = new Label("Multiplicando");
        TextField textFieldMultiplicando = new TextField();

        multiplicando.getChildren().add(labelMultiplicando);
        multiplicando.getChildren().add(textFieldMultiplicando);

        //colocando o multiplicando no root
        root.getChildren().add(multiplicando);

        HBox minMultiplicador = new HBox();
        Label labelMinMultiplicador = new Label("MinMultiplicador");
        TextField textFieldMinMultiplicador = new TextField();

        minMultiplicador.getChildren().add(labelMinMultiplicador);
        minMultiplicador.getChildren().add(textFieldMinMultiplicador);

        //colocando o minMultiplicador no root
        root.getChildren().add(minMultiplicador);

        HBox maxMultiplicador = new HBox();
        Label labelMaxMultiplicador = new Label("MaxMultiplicador");
        TextField textFieldMaxMultiplicador = new TextField();

        maxMultiplicador.getChildren().add(labelMaxMultiplicador);
        maxMultiplicador.getChildren().add(textFieldMaxMultiplicador);

        //colocando o maxMultiplicador no root
        root.getChildren().add(maxMultiplicador);

        stage.setScene(scene);
        stage.setTitle("Tabuada");
        stage.show();
    }
}
