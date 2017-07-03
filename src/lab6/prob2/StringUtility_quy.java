package lab6.prob2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bi on 7/2/17.
 */
public class StringUtility_quy extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * <p>
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("String Utility");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button countLetterBtn = new Button("Count Letters");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BASELINE_LEFT);
        hbBtn1.getChildren().add(countLetterBtn);
        grid.add(hbBtn1, 0, 0);

        Button reverseLetterBtn = new Button("Reverse Letters");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BASELINE_LEFT);
        hbBtn2.getChildren().add(reverseLetterBtn);
        grid.add(hbBtn2, 0, 1);

        Button removeDupBtn = new Button("Remove Duplicates");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.BASELINE_LEFT);
        hbBtn3.getChildren().add(removeDupBtn);
        grid.add(hbBtn3, 0, 2);

        Label inputLabel = new Label("Input");
        TextField inputTextField = new TextField();
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BASELINE_LEFT);
        hbBtn4.getChildren().add(inputLabel);
        hbBtn4.getChildren().add(inputTextField);
        grid.add(hbBtn4, 1, 0, 1, 2);

        Label outputLabel = new Label("Output");
        TextField outputTextField = new TextField();
        HBox hbBtn5 = new HBox(10);
        hbBtn5.setAlignment(Pos.BASELINE_LEFT);
        hbBtn5.getChildren().add(outputLabel);
        hbBtn5.getChildren().add(outputTextField);
        grid.add(hbBtn5, 1, 1, 1, 2);


        countLetterBtn.setOnAction((ActionEvent e) -> {
            outputTextField.setText("" + inputTextField.getText().length());
        });

        reverseLetterBtn.setOnAction((ActionEvent e) -> {
            StringBuilder sb = new StringBuilder(inputTextField.getText());
            outputTextField.setText(sb.reverse().toString());
        });

        removeDupBtn.setOnAction((ActionEvent e) -> {
            String input = inputTextField.getText();
            HashMap<Character, Character> hashMap = new HashMap<>();
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char charAt = input.charAt(i);
                if (!hashMap.containsKey(charAt)) {
                    output.append(charAt);
                }
                hashMap.put(charAt, charAt);
            }


            outputTextField.setText(output.toString());
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
