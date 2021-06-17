package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateEventGroup extends Group {

    public CreateEventGroup(){


        TextField titleTextField = new TextField("Title");
        DatePicker startDatePicker = new DatePicker(LocalDate.now());
        DatePicker endDatePicker = new DatePicker(LocalDate.now());
        TextArea descriptionTextArea = new TextArea("Event");
        Button submitButton = new Button("Save");

        List<Node> nodes = new ArrayList<>(Arrays.asList(startDatePicker, endDatePicker, titleTextField, descriptionTextArea, submitButton));
        this.getChildren().addAll(nodes);

        startDatePicker.setLayoutY(titleTextField.getPrefHeight() + 25);

        endDatePicker.setLayoutY(startDatePicker.getLayoutY());
        endDatePicker.setLayoutX(startDatePicker.getLayoutX() + startDatePicker.getPrefWidth() + 50);

        descriptionTextArea.setLayoutY(startDatePicker.getLayoutY() + startDatePicker.getPrefHeight() + 25);
        System.out.println(descriptionTextArea.getMaxHeight());
        submitButton.setLayoutY(descriptionTextArea.getLayoutY() + descriptionTextArea.getPrefHeight() + 25);


    }
}
