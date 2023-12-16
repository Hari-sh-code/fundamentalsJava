import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {
    public void start(Stage stage) {
        stage.setTitle("Creating RadioButton");

        TilePane root = new TilePane();
        Label label = new Label("Select your gender:");
        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");
        RadioButton otherRadioButton = new RadioButton("Others");

        root.getChildren().addAll(label, maleRadioButton, femaleRadioButton, otherRadioButton);

        // Create a ToggleGroup
        ToggleGroup genderToggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        otherRadioButton.setToggleGroup(genderToggleGroup);

        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.show();

        genderToggleGroup.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            if (genderToggleGroup.getSelectedToggle() != null) {
                RadioButton selectedRadioButton = (RadioButton) newToggle;
                System.out.println("Selected gender: " + selectedRadioButton.getText());
            }
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
