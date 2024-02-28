import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class jfxlistview extends Application {
    public static void main(String[] args) {
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

        Label l1 = new Label();
        Label l2 = new Label();

        Scene myScene = new Scene(fp,300,500);

        ObservableList<String> dept = FXCollections.observableArrayList("IT", "CSE", "EEE", "ECE", "CIVIL");
        ListView<String> lv = new ListView<>(dept);

        lv.setPrefSize(200, 100);
        lv.setEditable(true);

        lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldVal, String newVal) {
                l1.setText("Selected Department is " + newVal);
            }
        });

        lv.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observable, Number oldVal, Number newVal) {
                l2.setText("Department index is " + newVal.intValue());
            }
        });
        fp.getChildren().addAll(lv,l1,l2);

        myStage.setScene(myScene);
        myStage.show();
    }
}
