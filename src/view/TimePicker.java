package view;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.EventListener;

public class TimePicker extends GridPane {

    private static final String TIME_FORMAT = "HH:MM";
    private static final DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public TimePicker(){

        this.getStylesheets().add("view/css/TimePickerStyle.css");
        this.getStyleClass().add("root");

        LocalTime T = LocalTime.now();

        TextField hourField = new TextField(T.format(DateTimeFormatter.ofPattern("H")));
        TextField minuteField = new TextField(T.format(DateTimeFormatter.ofPattern("mm")));
        Text delim = new Text(":");

        hourField.setEditable(false);
        hourField.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("PRESSED");
                if(event.getCode()== KeyCode.UP){
                    System.out.println("UP");
                } else if (event.getCode()==KeyCode.DOWN){
                    System.out.println("DOWN");
                } else if (event.getCode()==KeyCode.LEFT){
                    System.out.println("LEFT");
                } else if (event.getCode()==KeyCode.RIGHT){
                    System.out.println("RIGHT");
                }
            }
        });

        delim.getStyleClass().add("text");
        hourField.getStyleClass().add("text");
        minuteField.getStyleClass().add("text");
        hourField.getStyleClass().add("picker-field");
        minuteField.getStyleClass().add("picker-field");
        this.add(hourField,0,0);
        this.add(delim, 1, 0);
        this.add(minuteField, 2, 0);
    }
}
