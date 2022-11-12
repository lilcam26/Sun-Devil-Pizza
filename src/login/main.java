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
			    		primaryStage.setScene(scene3);
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
			
			// scene 3
						VBox v = new VBox();
						
						Button b3 = new Button("<");
						b3.setMaxWidth(40);
						b3.setMinWidth(40);
						b3.setMaxHeight(40);
						b3.setMinHeight(40);
						b3.setTranslateX(17);
						b3.setTranslateY(-30);
						b3.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
						b3.setTextFill(Color.WHITE);
						b3.setStyle(" fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
						b3.setOnAction(new EventHandler<ActionEvent>() {
						    @Override public void handle(ActionEvent e) {
						    	
						    		
						    		primaryStage.setScene(scene1);
						    		primaryStage.show();
						    	}
						});

						////////////////////////////////////////////////
						HBox H = new HBox();
						H.setTranslateY(30);

						Label type = new Label("Type of Pizza:");
						type.setTranslateY(20);
						type.setTextFill(Color.WHITE);
						type.setFont(Font.font(null, FontWeight.BOLD, 20));

						final ToggleGroup g = new ToggleGroup();
						final RadioButton V = new RadioButton("Veggie");
						V.setTranslateY(120);
						V.setTextFill(Color.WHITE);
						V.setToggleGroup(g);
						final RadioButton C = new RadioButton("Cheese");
						C.setTranslateY(60);
						C.setTextFill(Color.WHITE);
						C.setToggleGroup(g);
						final RadioButton P = new RadioButton("Pepperoni");
						P.setTranslateY(90);
						P.setTextFill(Color.WHITE);
						P.setToggleGroup(g);

						Rectangle rect = new Rectangle();
						rect.setY(100);
						rect.setWidth(200);
						rect.setHeight(170);
						rect.setArcHeight(35);
						rect.setArcWidth(35);
						rect.setFill(Color.DARKRED);
						StackPane stack = new StackPane(rect, type, V, C, P);
						stack.setTranslateX(40);
						stack.setTranslateY(-25);

						stack.setAlignment(Pos.TOP_CENTER);

						Label top = new Label("Toppings:");
						top.setTranslateY(20);
						top.setTextFill(Color.WHITE);
						top.setFont(Font.font(null, FontWeight.BOLD, 20));

						final RadioButton M = new RadioButton("Mushrooms");
						M.setTranslateY(129);
						M.setTextFill(Color.WHITE);
						final RadioButton O = new RadioButton("Olives");
						O.setTranslateY(106);
						O.setTextFill(Color.WHITE);
						final RadioButton EC = new RadioButton("Extra Cheese");
						EC.setTranslateY(80);
						EC.setTextFill(Color.WHITE);
						final RadioButton B = new RadioButton("Onions");
						B.setTranslateY(54);
						B.setTextFill(Color.WHITE);

						Rectangle rect2 = new Rectangle();
						rect2.setY(100);
						rect2.setWidth(200);
						rect2.setHeight(170);
						rect2.setArcHeight(35);
						rect2.setArcWidth(35);
						rect2.setFill(Color.DARKRED);
						StackPane stack2 = new StackPane(rect2, top, M, EC, B, O);
						stack2.setTranslateX(60);
						stack2.setAlignment(Pos.TOP_CENTER);
						stack2.setTranslateY(-25);

						////////////////////////////////////////////////////////////
						Label total = new Label("Total:");
						total.setTranslateY(10);
						total.setTextFill(Color.WHITE);
						total.setFont(Font.font(null, FontWeight.BOLD, 15));

						final Label amount = new Label("$0.00");
						amount.setTranslateY(33);
						amount.setTextFill(Color.WHITE);
						amount.setFont(Font.font(null, FontWeight.BOLD, 15));

						GridPane grid3 = new GridPane();
						grid3.setVgap(2);
						grid3.setHgap(2);
						grid3.setTranslateY(15);

						Rectangle rect3 = new Rectangle();
						rect3.setWidth(120);
						rect3.setHeight(70);
						rect3.setArcHeight(35);
						rect3.setArcWidth(35);
						rect3.setFill(Color.DARKRED);
						StackPane stack3 = new StackPane(rect3, total, amount);
						stack3.setAlignment(Pos.TOP_CENTER);
						stack3.setTranslateY(-25);
						///////////////////////////////////////////////////////////

						Button Calc = new Button("Proceed To Checkout");
						Calc.setTextFill(Color.WHITE);
						Calc.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
						Calc.setMaxWidth(250);
						Calc.setMinWidth(250);
						Calc.setMaxHeight(40);
						Calc.setMinHeight(40);
						Calc.setStyle(" -fx-background-color: #c7bb00; -fx-background-radius: 5em;");
						Calc.setTranslateY(40);
						Calc.setTranslateX(128);
						Calc.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent e) {
								double tot = 0;
								Toggle toggle = g.getSelectedToggle();

								if (M.isSelected() == true) {
									tot += 1.5;
								}
								if (EC.isSelected() == true) {
									tot += 1.5;
								}
								if (B.isSelected() == true) {
									tot += 1.5;
								}
								if (V.isSelected()) {
									tot += 15;
								}
								if (C.isSelected()) {
									tot += 10;
								}
								if (P.isSelected()) {
									tot += 12;
								}

								amount.setText("$" + tot + "0");

								System.out.println(g.getSelectedToggle());
							}
						});

						


						H.getChildren().addAll(stack, stack2);
						grid3.add(stack3, 95, 18);
						v.getChildren().addAll(new ImageView(img), b3, H, grid3, Calc);
						root3.setCenter(v);
			
			
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
