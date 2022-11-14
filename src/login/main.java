package login;

import java.sql.Connection;

import java.util.Calendar;
import java.text.SimpleDateFormat;
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
import javafx.scene.control.ListView;
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
import javafx.scene.shape.Line;
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
			
			final Label oo = new Label("");
			oo.setTranslateY(-40);
			oo.setTranslateX(-10);
			oo.setTextFill(Color.BLACK);
			oo.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 30));
			oo.setUnderline(true);
			
			
			final order o1 = new order("pepperoni", 1, true, true, false, false);
			final order o2 = new order("Cheese", 2, false, false, false, false);
			final order o3 = new order("Cheese", 3, true, false, true, false);
			final order o4 = new order("Veggie", 4, false, false, false, true);
			final order o5 = new order("pepperoni",5, true, true, true, true);
			
			final order[] orders = new order[5];
			orders[0] = o1;
			orders[1] = o2;
			orders[2] = o3;
			orders[3] = o4;
			orders[4] = o5;
			
			final Label zaType = new Label("");
			zaType.setTranslateX(30);
			zaType.setTextFill(Color.valueOf("c8bc00"));
			zaType.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));

			final Label top1 = new Label("");
			top1.setTranslateX(40);
			top1.setTranslateY(30);

			top1.setTextFill(Color.WHITE);
			top1.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));

			final Label top2 = new Label("");
			top2.setTranslateX(40);
			top2.setTranslateY(50);

			top2.setTextFill(Color.WHITE);
			top2.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));

			final Label top3 = new Label("");
			top3.setTranslateX(40);
			top3.setTranslateY(70);

			top3.setTextFill(Color.WHITE);
			top3.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));

			final Label top4 = new Label("");
			top4.setTranslateX(40);
			top4.setTranslateY(90);

			top4.setTextFill(Color.WHITE);
			top4.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));
			
			
			final Label type2 = new Label("");
			type2.setTranslateY(33);
			type2.setTextFill(Color.WHITE);
			type2.setFont(Font.font(null, FontWeight.BOLD, 15));
			
			final Label price2 = new Label("");
			price2.setTranslateY(33);
			price2.setTextFill(Color.WHITE);
			price2.setFont(Font.font(null, FontWeight.BOLD, 15));
			
			
			
			final Label time = new Label(0+":" +0);
			time.setTranslateX(0);
			time.setTextFill(Color.WHITE);
			time.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 25));
			time.setTranslateY(-30);
			
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
			
			BorderPane root5 = new BorderPane();
			Scene scene5 = new Scene(root5, 500, 700);
			root5.setStyle("-fx-background-image: url('bg.png'); ");
			
			BorderPane root6 = new BorderPane();
			Scene scene6 = new Scene(root6, 500, 700);
			root6.setStyle("-fx-background-image: url('bg.png'); ");
		
			BorderPane root7 = new BorderPane();
			Scene scene7 = new Scene(root7, 500, 700);
			root7.setStyle("-fx-background-image: url('bg.png'); ");
			
			BorderPane root8 = new BorderPane();
			Scene scene8 = new Scene(root8, 500, 700);
			root8.setStyle("-fx-background-image: url('bg.png'); ");
			
			BorderPane root9 = new BorderPane();
			Scene scene9 = new Scene(root9, 500, 700);
			root9.setStyle("-fx-background-image: url('bg.png'); ");
			
			
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
			
			
			final TextField email = new TextField("Email");
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
			    @Override 
			    public void handle(ActionEvent e) {
			    	
			    		
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
			    	String shim = email.getText();
			    	int i = shim.compareTo("proc");
			    	int x = shim.compareTo("cook");
			    		if (i == 0) {
			    			primaryStage.setScene(scene7);
			    		}
			    		if(x == 0) {
			    			primaryStage.setScene(scene8);
			    		}
			    		else {
			    			
			    		}
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
						
						final Label cost = new Label("$0.00");
						cost.setTranslateY(82);
						cost.setTranslateX(-72);
						cost.setTextFill(Color.WHITE);
						cost.setFont(Font.font(null, FontWeight.BOLD, 20));

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
									type2.setText( "Veggie");
								}
								
								if (C.isSelected()) {
									tot += 10;
									type2.setText( "Cheese");
								}
								if (P.isSelected()) {
									tot += 12;
									type2.setText( "Pepperoni");
								}

								amount.setText("$" + tot + "0");
								cost.setText("Cart Total: $" + tot + "0");
								
								price2.setText("$" + tot + "0");

								if(toggle != null) {
									primaryStage.setScene(scene5);
								}
								else {
									Alert.disp("Incorrect Entry", "Please select a pizza type!");
								}
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
			
			TextField pass2 = new TextField("Password");
			pass2.setMaxWidth(250);
			pass2.setMaxHeight(10);
			pass2.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			pass2.setTranslateY(50);
			pass2.setTranslateX(120);
			
			ChoiceBox<String> type1 = new ChoiceBox();
			type1.getItems().add( "Processor");
			type1.getItems().add("Cook");
			type1.setValue("Type");
			type1.setMaxWidth(250);
			type1.setMaxHeight(10);
			type1.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			type1.setTranslateY(65);
			type1.setTranslateX(120);
			
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
			
			/////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////
			/////////////scene 5
			
			VBox v5 = new VBox();
			
			

			Button b5 = new Button("<");
			b5.setMaxWidth(40);
			b5.setMinWidth(40);
			b5.setMaxHeight(40);
			b5.setMinHeight(40);
			b5.setTranslateX(17);
			b5.setTranslateY(-30);
			b5.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			b5.setTextFill(Color.WHITE);
			b5.setStyle(" fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
			b5.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    		primaryStage.setScene(scene3);
			    		primaryStage.show();
			    	}
			});
			VBox v6 = new VBox();
			v6.setTranslateY(30);
			
			v6.setMaxWidth(160);
			v6.setMinWidth(160);


			Label tp = new Label("ASURITE ID:");
			tp.setTranslateX(-101);
			tp.setTextFill(Color.valueOf("c8bc00"));
			tp.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));
			
			Label EM = new Label("Email:");
			EM.setTranslateX(-124);
			EM.setTranslateY(20);
			EM.setTextFill(Color.valueOf("c8bc00"));
			EM.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));
			
			Label PU = new Label("Pick-Up Time:");
			PU.setTranslateX(-96);
			PU.setTranslateY(40);
			PU.setTextFill(Color.valueOf("c8bc00"));
			PU.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 15));
			PU.setStyle(" fx-color: #c8bc00;-fx-font-color: #c8bc00; -fx-text-color: #c8bc00;");
			
			v6.getChildren().addAll(tp, EM, PU);
			v6.setAlignment(Pos. TOP_CENTER);
			
			
			TextField id = new TextField("");
			id.setTranslateX(62);
			id.setTranslateY(-57);
			id.setMinWidth(170);
			id.setMaxHeight(10);
			id.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			
			
			TextField em = new TextField("");
			em.setTranslateX(62);
			em.setTranslateY(-47);
			em.setMinWidth(170);
			em.setMaxHeight(10);
			em.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			
			final ChoiceBox<String> put = new ChoiceBox();
			put.getItems().add( "30 Minutes");
			put.getItems().add("45 Minutes");
			put.getItems().add("60 Minutes");
			
			put.setValue("Time");
			put.setMaxWidth(170);
			put.setMaxHeight(10);
			put.setStyle("-fx-font-size: 1em; -fx-background-color: #DDDDDD; -fx-background-radius: .5em;");
			put.setTranslateY(-37);
			put.setTranslateX(62);
			
			Line lin = new Line(-100,0,200,0);
			lin.setStroke(Color.valueOf("c8bc00"));
			lin.setStrokeWidth(4);
			lin.setTranslateY(70);
			
			
			
			v6.getChildren().addAll(id, em, put, lin, cost);
			v6.setAlignment(Pos. TOP_CENTER);
			
			

			Rectangle rect5 = new Rectangle();
			rect5.setY(90);
			rect5.setWidth(350);
			rect5.setHeight(300);
			rect5.setArcHeight(35);
			rect5.setArcWidth(35);
			rect5.setFill(Color.DARKRED);
			
			StackPane stack5 = new StackPane(rect5,v6);
			
			Button place = new Button("Place Order!");
			place.setTextFill(Color.WHITE);
			place.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			place.setMaxWidth(200);
			place.setMinWidth(200);
			place.setMaxHeight(40);
			place.setMinHeight(40);
			place.setStyle("-fx-background-color: #c7bb00; -fx-background-radius: 5em;");
			place.setAlignment(Pos. CENTER);
			place.setTranslateY(25);
			place.setTranslateX(150);
			place.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	if (put.getValue() != "Time") {
			    		String zone = "am";
				    	String tt = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
				    	String mm = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
				    	int mmm = Integer.valueOf(mm);
				    	int t = Integer.valueOf(tt);
				    	int m = Integer.valueOf(put.getValue().substring(0, 2));
				    	m = mmm + m;
				    	if (m>59) {
				    		t+=1;
				    		m=m-60;
				    		System.out.println(t);
				    		
				    	}
				    	if (t>12) {
			    			System.out.println(t);
			    			t=t-12;
			    			zone = "pm";
			    		}
				    	
				    	if (m<10) {
				    		time.setText( t+ ":0" + m + zone);
			    		}
				    	else {
				    		time.setText( t+ ":" + m + zone);
				    	}
				    	primaryStage.setScene(scene6);
			    	}
			    	else {
			    		Alert.disp("Incorrect Entry", "Please select a time!");
			    	}
			    	
			    	
			    	
			    	}
			});
			
			
			
			v5.getChildren().addAll(new ImageView(img), b5, stack5, place);
			root5.setCenter(v5);
			
			
			////////////////////////////////////
			///////////////////////scene 6
			

			VBox v7 = new VBox();
			


			Label est = new Label("Estimated Order");
			est.setTranslateX(0);
			est.setTextFill(Color.valueOf("c8bc00"));
			est.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 25));
			est.setTranslateY(32);
			
			Label est1 = new Label("Pick-Up Time:");
			est1.setTranslateX(0);
			est1.setTextFill(Color.valueOf("c8bc00"));
			est1.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 25));
			est1.setTranslateY(32);
			
			
			String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
			
			

			
			
			Label day = new Label(date);
			day.setTranslateX(0);
			day.setTextFill(Color.WHITE);
			day.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 25));
			day.setTranslateY(-35);
			
			
			
			Rectangle r = new Rectangle();
			r.setFill(null);
			r.setStroke(Color.WHITE);
			r.setWidth(200);
			r.setHeight(100);
			r.setTranslateY(50);
			
			Rectangle st = new Rectangle();
			st.setFill(Color.WHITE);
			st.setWidth(150);
			st.setHeight(40);
			st.setTranslateY(18);
			st.setArcHeight(35);
			st.setArcWidth(35);
			
			Label st1 = new Label("Processing");
			st1.setTranslateX(0);
			st1.setTranslateY(-12);
			st1.setTextFill(Color.BLACK);
			st1.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 17));
			
			
			
			
			
			
			
			VBox v8 = new VBox();
			v8.setTranslateY(30);
			
			v8.setMaxWidth(300);
			v8.setMinWidth(300);
			
			
			
			
			v8.getChildren().addAll(est, est1, r,day, time);
			v8.setAlignment(Pos. TOP_CENTER);
			
			
			

			Rectangle rect7 = new Rectangle();
			rect7.setY(90);
			rect7.setTranslateY(40);
			rect7.setWidth(350);
			rect7.setHeight(300);
			rect7.setArcHeight(35);
			rect7.setArcWidth(35);
			rect7.setFill(Color.DARKRED);
			
			StackPane stack7 = new StackPane(rect7,v8);

			stack7.setAlignment(Pos.TOP_CENTER);
			
			Button check = new Button("Check Order Status");
			check.setTextFill(Color.WHITE);
			check.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			check.setMaxHeight(40);
			check.setMinHeight(40);
			check.setStyle("-fx-background-color: #c7bb00; -fx-background-radius: 5em;");
			check.setAlignment(Pos. CENTER);
			check.setMaxWidth(250);
			check.setMinWidth(250);
			check.setTranslateY(70);
			check.setTranslateX(128);
			check.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    		v8.getChildren().addAll( st, st1 );
			    	}
			});
			
			
			
			
			
			v7.getChildren().addAll(new ImageView(img), stack7, check);
			root6.setCenter(v7);
			
			
			////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////
			//scene 7
			
			
			VBox v9 = new VBox();
			v9.setAlignment(Pos.TOP_CENTER);
			
			Label q = new Label("Queue");
			q.setTranslateY(-10);
			q.setTextFill(Color.BLACK);
			q.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 30));
			q.setUnderline(true);
			
			final ListView<String> l = new ListView();
			l.getItems().add("Order #1");
			l.getItems().add("Order #2");
			l.getItems().add("Order #3");
			l.getItems().add("Order #4");
			l.getItems().add("Order #5");
			
			l.setMaxHeight(300);
			l.setMinHeight(300);
			l.setStyle("-fx-background-color: DARKRED; ");
			l.setMaxWidth(250);
			l.setMinWidth(250);
			l.setTranslateY(10);
			
			Button proc = new Button("Process Order");
			proc.setTextFill(Color.WHITE);
			proc.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			proc.setMaxHeight(40);
			proc.setMinHeight(40);
			proc.setStyle("-fx-background-color: #c7bb00; -fx-background-radius: 5em;");
			proc.setAlignment(Pos. CENTER);
			proc.setMaxWidth(250);
			proc.setMinWidth(250);
			proc.setTranslateY(35);
			proc.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	int selectedIdx = l.getSelectionModel().getSelectedIndex();
			    	l.getItems().remove(selectedIdx);
			    		
			    	}
			});
			
			
			
			
			v9.getChildren().addAll(new ImageView(img), q, l, proc);
			root7.setCenter(v9);
			
			////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////
			//scene 7


			VBox v10 = new VBox();
			v10.setAlignment(Pos.TOP_CENTER);

			Label o = new Label("Orders");
			o.setTranslateY(-10);
			o.setTextFill(Color.BLACK);
			o.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 30));
			o.setUnderline(true);

			final ListView<String> l2 = new ListView();
			l2.getItems().add("Order #1");
			l2.getItems().add("Order #2");
			l2.getItems().add("Order #3");
			l2.getItems().add("Order #4");
			l2.getItems().add("Order #5");

			l2.setMaxHeight(300);
			l2.setMinHeight(300);
			l2.setStyle("-fx-background-color: DARKRED; ");
			l2.setMaxWidth(250);
			l2.setMinWidth(250);
			l2.setTranslateY(10);

			Button info = new Button("Order Info");
			info.setTextFill(Color.WHITE);
			info.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
			info.setMaxHeight(40);
			info.setMinHeight(40);
			info.setStyle("-fx-background-color: #c7bb00; -fx-background-radius: 5em;");
			info.setAlignment(Pos. CENTER);
			info.setMaxWidth(250);
			info.setMinWidth(250);
			info.setTranslateY(35);
			info.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {
					primaryStage.setScene(scene9);
					String selectedIdx = l2.getSelectionModel().getSelectedItem();
					
						System.out.println(Integer.valueOf(selectedIdx.charAt(7)));
						oo.setText("Order: #" + selectedIdx.charAt(7));
						zaType.setText(orders[Integer.valueOf(selectedIdx.charAt(7))-49].type + " Pizza");
						if (orders[Integer.valueOf(selectedIdx.charAt(7))-49].to) {
							top1.setText("• Olives");
						}else { top1.setText("");}
						if (orders[Integer.valueOf(selectedIdx.charAt(7))-49].tol) {
							top2.setText("• Onions");
						} else { top2.setText("");}
						if (orders[Integer.valueOf(selectedIdx.charAt(7))-49].te) {
							top3.setText("• Extra Cheese");
						} else { top3.setText("");}
						if (orders[Integer.valueOf(selectedIdx.charAt(7))-49].tm) {
							top4.setText("• Mushrooms");
						} else { top4.setText("");}

					}
			});




		v10.getChildren().addAll(new ImageView(img), o, l2, info);
		root8.setCenter(v10);
		
////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////
//scene 9


VBox v11 = new VBox();
v11.setAlignment(Pos.TOP_CENTER);

Button b7 = new Button("<");
b7.setMaxWidth(40);
b7.setMinWidth(40);
b7.setMaxHeight(40);
b7.setMinHeight(40);
b7.setTranslateX(-212);
b7.setTranslateY(-30);
b7.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
b7.setTextFill(Color.WHITE);
b7.setStyle(" fx-color: #8b0100; -fx-background-color: #8b0100; -fx-background-radius: .5em;");
b7.setOnAction(new EventHandler<ActionEvent>() {
    @Override public void handle(ActionEvent e) {
    		primaryStage.setScene(scene8);
    		primaryStage.show();
    	}
});



Rectangle r2 = new Rectangle();
r2.setHeight(300);
r2.setArcHeight(35);
r2.setArcWidth(35);
r2.setWidth(250);
r2.setFill(Color.DARKRED);
r2.setTranslateY(-25);



Button comp = new Button("Complete Order");
comp.setTextFill(Color.WHITE);
comp.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 20));
comp.setMaxHeight(40);
comp.setMinHeight(40);
comp.setStyle("-fx-background-color: #c7bb00; -fx-background-radius: 5em;");
comp.setAlignment(Pos. CENTER);
comp.setMaxWidth(250);
comp.setMinWidth(250);
comp.setTranslateY(-5);
comp.setOnAction(new EventHandler<ActionEvent>() {
@Override public void handle(ActionEvent e) {
int selectedIdx = l2.getSelectionModel().getSelectedIndex();
l2.getItems().remove(selectedIdx);
primaryStage.setScene(scene8);
}	
});

StackPane stack9 = new StackPane(r2, zaType, top1,top2,top3,top4 );
stack9.setTranslateX(120);
stack9.setAlignment(Pos.TOP_LEFT);


v11.getChildren().addAll(new ImageView(img), b7, oo, stack9,  comp );
root9.setCenter(v11);
			
			
			
			
			
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
