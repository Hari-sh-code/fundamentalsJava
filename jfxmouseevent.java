import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.input.MouseEvent;

public class jfxmouseevent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Mouse Event");
        FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 25, 25);
        fp.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(fp, 200, 300);
        myStage.setScene(myScene);

        Label L1 = new Label("Event Handling");
        Label L2 = new Label("Mouse Event Handling");
        fp.getChildren().addAll(L1, L2);

        myScene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                int clickCount = me.getClickCount();
                String clickType = (clickCount > 1) ? "Double Click" : "Single Click";
                L1.setText("Mouse Event: " + clickType);
            }
        });

        myScene.setOnMouseMoved(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                double x = me.getSceneX();
                double y = me.getSceneY();
                String targetPosition = "Target is at " + x + "-" + y;
                L2.setText(targetPosition);
            }
        });

        myStage.show();
    }
}
