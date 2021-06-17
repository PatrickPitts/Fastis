package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.time.LocalDate;

public class CreateEventGridPane extends GridPane {

    public CreateEventGridPane(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(10,10,10,10));

        TextField titleTextField = new TextField("Title");
        DatePicker startDatePicker = new DatePicker(LocalDate.now());
        DatePicker endDatePicker = new DatePicker(LocalDate.now());
        TextArea descriptionTextArea = new TextArea("Event");
        Button submitButton = new Button("Save");

        this.add(titleTextField, 0,0,2,1);
        this.add(startDatePicker, 0,1);
        this.add(endDatePicker, 1, 1);
        this.add(descriptionTextArea,0,2,2,1);
        this.add(submitButton,0,3);
        this.add(new TimePicker(), 0, 4);
    }




}
