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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.shape.Line;

public class QuizApp extends Application {

    Text text = new Text();
    Button button = new Button();
    Button button0 = new Button();
    Button button1 = new Button();

    @Override
    public void start(Stage primaryStage) throws IOException {
        text.setLayoutX(250.0);
        text.setLayoutY(125.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Quiz");
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
        primaryStage.setHeight(500);
        primaryStage.setWidth(600);
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
                    // Button button4 =new Button();

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
                    //button4.setLayoutX(274.0);
                    // button4.setLayoutY(430.0);
                    // button4.setMnemonicParsing(false);
                    // button4.setText("Back");

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
//creator login button
                                //validate here
                                Text text = new Text();
                                TextField textField = new TextField();
                                TextField textField0 = new TextField();
                                TextField textField1 = new TextField();
                                Label label = new Label();
                                Line line = new Line();
                                TextField textField2 = new TextField();
                                TextField textField3 = new TextField();
                                TextField textField4 = new TextField();
                                TextField textField5 = new TextField();
                                TextField textField6 = new TextField();
                                TextField textField7 = new TextField();
                                TextField textField8 = new TextField();
                                TextField textField9 = new TextField();
                                TextField textField10 = new TextField();
                                TextField textField11 = new TextField();
                                TextField textField12 = new TextField();
                                TextField textField13 = new TextField();
                                TextField textField14 = new TextField();
                                TextField textField15 = new TextField();
                                TextField textField16 = new TextField();
                                TextField textField17 = new TextField();
                                TextField textField18 = new TextField();
                                TextField textField19 = new TextField();
                                TextField textField110 = new TextField();
                                TextField textField111 = new TextField();
                                TextField textField112 = new TextField();
                                TextField textField113 = new TextField();
                                TextField textField114 = new TextField();
                                TextField textField115 = new TextField();
                                TextField textField116 = new TextField();
                                RadioButton radioButton = new RadioButton();
                                RadioButton radioButton0 = new RadioButton();
                                RadioButton radioButton1 = new RadioButton();
                                RadioButton radioButton2 = new RadioButton();
                                RadioButton radioButton3 = new RadioButton();
                                RadioButton radioButton4 = new RadioButton();
                                RadioButton radioButton5 = new RadioButton();
                                RadioButton radioButton6 = new RadioButton();
                                RadioButton radioButton7 = new RadioButton();
                                RadioButton radioButton8 = new RadioButton();
                                RadioButton radioButton9 = new RadioButton();
                                RadioButton radioButton10 = new RadioButton();
                                RadioButton radioButton11 = new RadioButton();
                                RadioButton radioButton12 = new RadioButton();
                                RadioButton radioButton13 = new RadioButton();
                                RadioButton radioButton14 = new RadioButton();
                                RadioButton radioButton15 = new RadioButton();
                                RadioButton radioButton16 = new RadioButton();
                                RadioButton radioButton17 = new RadioButton();
                                RadioButton radioButton18 = new RadioButton();
                                TextField textField117 = new TextField();
                                TextField textField118 = new TextField();
                                TextField textField119 = new TextField();
                                TextField textField1110 = new TextField();
                                TextField textField1111 = new TextField();
                                Button button = new Button();

                                text.setLayoutX(141.0);
                                text.setLayoutY(100.0);
                                text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
                                text.setStrokeWidth(0.0);
                                text.setFont(new Font(50.0));

                                textField.setLayoutX(28.0);
                                textField.setLayoutY(79.0);
                                textField.setPromptText("Name of the quiz");

                                textField0.setLayoutX(195.0);
                                textField0.setLayoutY(79.0);
                                textField0.setPromptText("Type of quiz");

                                textField1.setLayoutX(362.0);
                                textField1.setLayoutY(79.0);
                                textField1.setPromptText("Total score");

                                label.setLayoutX(28.0);
                                label.setLayoutY(22.0);
                                label.setPrefHeight(25.0);
                                label.setPrefWidth(414.0);
                                label.setText("Details about the quiz :-");
                                label.setFont(new Font(33.0));

                                line.setEndX(778.0);
                                line.setLayoutX(102.0);
                                line.setLayoutY(113.0);
                                line.setStartX(-108.5);

                                textField2.setLayoutX(26.0);
                                textField2.setLayoutY(154.0);
                                textField2.setPrefHeight(26.0);
                                textField2.setPrefWidth(775.0);
                                textField2.setPromptText("Question - 1");

                                textField3.setLayoutX(38.0);
                                textField3.setLayoutY(188.0);
                                textField3.setPromptText("Option -1");

                                textField4.setLayoutX(235.0);
                                textField4.setLayoutY(188.0);
                                textField4.setPromptText("Option -2");

                                textField5.setLayoutX(442.0);
                                textField5.setLayoutY(188.0);
                                textField5.setPromptText("Option -3");

                                textField6.setLayoutX(641.0);
                                textField6.setLayoutY(188.0);
                                textField6.setPromptText("Option -4");

                                textField7.setLayoutX(26.0);
                                textField7.setLayoutY(230.0);
                                textField7.setPrefHeight(26.0);
                                textField7.setPrefWidth(775.0);
                                textField7.setPromptText("Question - 2");

                                textField8.setLayoutX(38.0);
                                textField8.setLayoutY(264.0);
                                textField8.setPromptText("Option -1");

                                textField9.setLayoutX(235.0);
                                textField9.setLayoutY(264.0);
                                textField9.setPromptText("Option -2");

                                textField10.setLayoutX(442.0);
                                textField10.setLayoutY(264.0);
                                textField10.setPromptText("Option -3");

                                textField11.setLayoutX(641.0);
                                textField11.setLayoutY(264.0);
                                textField11.setPromptText("Option -4");

                                textField12.setLayoutX(26.0);
                                textField12.setLayoutY(303.0);
                                textField12.setPrefHeight(26.0);
                                textField12.setPrefWidth(775.0);
                                textField12.setPromptText("Question - 3");

                                textField13.setLayoutX(38.0);
                                textField13.setLayoutY(337.0);
                                textField13.setPromptText("Option -1");

                                textField14.setLayoutX(235.0);
                                textField14.setLayoutY(337.0);
                                textField14.setPromptText("Option -2");

                                textField15.setLayoutX(442.0);
                                textField15.setLayoutY(337.0);
                                textField15.setPromptText("Option -3");

                                textField16.setLayoutX(641.0);
                                textField16.setLayoutY(337.0);
                                textField16.setPromptText("Option -4");

                                textField17.setLayoutX(26.0);
                                textField17.setLayoutY(373.0);
                                textField17.setPrefHeight(26.0);
                                textField17.setPrefWidth(775.0);
                                textField17.setPromptText("Question - 4");

                                textField18.setLayoutX(38.0);
                                textField18.setLayoutY(407.0);
                                textField18.setPromptText("Option -1");

                                textField19.setLayoutX(235.0);
                                textField19.setLayoutY(407.0);
                                textField19.setPromptText("Option -2");

                                textField110.setLayoutX(442.0);
                                textField110.setLayoutY(407.0);
                                textField110.setPromptText("Option -3");

                                textField111.setLayoutX(641.0);
                                textField111.setLayoutY(407.0);
                                textField111.setPromptText("Option -4");

                                textField112.setLayoutX(24.0);
                                textField112.setLayoutY(444.0);
                                textField112.setPrefHeight(26.0);
                                textField112.setPrefWidth(775.0);
                                textField112.setPromptText("Question - 5");

                                textField113.setLayoutX(38.0);
                                textField113.setLayoutY(478.0);
                                textField113.setPromptText("Option -1");

                                textField114.setLayoutX(235.0);
                                textField114.setLayoutY(478.0);
                                textField114.setPromptText("Option -2");

                                textField115.setLayoutX(442.0);
                                textField115.setLayoutY(478.0);
                                textField115.setPromptText("Option -3");

                                textField116.setLayoutX(641.0);
                                textField116.setLayoutY(478.0);
                                textField116.setPromptText("Option -4");

                                radioButton.setLayoutX(12.0);
                                radioButton.setLayoutY(192.0);
                                radioButton.setMnemonicParsing(false);

                                radioButton0.setLayoutX(211.0);
                                radioButton0.setLayoutY(191.0);
                                radioButton0.setMnemonicParsing(false);

                                radioButton1.setLayoutX(414.0);
                                radioButton1.setLayoutY(192.0);
                                radioButton1.setMnemonicParsing(false);

                                radioButton2.setLayoutX(616.0);
                                radioButton2.setLayoutY(192.0);
                                radioButton2.setMnemonicParsing(false);

                                radioButton3.setLayoutX(12.0);
                                radioButton3.setLayoutY(268.0);
                                radioButton3.setMnemonicParsing(false);

                                radioButton4.setLayoutX(211.0);
                                radioButton4.setLayoutY(269.0);
                                radioButton4.setMnemonicParsing(false);

                                radioButton5.setLayoutX(414.0);
                                radioButton5.setLayoutY(268.0);
                                radioButton5.setMnemonicParsing(false);

                                radioButton6.setLayoutX(616.0);
                                radioButton6.setLayoutY(269.0);
                                radioButton6.setMnemonicParsing(false);

                                radioButton7.setLayoutX(10.0);
                                radioButton7.setLayoutY(341.0);
                                radioButton7.setMnemonicParsing(false);

                                radioButton8.setLayoutX(211.0);
                                radioButton8.setLayoutY(341.0);
                                radioButton8.setMnemonicParsing(false);

                                radioButton9.setLayoutX(414.0);
                                radioButton9.setLayoutY(341.0);
                                radioButton9.setMnemonicParsing(false);

                                radioButton10.setLayoutX(616.0);
                                radioButton10.setLayoutY(341.0);
                                radioButton10.setMnemonicParsing(false);

                                radioButton11.setLayoutX(11.0);
                                radioButton11.setLayoutY(411.0);
                                radioButton11.setMnemonicParsing(false);

                                radioButton12.setLayoutX(211.0);
                                radioButton12.setLayoutY(411.0);
                                radioButton12.setMnemonicParsing(false);

                                radioButton13.setLayoutX(414.0);
                                radioButton13.setLayoutY(411.0);
                                radioButton13.setMnemonicParsing(false);

                                radioButton14.setLayoutX(616.0);
                                radioButton14.setLayoutY(412.0);
                                radioButton14.setMnemonicParsing(false);

                                radioButton15.setLayoutX(11.0);
                                radioButton15.setLayoutY(482.0);
                                radioButton15.setMnemonicParsing(false);

                                radioButton16.setLayoutX(211.0);
                                radioButton16.setLayoutY(482.0);
                                radioButton16.setMnemonicParsing(false);

                                radioButton17.setLayoutX(414.0);
                                radioButton17.setLayoutY(482.0);
                                radioButton17.setMnemonicParsing(false);

                                radioButton18.setLayoutX(616.0);
                                radioButton18.setLayoutY(483.0);
                                radioButton18.setMnemonicParsing(false);

                                textField117.setLayoutX(814.0);
                                textField117.setLayoutY(154.0);
                                textField117.setPrefHeight(25.0);
                                textField117.setPrefWidth(52.0);
                                textField117.setPromptText("Points");

                                textField118.setLayoutX(814.0);
                                textField118.setLayoutY(230.0);
                                textField118.setPrefHeight(25.0);
                                textField118.setPrefWidth(52.0);
                                textField118.setPromptText("Points");

                                textField119.setLayoutX(814.0);
                                textField119.setLayoutY(303.0);
                                textField119.setPrefHeight(25.0);
                                textField119.setPrefWidth(52.0);
                                textField119.setPromptText("Points");

                                textField1110.setLayoutX(814.0);
                                textField1110.setLayoutY(373.0);
                                textField1110.setPrefHeight(25.0);
                                textField1110.setPrefWidth(52.0);
                                textField1110.setPromptText("Points");

                                textField1111.setLayoutX(814.0);
                                textField1111.setLayoutY(444.0);
                                textField1111.setPrefHeight(25.0);
                                textField1111.setPrefWidth(52.0);
                                textField1111.setPromptText("Points");

                                button.setLayoutX(379.0);
                                button.setLayoutY(513.0);
                                button.setMnemonicParsing(false);
                                button.setStyle("-fx-background-color: #00ff00;");
                                button.setText("Save quiz");
                                button.setFont(new Font(20.0));

                                Pane layout0 = new Pane();
                                Scene scene0 = new Scene(layout0);

                                layout0.getChildren().addAll(text, textField,textField0,textField1,label,line,textField2,
                                        textField3,textField4,textField5,textField6,textField7,textField8,textField9,
                                        textField10,textField11,textField12,textField13,textField14,textField15,textField16,
                                        textField17,textField18,textField19,textField110,textField111,textField112,textField113,textField114,
                                        textField115,textField116,radioButton, radioButton0, radioButton1,
                                        radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,
                                        radioButton10,radioButton11,radioButton12,radioButton13,radioButton14,radioButton15,radioButton16,radioButton17,
                                        radioButton18,textField117,textField118,textField119,textField1110,textField1111,button);
                                primaryStage.setTitle("create quiz");
                                primaryStage.setScene(scene0);
                                primaryStage.show();

                                EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

                                    @Override
                                    public void handle(MouseEvent event) {

                                        if (event.getSource() == button) {
                                            // save uqiz button
                                        }
                                    }
                                };
                                                                button.setOnMouseClicked(handler);


                                        } else if (event.getSource() == button3) {
// sign up button
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
// player login button
                                            // validate here

                                            Text text = new Text();
                                            Label label = new Label();
                                            Line line = new Line();
                                            Label label0 = new Label();
                                            Label label1 = new Label();
                                            Label label2 = new Label();
                                            Label label3 = new Label();
                                            Button button = new Button();

                                            text.setLayoutX(31.0);
                                            text.setLayoutY(50.0);
                                            text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
                                            text.setStrokeWidth(0.0);
                                            text.setText("Hi Chinmay! Which quiz do you want to take today ?");
                                            text.setFont(new Font(23.0));

                                            label.setLayoutX(31.0);
                                            label.setLayoutY(91.0);
                                            label.setPrefHeight(25.0);
                                            label.setPrefWidth(51.0);
                                            label.setText("Name ");
                                            label.setFont(new Font(15.0));

                                            line.setEndX(499.0);
                                            line.setLayoutX(101.0);
                                            line.setLayoutY(69.0);
                                            line.setStartX(-110.5);

                                            label0.setLayoutX(82.0);
                                            label0.setLayoutY(91.0);
                                            label0.setPrefHeight(25.0);
                                            label0.setPrefWidth(84.0);
                                            label0.setText("Category");
                                            label0.setFont(new Font(15.0));

                                            label1.setLayoutX(166.0);
                                            label1.setLayoutY(91.0);
                                            label1.setPrefHeight(25.0);
                                            label1.setPrefWidth(149.0);
                                            label1.setText("Number of questions");
                                            label1.setFont(new Font(15.0));

                                            label2.setLayoutX(324.0);
                                            label2.setLayoutY(91.0);
                                            label2.setPrefHeight(25.0);
                                            label2.setPrefWidth(51.0);
                                            label2.setText("Points");
                                            label2.setFont(new Font(15.0));

                                            label3.setLayoutX(387.0);
                                            label3.setLayoutY(91.0);
                                            label3.setPrefHeight(25.0);
                                            label3.setPrefWidth(100.0);
                                            label3.setText("Highest score");
                                            label3.setFont(new Font(15.0));

                                            button.setLayoutX(499.0);
                                            button.setLayoutY(91.0);
                                            button.setMnemonicParsing(false);
                                            button.setStyle("-fx-background-color: #00ff00;");
                                            button.setText("Start quiz");

                                            Pane layout1 = new Pane();
                                            Scene scene1 = new Scene(layout1);

                                            layout1.getChildren().addAll(text, label, line, label0, label1, label2, label3, button);
                                            primaryStage.setTitle("Quizes");
                                            primaryStage.setScene(scene1);
                                            primaryStage.show();
                                            EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

                                                @Override
                                                public void handle(MouseEvent event) {

                                                    if (event.getSource() == button) {
// start quiz button
                                                    }
                                                }
                                            };
                                                                            button.setOnMouseClicked(handler);

                                        } else if (event.getSource() == button5) {
// player signup
                                        }

                                        event.consume();
                                    }

                                };

                                button4.setOnMouseClicked(handler);

                                button5.setOnMouseClicked(handler);

                            } else if (event.getSource()
                                    == button1) {
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
