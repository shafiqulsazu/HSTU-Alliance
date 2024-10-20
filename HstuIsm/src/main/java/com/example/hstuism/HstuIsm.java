package com.example.hstuism;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HstuIsm extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HstuIsm.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        Image image=new Image("C:\\Users\\ASUS\\Desktop\\HstuIsm\\src\\main\\resources\\com\\example\\icons/hstuicon.png");
        stage.getIcons().add(image);
        stage.setTitle("HSTU ISM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(); 
    }
}