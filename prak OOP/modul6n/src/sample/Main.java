package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("CRUD JADWAL");

        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(60,60,60,60));
        Scene welcomeScene = new Scene(gp,500,500);

        primaryStage.setScene(welcomeScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
