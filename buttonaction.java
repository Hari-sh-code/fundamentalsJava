import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class buttonaction extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void __init__(){

    }
    public void stop(){

    }
    public void start(Stage myStage) {
        
        myStage.setTitle("Creating Buttons");
        
        FlowPane fp = new FlowPane(Orientation.HORIZONTAL,25,25);
        fp.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(fp, 500, 500);
        myStage.setScene(myScene);

        Button bt1 = new Button("Click here to Continue !");
        Label L1 = new Label("WebPage");

        bt1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                L1.setText("You will be redirected to next page !");
            }
        });

        fp.getChildren().addAll(bt1,L1);
        myStage.show();
    }
}
