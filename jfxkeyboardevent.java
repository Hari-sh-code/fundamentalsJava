import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.input.*;

public class jfxkeyboardevent extends Application {
    public static void main(String[] args){
        launch(args);
    }

    public void __init__() {

    }

    public void stop() {

    }

    public void start(Stage myStage) {
        myStage.setTitle("Event Handling");
        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        Label L1 = new Label("Event Handling");
        Label L2 = new Label(" Keyboard events");
        fp.getChildren().addAll(L1, L2);
        Scene myScene = new Scene(fp, 300, 200);

        myScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                L1.setText("Key pressed is " + ke.getCode().toString()+" ");
            }
        });

        myScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                L2.setText("Key released is " + ke.getCode().toString());
            }
        });

        StringBuffer str = new StringBuffer();
        myScene.setOnKeyTyped(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                str.append(ke.getCharacter());
                L2.setText(str.toString());
            }
        });

        myStage.setScene(myScene);
        myStage.show();
    }
}
