import javafx.application.*;
import javafx.beans.value.ObservableValue;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;

public class radioaction extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Radio Button");

        FlowPane fp = new FlowPane(Orientation.VERTICAL, 25, 25); 
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(20, 20, 20, 20)); 

        Scene myScene = new Scene(fp, 600, 600); 
        myStage.setScene(myScene);

        Label L1 = new Label("Which of the following is a High-level Language?");
        Label response = new Label();
        Label L2 = new Label();

        fp.getChildren().addAll(L1, response);

        RadioButton rbutton1 = new RadioButton("Python");
        RadioButton rbutton2 = new RadioButton("C");
        fp.getChildren().addAll(rbutton1, rbutton2);
        
        ToggleGroup tg = new ToggleGroup();
        rbutton1.setToggleGroup(tg);
        rbutton2.setToggleGroup(tg);

        rbutton1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Python is selected");
            }
        });

        rbutton2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("C is selected");
            }
        });

        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){ 
            public void changed(ObservableValue<? extends Toggle> changed, Toggle oldVal, Toggle newVal) {
                RadioButton rb = (RadioButton) newVal;
                L2.setText("Answer selected as " + rb.getText());
            }
        });

        //rbutton1.fire();
        fp.getChildren().add(L2);
        myStage.show();
    }
}
