package com.example.d23javafxhelloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    //TextField tfInput = null;
    List<Lazy<Car>> myCars = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();

        TextField tfInput = new TextField();
        Button btnClick = new Button("Click me");
        btnClick.setLayoutX(100);
        btnClick.setLayoutY(200);


        root.getChildren().addAll(tfInput,  btnClick);



        btnClick.setOnAction((e) -> {

            for(Lazy<Car> c: myCars)
            {
                System.out.println("myCars: " + c.getValue().getBrand());
            }

        });

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

        //myCars.add(new Car("Lotus"));
        //myCars.add(new Car("Porsche"));
        //myCars.add(new Car("Audi"));


        myCars.add(new Lazy<Car>(() -> new Car("Mazda")));
        myCars.add(new Lazy<Car>(() -> new Car("Ford")));
        myCars.add(new Lazy<Car>(() -> new Car("Opel")));


    }

    public static void main(String[] args) {
        launch();
    }



}