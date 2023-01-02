package quizapp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FXMLBase extends Pane {

    protected final Text text;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final Label label;
    protected final Line line;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;
    protected final TextField textField5;
    protected final TextField textField6;
    protected final TextField textField7;
    protected final TextField textField8;
    protected final TextField textField9;
    protected final TextField textField10;
    protected final TextField textField11;
    protected final TextField textField12;
    protected final TextField textField13;
    protected final TextField textField14;
    protected final TextField textField15;
    protected final TextField textField16;
    protected final TextField textField17;
    protected final TextField textField18;
    protected final TextField textField19;
    protected final TextField textField110;
    protected final TextField textField111;
    protected final TextField textField112;
    protected final TextField textField113;
    protected final TextField textField114;
    protected final TextField textField115;
    protected final TextField textField116;
    protected final RadioButton radioButton;
    protected final RadioButton radioButton0;
    protected final RadioButton radioButton1;
    protected final RadioButton radioButton2;
    protected final RadioButton radioButton3;
    protected final RadioButton radioButton4;
    protected final RadioButton radioButton5;
    protected final RadioButton radioButton6;
    protected final RadioButton radioButton7;
    protected final RadioButton radioButton8;
    protected final RadioButton radioButton9;
    protected final RadioButton radioButton10;
    protected final RadioButton radioButton11;
    protected final RadioButton radioButton12;
    protected final RadioButton radioButton13;
    protected final RadioButton radioButton14;
    protected final RadioButton radioButton15;
    protected final RadioButton radioButton16;
    protected final RadioButton radioButton17;
    protected final RadioButton radioButton18;
    protected final TextField textField117;
    protected final TextField textField118;
    protected final TextField textField119;
    protected final TextField textField1110;
    protected final TextField textField1111;
    protected final Button button;

    public FXMLBase() {

        text = new Text();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        label = new Label();
        line = new Line();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        textField5 = new TextField();
        textField6 = new TextField();
        textField7 = new TextField();
        textField8 = new TextField();
        textField9 = new TextField();
        textField10 = new TextField();
        textField11 = new TextField();
        textField12 = new TextField();
        textField13 = new TextField();
        textField14 = new TextField();
        textField15 = new TextField();
        textField16 = new TextField();
        textField17 = new TextField();
        textField18 = new TextField();
        textField19 = new TextField();
        textField110 = new TextField();
        textField111 = new TextField();
        textField112 = new TextField();
        textField113 = new TextField();
        textField114 = new TextField();
        textField115 = new TextField();
        textField116 = new TextField();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        radioButton3 = new RadioButton();
        radioButton4 = new RadioButton();
        radioButton5 = new RadioButton();
        radioButton6 = new RadioButton();
        radioButton7 = new RadioButton();
        radioButton8 = new RadioButton();
        radioButton9 = new RadioButton();
        radioButton10 = new RadioButton();
        radioButton11 = new RadioButton();
        radioButton12 = new RadioButton();
        radioButton13 = new RadioButton();
        radioButton14 = new RadioButton();
        radioButton15 = new RadioButton();
        radioButton16 = new RadioButton();
        radioButton17 = new RadioButton();
        radioButton18 = new RadioButton();
        textField117 = new TextField();
        textField118 = new TextField();
        textField119 = new TextField();
        textField1110 = new TextField();
        textField1111 = new TextField();
        button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(566.0);
        setPrefWidth(880.0);

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

        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(textField1);
        getChildren().add(label);
        getChildren().add(line);
        getChildren().add(textField2);
        getChildren().add(textField3);
        getChildren().add(textField4);
        getChildren().add(textField5);
        getChildren().add(textField6);
        getChildren().add(textField7);
        getChildren().add(textField8);
        getChildren().add(textField9);
        getChildren().add(textField10);
        getChildren().add(textField11);
        getChildren().add(textField12);
        getChildren().add(textField13);
        getChildren().add(textField14);
        getChildren().add(textField15);
        getChildren().add(textField16);
        getChildren().add(textField17);
        getChildren().add(textField18);
        getChildren().add(textField19);
        getChildren().add(textField110);
        getChildren().add(textField111);
        getChildren().add(textField112);
        getChildren().add(textField113);
        getChildren().add(textField114);
        getChildren().add(textField115);
        getChildren().add(textField116);
        getChildren().add(radioButton);
        getChildren().add(radioButton0);
        getChildren().add(radioButton1);
        getChildren().add(radioButton2);
        getChildren().add(radioButton3);
        getChildren().add(radioButton4);
        getChildren().add(radioButton5);
        getChildren().add(radioButton6);
        getChildren().add(radioButton7);
        getChildren().add(radioButton8);
        getChildren().add(radioButton9);
        getChildren().add(radioButton10);
        getChildren().add(radioButton11);
        getChildren().add(radioButton12);
        getChildren().add(radioButton13);
        getChildren().add(radioButton14);
        getChildren().add(radioButton15);
        getChildren().add(radioButton16);
        getChildren().add(radioButton17);
        getChildren().add(radioButton18);
        getChildren().add(textField117);
        getChildren().add(textField118);
        getChildren().add(textField119);
        getChildren().add(textField1110);
        getChildren().add(textField1111);
        getChildren().add(button);

    }
}
