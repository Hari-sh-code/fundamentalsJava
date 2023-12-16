import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;



public class jfxcheckbox extends Application {
    public static void main(String [] args){
        launch(args);
    }

    public void __init__(){

    }
    public void stop(){

    }
    public void start(Stage myStage){
        
        myStage.setTitle("Checkbox Event");
        FlowPane fp = new FlowPane(Orientation.VERTICAL,25,25);
        fp.setAlignment(Pos.CENTER_LEFT);
        fp.setPadding(new Insets(0,0,0,35));
        Scene myScene = new Scene(fp,300,500);
        myStage.setScene(myScene);

        Label l1 = new Label("Captain Selection :-");
        Label response = new Label();
        fp.getChildren().addAll(l1);

        CheckBox cba = new CheckBox("Dhoni");
        CheckBox cbb = new CheckBox("Virat Kholi");

        cba.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cba.isSelected() && (!cbb.isSelected())) {
                    response.setText("Dhoni selected as Captain");
                } else {
                    if (cbb.isSelected() && (!cba.isSelected())) {
                        response.setText("Virat selected as Captain");
                    } else if (cba.isSelected() && cbb.isSelected()) {
                        response.setText("Both cannot be selected as Captain");
                    } else {
                        response.setText("No one selected as Captain");
                    }
                }
            }
        });
        
        fp.getChildren().add(response);
        fp.getChildren().addAll(cba,cbb);

        Label l2 = new Label("Coach :-");
        fp.getChildren().addAll(l2);

        CheckBox cb1 = new CheckBox("Rahul Dravid");
        CheckBox cb2 = new CheckBox("Sourav Ganguly");
        
        cb1.setSelected(true);
        cb2.setSelected(false);
        fp.getChildren().addAll(cb1,cb2);

        Label l3 = new Label("Team name :- ");
        fp.getChildren().addAll(l3);

        CheckBox cb3 = new  CheckBox("India");
        
        cb3.setIndeterminate(true);
        fp.getChildren().addAll(cb3);
        
        myStage.show();
    }
}
