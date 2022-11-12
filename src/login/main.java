package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class main extends Application {
	
	public static Connection getConnection() throws Exception{
		  try{
		   String driver = "com.mysql.cj.jdbc.Driver";
		   String url = "jdbc:mysql://127.0.0.1:3306/login";
		   String username = "root";
		   String password = "Christian26";
		   Class.forName(driver);
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   System.out.println("Connected");
		   return conn;
		  } catch(Exception e)
		  	{
			  System.out.println(e);
			 }
		  return null;
		 }
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("DESCRIBE login");
			ResultSet result = create.executeQuery();
			
			BorderPane root1 = new BorderPane();
			Scene scene1 = new Scene(root1,500,700);
			root1.setStyle("-fx-background-image: url('bg.png'); ");
					
					
			BorderPane root2 = new BorderPane();
			Scene scene2 = new Scene(root2,500,700);
			root2.setStyle("-fx-background-image: url('bg.png'); ");
			
			BorderPane root3 = new BorderPane();
			Scene scene3 = new Scene(root3, 500, 700);
			root3.setStyle("-fx-background-image: url('bg.png'); ");
			
			BorderPane root4 = new BorderPane();
			Scene scene4 = new Scene(root4, 500, 700);
			root4.setStyle("-fx-background-image: url('bg.png'); ");
			
			
			//scene 1
			Image img = new Image("head.png");
			VBox v1 = new VBox();
			
			Button EB = new Button("Employee");
			EB.setTranslateY(100);
			EB.setTranslateX(190);
			EB.setFont(Font.font(null, FontWeight.BOLD, 17));
			EB.setUnderline(false);
			EB.setTextFill(Color.WHITE);
			EB.setMaxWidth(110);
			EB.setMinWidth(110);
			EB.setMaxHeight(45);
			EB.setMinHeight(45);
			EB.setStyle(" -fx-font-size: 1.4em; fx-color: #000000; -fx-background-color: #8b0100; -fx-background-radius: .5em; -fx-text-decoration: bold;");
			EB.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    		primaryStage.setScene(scene2);
			    		primaryStage.show();
			    	}
			});
			
			Button SB = new Button("Student");
			SB.setTranslateY(120);
			SB.setTranslateX(190);
			SB.setFont(Font.font(null, FontWeight.BOLD, 17));
			SB.setUnderline(false);
			SB.setMaxWidth(110);
			SB.setTextFill(Color.WHITE);
			SB.setMinWidth(110);
			SB.setMaxHeight(45);
			SB.setMinHeight(45);
			SB.setStyle("-fx-text-decoration: bold; -fx-font-size: 1.4em; fx-color: #000000; -fx-background-color: #c8bc00; -fx-background-radius: .5em; -fx-text-decoration: bold;");
			SB.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    		primaryStage.setScene(scene1);
			    		primaryStage.show();
			    	}
			});
			
			
			
			v1.getChildren().addAll(new ImageView(img), EB,  SB);
			root1.setCenter(v1);
			
			
//scene 2
			
			VBox v2 = new VBox();
			
			Button b = new Button("<");
			b.setMaxWidth(40);
			b.setMinWidth(40);
			b.setMaxHeight(40);
			b.setMinHeight(40);
			b.setTranslateX(17);
			b.setTranslateY(-30);
			b.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			b.setTextFill(Color.WHITE);
			b.setStyle(" fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
			b.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    		
			    		primaryStage.setScene(scene1);
			    		primaryStage.show();
			    	}
			});
			
			Label Elogin = new Label("Employee Log In");
			Elogin.setTranslateY(10);
			Elogin.setTranslateX(150);
			Elogin.setTextFill(Color.BLACK);
			Elogin.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 23));
			Elogin.setUnderline(true);
			
			GridPane grid2 = new GridPane();
			grid2.setVgap(2);
			grid2.setHgap(2);
			grid2.setTranslateY(0);
			
			
			
			///////////////////////////////////////////////////////////
			
			
			TextField email = new TextField("Email");
			email.setMaxWidth(250);
			email.setMaxHeight(10);
			email.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			email.setTranslateY(35);
			email.setTranslateX(120);
			email.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    }
			}
			);
			
			TextField pass = new TextField("Password");
			pass.setMaxWidth(250);
			pass.setMaxHeight(10);
			pass.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			pass.setTranslateY(50);
			pass.setTranslateX(120);
			pass.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    }
			}
			);
			
			Button SU = new Button("Sign Up");
			SU.setMaxWidth(60);
			SU.setMinWidth(60);
			SU.setMaxHeight(20);
			SU.setMinHeight(20);
			SU.setTranslateX(215);
			SU.setTranslateY(20);
			SU.setTextFill(Color.WHITE);
			SU.setStyle(" -fx-font-size: .7em; fx-color: #c8bd00; -fx-background-color: #c8bd00; -fx-background-radius: .5em;");
			SU.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    		
			    		primaryStage.setScene(scene4);
			    		primaryStage.show();
			    	}
			});
			
			Button SI = new Button("Sign In");
			
			SI.setMaxWidth(130);
			SI.setMinWidth(130);
			SI.setMaxHeight(55);
			SI.setMinHeight(55);
			SI.setTextFill(Color.WHITE);
			SI.setStyle(" -fx-font-size: 1.4em; fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
			SI.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    		
			    		primaryStage.setScene(scene1);
			    		primaryStage.show();
			    	}
			});
			
			
			grid2.add(SI, 90, 80);
			v2.getChildren().addAll(new ImageView(img), b, Elogin,  email, pass, grid2, SU);
			root2.setCenter(v2);

			//////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////
			
			
			
			
			/////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////
			/////////////scene 4
			
			VBox v4 = new VBox();
			
			Button b2 = new Button("<");
			b2.setMaxWidth(40);
			b2.setMinWidth(40);
			b2.setMaxHeight(40);
			b2.setMinHeight(40);
			b2.setTranslateX(17);
			b2.setTranslateY(-30);
			b2.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			b2.setTextFill(Color.WHITE);
			b2.setStyle(" fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
			b2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    		primaryStage.setScene(scene2);
			    		primaryStage.show();
			    	}
			});
			
			Label Elogin2 = new Label("Employee Sign Up");
			Elogin2.setTranslateY(10);
			Elogin2.setTranslateX(140);
			Elogin2.setTextFill(Color.BLACK);
			Elogin2.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 23));
			Elogin2.setUnderline(true);
			
			GridPane grid4 = new GridPane();
			grid4.setVgap(2);
			grid4.setHgap(2);
			grid4.setTranslateY(0);
			
			TextField email2 = new TextField("Email");
			email2.setMaxWidth(250);
			email2.setMaxHeight(10);
			email2.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			email2.setTranslateY(35);
			email2.setTranslateX(120);
			email2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	
			    }
			}
			);
			
			TextField pass2 = new TextField("Password");
			pass2.setMaxWidth(250);
			pass2.setMaxHeight(10);
			pass2.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			pass2.setTranslateY(50);
			pass2.setTranslateX(120);
			pass2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    }
			}
			);
			
			ChoiceBox<String> type1 = new ChoiceBox();
			type1.getItems().add( "Processor");
			type1.getItems().add("Cook");
			type1.setValue("Type");
			type1.setMaxWidth(250);
			type1.setMaxHeight(10);
			type1.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			type1.setTranslateY(65);
			type1.setTranslateX(120);
			type1.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    }
			}
			);
			
			Button SI2 = new Button("Sign Up");
			
			SI2.setMaxWidth(130);
			SI2.setMinWidth(130);
			SI2.setMaxHeight(55);
			SI2.setMinHeight(55);
			SI2.setTextFill(Color.WHITE);
			SI2.setStyle(" -fx-font-size: 1.4em; fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
			SI2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	primaryStage.setScene(scene1);
			    	primaryStage.show();
			    	}
			});
			
			
			grid4.add(SI2, 90, 80);
			v4.getChildren().addAll(new ImageView(img), b2, Elogin2,  email2, pass2, type1, grid4);
			root4.setCenter(v4);
			
			
			
			
			
			
			
			
			
			primaryStage.setScene(scene1);
			primaryStage.setTitle("Sun Devil Slices");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
