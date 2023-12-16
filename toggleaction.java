import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class toggleaction extends Application {
    public static void main(String [] args){
        launch(args);
    }

    public void __init__(){
    }

    public void stop(){
    }

    public void start(Stage myStage){

        myStage.setTitle("Toggle Button Event");

        FlowPane fp = new FlowPane(Orientation.VERTICAL,25,25);
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(0,0,0,35));
        
        Scene myScene = new Scene(fp,300,500);
        myStage.setScene(myScene);

        Label response = new Label();

        ToggleButton tButton = new ToggleButton("Toggle Button");
        fp.getChildren().add(tButton);

        tButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent tb){
                if(tButton.isSelected()){
                    response.setText("Button is ON");
                }
                else{
                    response.setText("Button is OFF");
                }
            }
        });
        fp.getChildren().add(response);

        myStage.show();

    }
}
