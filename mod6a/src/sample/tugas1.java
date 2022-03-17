package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tugas1 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(20,20,20,20));
        gp.setAlignment(Pos.TOP_CENTER);

        VBox g = new VBox(5);
        g.setPadding(new Insets(20,20,20,20));
        g.setAlignment(Pos.TOP_LEFT);

        Scene scene = new Scene(gp, 600, 400);
        Scene scenex = new Scene(g,300,350);

        Label bel = new Label("DATA ANDA");
        Label la = new Label();
        Label lb = new Label();
        Label lc = new Label();
        Label ld = new Label();
        Label le = new Label();
        Label lf = new Label();
        Label lg = new Label();
        g.getChildren().add(bel);
        g.getChildren().add(la);
        g.getChildren().add(lb);
        g.getChildren().add(lc);
        g.getChildren().add(ld);
        g.getChildren().add(le);
        g.getChildren().add(lf);
        g.getChildren().add(lg);

        Label l1 = new Label("WELCOME");
        gp.add(l1, 0, 0,2,1);

        Label l2 = new Label("NIM :");
        gp.add(l2, 0, 1);
        TextField nim = new TextField();
        gp.add(nim, 1, 1);
        nim.setMaxSize(200, 10);

        Label l3 = new Label("Nama :");
        gp.add(l3, 0, 2);
        TextField nama = new TextField();
        gp.add(nama, 1, 2);
        nama.setMaxSize(200, 10);

        Label l4 = new Label("Fakultas :");
        gp.add(l4, 0, 3);
        ComboBox c1 = new ComboBox();
        c1.getItems().add("Fakultas Teknik");
        c1.getItems().add("Fakultas Agama Islam");
        c1.getItems().add("Fakultas Hukum");
        gp.add(c1, 1, 3);
        c1.setMaxSize(200, 10);

        Label l5 = new Label("Jurusan :");
        gp.add(l5, 0, 4);
        ComboBox c2 = new ComboBox();
        c2.getItems().add("Informatika");
        c2.getItems().add("Mesin");
        c2.getItems().add("Sipil");
        c2.getItems().add("Elektro");
        gp.add(c2, 1, 4);
        c2.setMaxSize(200, 10);

        Label l6 = new Label("Alamat :");
        gp.add(l6, 0, 5);
        TextArea ta = new TextArea();
        gp.add(ta, 1, 5);
        ta.setMaxSize(200, 80);

        Label l7 = new Label("Kota :");
        gp.add(l7, 0, 6);
        TextField kota = new TextField();
        gp.add(kota, 1, 6);
        kota.setMaxSize(200, 10);

        Label l8 = new Label("Hobi :");
        gp.add(l8, 0, 7);
        TextField hobi = new TextField();
        gp.add(hobi, 1, 7);
        hobi.setMaxSize(200, 10);

        Button b1 = new Button("Create");
        gp.add(b1, 1, 8);
        b1.setMaxSize(100, 10);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scenex);
                la.setText("Nim         :"+nim.getText());
                lb.setText("Nama      :"+nama.getText());
                lc.setText("Fakultas   :"+c1.getSelectionModel().getSelectedItem());
                ld.setText("Jurusan    :"+c2.getSelectionModel().getSelectedItem());
                le.setText("Alamat     :"+ta.getText());
                lf.setText("Kota         :"+kota.getText());
                lg.setText("Hobi         :"+hobi.getText());

            }
        });

        Button b2 = new Button("Create New");
        g.getChildren().add(b2);
        b2.setMaxSize(100, 10);
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene);
                nim.setText("");
                nama.setText("");
                ta.setText("");
                kota.setText("");
                hobi.setText("");
            }
        });

        primaryStage.setTitle("Modul 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}