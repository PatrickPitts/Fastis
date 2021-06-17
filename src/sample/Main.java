package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import view.CreateEventGridPane;
import view.CreateEventGroup;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        List<Node> nodes = new ArrayList<>();

        DatePicker datePicker = new DatePicker();
        Button b1 = new Button("Save");

        b1.setLayoutY(300.);
        TextArea input = new TextArea();
        input.setLayoutY(100.);
        TextField titleTextField = new TextField();
        input.setPrefRowCount(10);
        input.setPrefColumnCount(50);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(input.getText());
            }
        });

        Scene scene = new Scene(new CreateEventGridPane(), 600, 400);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Fastis - Local Calendar Events");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
