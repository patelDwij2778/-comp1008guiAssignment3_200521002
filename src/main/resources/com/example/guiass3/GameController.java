package com.example.guiass3;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.Random;

public class GameController {

    @FXML
    private AnchorPane background;

    @FXML
    private ComboBox<String> choice;

    Random random = new Random();
    @FXML
    void initialize(){
        //make not visible
        options.setVisible(false);
        //add two entries to the comboL less than 20 and gt 20
        ArrayList<String>items = new ArrayList<>();
        items.add("Less than 0");
        items.add("Greater than 0");

        choice.getItems().addAll(items);
    }

    @FXML
    private ListView<String> gt20;

    @FXML
    private ListView<String> lt20;

    @FXML
    private Pane options;

    @FXML
    private TextField ranNum;

    @FXML
    void onChoose(ActionEvent event) {

            //get the value of random number from textfield
        String valueOfTextField = ranNum.getText();

        //get the value of combobox
        String valueOfComboBox = choice.getSelectionModel().getSelectedItem();
        int index = choice.getSelectionModel().getSelectedIndex();

        System.out.println(valueOfTextField);
        System.out.println(valueOfComboBox);
        System.out.println(index);
        //out these value to consolee

        //add the value to combobox

        ListView<String> selected;

        selected = lt20;
        if(index == 1){
            selected = gt20;
        }
        selected.getItems().add(valueOfTextField);

        //set the pane to invisible
        options.setVisible(false);
        //clear the value of text field
        ranNum.clear();
        //set the backgroud color to red or green  depending on if correct or incorrect

        //determine wheter answer is correct or not
        int value = Integer.parseInt(valueOfTextField);
        boolean correct = (index == 0 && value <0) || (index == 1 && value > 0);
        if(correct)
            background.setStyle("-fx-background-color: rgba(0,255,0,0.3)");
        else
            background.setStyle("-fx-background-color: rgba(255,0,0,0.3)");




    }

    @FXML
    void onGenerateNum(ActionEvent event) {
        background.setStyle("");
        //create a random object as intance variable
        int generateNumber = random.nextInt(-20,20);
        ranNum.setText(String.valueOf(generateNumber));
        options.setVisible(true);

    }

}
