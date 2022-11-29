package quizapp;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class QuizApp extends Application {

    Text text = new Text();
    Button button = new Button();
    Button button0 = new Button();
    Button button1 = new Button();

    @Override
    public void start(Stage primaryStage) throws IOException {
        text.setLayoutX(188.0);
        text.setLayoutY(125.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Quiz_LOGO");
        text.setFont(new Font(44.0));

        button.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button.setLayoutX(188.0);
        button.setLayoutY(266.0);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #82CD47;");
        button.setText("Create Quiz");

        button0.setLayoutX(347.0);
        button0.setLayoutY(266.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: #FED049;");
        button0.setText("Play Quiz");

        button1.setLayoutX(524.0);
        button1.setLayoutY(25.0);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-background-color: #AA2B1D;");
        button1.setText("Help");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#f8f8f8"));
        Pane layout = new Pane();
        Scene scene = new Scene(layout);

        layout.getChildren().addAll(text, button, button0, button1);
        primaryStage.setTitle("Quiz");
        primaryStage.setScene(scene);
        primaryStage.show();

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                if (event.getSource() == button) {
                    Text text1 = new Text();
                    TextField textField = new TextField();
                    PasswordField passwordField = new PasswordField();
                    Button button2 = new Button();
                    Button button3 = new Button();

                    text1.setLayoutX(78.0);
                    text1.setLayoutY(101.0);
                    text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
                    text1.setStrokeWidth(0.0);
                    text1.setText("Quiz Master's portal");
                    text1.setFont(new Font(50.0));

                    textField.setLayoutX(225.0);
                    textField.setLayoutY(175.0);
                    textField.setPromptText("Username");

                    passwordField.setLayoutX(225.0);
                    passwordField.setLayoutY(218.0);
                    passwordField.setPromptText("Password");

                    button2.setLayoutX(274.0);
                    button2.setLayoutY(259.0);
                    button2.setMnemonicParsing(false);
                    button2.setText("Login");

                    button3.setLayoutX(192.0);
                    button3.setLayoutY(336.0);
                    button3.setMnemonicParsing(false);
                    button3.setText("If you don't have an account, click me");
//                    Stage creator_login=new Stage();
                    Pane layout0 = new Pane();
                    Scene scene0 = new Scene(layout0);

                    layout0.getChildren().addAll(text1, button2, button3, textField, passwordField);
                    primaryStage.setTitle("Login");
                    primaryStage.setScene(scene0);
                    primaryStage.show();

                    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {

                            if (event.getSource() == button2) {

                            } else if (event.getSource() == button3) {

                            }

                            event.consume();
                        }

                    };

                    button2.setOnMouseClicked(handler);
                    button3.setOnMouseClicked(handler);

                } else if (event.getSource() == button0) {
                    Text text2 = new Text();
                    TextField textField1 = new TextField();
                    Button button4 = new Button();
                    Button button5 = new Button();

                    text2.setLayoutX(141.0);
                    text2.setLayoutY(100.0);
                    text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
                    text2.setStrokeWidth(0.0);
                    text2.setText("Player's portal");
                    text2.setFont(new Font(50.0));

                    textField1.setLayoutX(225.0);
                    textField1.setLayoutY(175.0);
                    textField1.setPromptText("Username");

                    button4.setLayoutX(276.0);
                    button4.setLayoutY(221.0);
                    button4.setMnemonicParsing(false);
                    button4.setText("Next");

                    button5.setLayoutX(192.0);
                    button5.setLayoutY(336.0);
                    button5.setMnemonicParsing(false);
                    button5.setText("If you don't have an account, click me");
                    Pane layout1 = new Pane();
                    Scene scene1 = new Scene(layout1);

                    layout1.getChildren().addAll(text2, button4, button5, textField1);
                    primaryStage.setTitle("Login");
                    primaryStage.setScene(scene1);
                    primaryStage.show();
                    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {

                            if (event.getSource() == button4) {

                            } else if (event.getSource() == button5) {

                            }

                            event.consume();
                        }

                    };

                    button4.setOnMouseClicked(handler);
                    button5.setOnMouseClicked(handler);

                } else if (event.getSource() == button1) {
                    Text text2 = new Text();
                    Button button = new Button();

                    text2.setLayoutX(141.0);
                    text2.setLayoutY(100.0);
                    text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
                    text2.setStrokeWidth(0.0);
                    text2.setText("->Click create quiz if you want to add your own quiz.\n->Click on play quiz if you want to play quizes created by others.\n->You need to login to do any of the above.");
                    text2.setFont(new Font(15.0));

                    button.setLayoutX(276.0);
                    button.setLayoutY(221.0);
                    button.setMnemonicParsing(false);
                    button.setText("Back");

                    Pane layout1 = new Pane();
                    Scene scene1 = new Scene(layout1);
                    layout1.getChildren().addAll(text2, button);
                    primaryStage.setTitle("Help");
                    primaryStage.setScene(scene1);
                    primaryStage.show();
                    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {

                            if (event.getSource() == button) {
                                primaryStage.setScene(scene);
                                primaryStage.show();
                            }
                            event.consume();
                        }

                    };

                    button.setOnMouseClicked(handler);
                }

                event.consume();
            }

        };

        button.setOnMouseClicked(handler);
        button0.setOnMouseClicked(handler);
        button1.setOnMouseClicked(handler);

    }

    public static void main(String[] args) {
        launch();
    }
}
