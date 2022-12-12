package com.example.guiass3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class StudentController {

    @FXML
    private Pane AddStudentButton;

    @FXML
    private ColorPicker colorSelection;

    @FXML
    private Label errorOutput;

    @FXML
    private Label nameDisplay1;

    @FXML
    private Label nameDisplay2;

    @FXML
    private Label nameDisplay3;

    @FXML
    private Label nameDisplay4;

    @FXML
    private Label nameDisplay5;

    @FXML
    private Label nameDisplay6;

    @FXML
    private Label nameDisplay7;

    @FXML
    private Label nameDisplay8;

    @FXML
    private Label nameDisplay9;

    @FXML
    private Rectangle studenColor1;

    @FXML
    private Rectangle studenColor2;

    @FXML
    private Rectangle studenColor3;

    @FXML
    private Rectangle studenColor4;

    @FXML
    private Rectangle studenColor5;

    @FXML
    private Rectangle studenColor6;

    @FXML
    private Rectangle studenColor7;

    @FXML
    private Rectangle studenColor8;

    @FXML
    private Rectangle studenColor9;

    @FXML
    private Pane studentInfoHolder;

    @FXML
    private TextField studentNumberInput;

    @FXML
    void initialize(){
        studentNumberInput.clear();
        studentInfoHolder.setVisible(false);
        colorSelection.setDisable(true);
        colorSelection.setOpacity(0.5f);
        AddStudentButton.setVisible(false);
    }
    @FXML
    void onStudentNumberEntered(ActionEvent event) {
        if(studentNumberInput.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message..!");
            alert.setHeaderText("Error Occurred");
            alert.setContentText("Please Enter the name in text field..!");
            alert.showAndWait();
        }
        colorSelection.setDisable(false);
        colorSelection.setOpacity(1.0f);
        AddStudentButton.setVisible(true);
    }
    @FXML
    void onAddStudentClicked(ActionEvent event) {
        studentNumberInput.clear();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText("Confirmation");
        alert.setContentText("Congratulations..!! You are good to go..!");
        alert.showAndWait();
        studentInfoHolder.setVisible(true);
    }
}
