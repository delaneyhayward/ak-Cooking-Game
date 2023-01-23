package com.example.ak;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
int score = 0;
int mistakes = 0;
boolean gameOver = false;
String recipe = "Marshmallows";

public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Cooking Game");

GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25, 25, 25, 25));

Scene scene = new Scene(grid, 300, 275);
primaryStage.setScene(scene);

Text scenetitle = new Text("Welcome to the Cooking Game!");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, 0, 0, 2, 1);

Label recipeLabel = new Label("Recipe: " + recipe);
grid.add(recipeLabel, 0, 1);

Label scoreLabel = new Label("Score: " + score);
grid.add(scoreLabel, 1, 1);

Label mistakeLabel = new Label("Mistakes: " + mistakes);
grid.add(mistakeLabel, 0, 2);

Button startBtn = new Button("Start Cooking");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(startBtn);
grid.add(hbBtn, 1, 4);

final Text actiontarget = new Text();
grid.add(actiontarget, 1, 6);

startBtn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent e) {
if (!gameOver) {
score++;
scoreLabel.setText("Score: " + score);
} else {
actiontarget.setFill(Color.FIREBRICK);
actiontarget.setText("Game Over! Please start a new game.");
}
}
});

primaryStage.show();
}
}
