package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application implements EventHandler<ActionEvent> {

    private void addButtons(GridPane gridPane, int row){
        for (int i = 1; i <=3 ; i++) {
            Button button = new Button(" ");
        button.setPrefSize(250,250);
        gridPane.add(button,i-1,row);
        button.setOnAction(this);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane gridPane = new GridPane();
        addButtons(gridPane,0);
        addButtons(gridPane,1);
        addButtons(gridPane,2);

        primaryStage.setTitle("kółko i krzyżyk");
        primaryStage.setScene(new Scene(gridPane, 750, 750));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private int counter =0;
    @Override
    public void handle(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (counter%2==0) {
            button.setText("X");
        }
        else
        {
            button.setText("O");
        }
        button.setDisable(true);
        counter++;
    }
}
