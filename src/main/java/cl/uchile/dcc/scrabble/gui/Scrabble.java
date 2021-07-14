package cl.uchile.dcc.scrabble.gui;

import cl.uchile.dcc.scrabble.gui.Controller.controller;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

/**
 * Main entry point for the application.
 * <p>
 * <Complete here with the details of the implemented application>
 *
 * @author Ignacio Slater Muñoz.
 * @author <Your name>
 */

public class Scrabble extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    primaryStage.setTitle("Scrabble");
    var root = new Group();
    int width = 1280;
    int height = 720;
    Scene scene = new Scene(root, width, height);

    Button add = new Button("Addition");
    add.setLayoutX(0);
    add.setLayoutY(100);

    Button Minus = new Button("Subtraction");
    Minus.setLayoutX(70);
    Minus.setLayoutY(100);


    TextField input = new TextField();
    Text output = new Text("Choose an operation");
    output.setLayoutY(150);

    root.getChildren().add(input);
    root.getChildren().add(output);
    root.getChildren().add(add);
    root.getChildren().add(Minus);

    add.setFocusTraversable(false);

    add.setOnAction(event -> {
      output.setText("Enter first variable");

    });

    primaryStage.setScene(scene);
    primaryStage.show();

    /*
    primaryStage.setTitle("Scrabble");

    Label label = new Label("This will be an app sometime");
    label.setAlignment(Pos.CENTER);

    // This sets the size of the Scene to be 400px wide, 200px high
    Scene scene = new Scene(label, 400, 200);
    primaryStage.setScene(scene);

    primaryStage.show();
    */
  }
/**
  private @NotNull Button addButton(){
    var button = new Button("Sum");
    button.setLayoutX(950);
    button.setLayoutY(100);
    button.setFocusTraversable(false);
    button.setOnAction(event -> {
      ;
    });
    return button;
  }
**/
}