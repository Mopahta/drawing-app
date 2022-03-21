package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Drawing Operations");


//        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
//
//        FiguresList figuresList = new FiguresList();
//        drawShapes(figuresList, gc);
//        root.getChildren().add(drawingCanvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
