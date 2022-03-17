package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Formulir Mahasiswa");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		
		Scene scene1 = new Scene(grid, 600, 500);
		
		
		Text welcomeTxt = new Text("Pengisian Formulir");
		welcomeTxt.setFont(Font.font("Tahoma", FontWeight.BOLD,25));
		grid.add(welcomeTxt, 0, 0);
		
		Label lblUser = new Label("Nama");
		grid.add(lblUser, 0, 1);
		
		TextField txtUser=new TextField();
		grid.add(txtUser, 1, 1);
		txtUser.setMaxSize(200, 10);
		
		Label lblNIM = new Label("NIM");
		grid.add(lblNIM, 0, 2);
		
		TextField txtnim=new TextField();
		grid.add(txtnim, 1, 2);
		txtnim.setMaxSize(200, 10);
		
		Label lblfaculty = new Label("Fakultas");
		grid.add(lblfaculty, 0, 3);
		
		TextField txtfct=new TextField();
		grid.add(txtfct, 1, 3);
		txtfct.setMaxSize(200, 10);
		
		Label lblmajor = new Label("Jurusan");
		grid.add(lblmajor, 0, 4);
		
		TextField txtmjr=new TextField();
		grid.add(txtmjr, 1, 4);
		txtmjr.setMaxSize(200, 10);
		
		Label lbllocation = new Label("Alamat");
		grid.add(lbllocation, 0, 5);
		
		TextField txtloc=new TextField();
		grid.add(txtloc, 1, 5);
		txtloc.setMaxSize(200, 10);
		
		Label lblnative = new Label("Kota asal");
		grid.add(lblnative, 0, 6);
		
		TextField txtasal=new TextField();
		grid.add(txtasal, 1, 6);
		txtasal.setMaxSize(200, 10);
		
		Label lblhoby = new Label("Hobi");
		grid.add(lblhoby, 0, 7);
		
		TextField txthobi=new TextField();
		grid.add(txthobi, 1, 7);
		txthobi.setMaxSize(200, 10);
		
		VBox g = new VBox(5);
        g.setPadding(new Insets(20,20,20,20));
        g.setAlignment(Pos.TOP_LEFT);
        
        Text welcome=new Text("Selamat Datang");
		welcome.setFont(Font.font("Tahoma", FontWeight.BOLD,25));
		g.getChildren().add(welcome);
        
        
        Label lnama = new Label();
        Label lnim = new Label();
        Label lfac = new Label();
        Label ljur = new Label();
        Label lal = new Label();
        Label lkot = new Label();
        Label lhob = new Label();

        g.getChildren().add(lnama);
        g.getChildren().add(lnim);
        g.getChildren().add(lfac);
        g.getChildren().add(ljur);
        g.getChildren().add(lal);
        g.getChildren().add(lkot);
        g.getChildren().add(lhob);
        
		Scene scene2 = new Scene(g, 400, 300);
		
		Button createbtn = new Button("Create");
		grid.add(createbtn, 1, 8);
		createbtn.setOnAction(new EventHandler<ActionEvent> () {
			
			@Override
			public void handle(ActionEvent event) {
				
				primaryStage.setScene(scene2);
				
				lnama.setText("Nama      : "+ txtUser.getText());
				lnim.setText("NIM         : "+ txtnim.getText());
				lfac.setText("Fakultas   : "+ txtfct.getText());
				ljur.setText("Jurusan    : "+ txtmjr.getText());
				lal.setText("Alamat     : "+ txtloc.getText());
				lkot.setText("Kota Asal : "+ txtasal.getText());
				lhob.setText("Hobi         : "+ txthobi.getText());
				
			}
		});
		
		Button createnew = new Button("Create New");
		g.getChildren().add(createnew);
		createnew.setMaxSize(100, 10);
		createnew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
                txtUser.clear();
                txtnim.clear();
                txtfct.clear();
                txtmjr.clear();
                txtloc.clear();
                txtasal.clear();
                txthobi.clear();
            }
        });
		
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
}
	
