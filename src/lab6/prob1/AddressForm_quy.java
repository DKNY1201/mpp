package lab6.prob1;

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

/**
 * Created by Bi on 7/2/17.
 */
public class AddressForm_quy extends Application{
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
        primaryStage.setTitle("Address form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label nameLabel = new Label("Name");
        TextField nameTextField = new TextField();
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BASELINE_CENTER);
        hbBtn1.getChildren().add(nameLabel);
        hbBtn1.getChildren().add(nameTextField);
        grid.add(hbBtn1, 0, 0);

        Label streetLabel = new Label("Street");
        TextField streetTextField = new TextField();
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BASELINE_CENTER);
        hbBtn2.getChildren().add(streetLabel);
        hbBtn2.getChildren().add(streetTextField);
        grid.add(hbBtn2, 1, 0);


        Label cityLabel = new Label("City");
        TextField cityTextField = new TextField();
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.BASELINE_CENTER);
        hbBtn3.getChildren().add(cityLabel);
        hbBtn3.getChildren().add(cityTextField);
        grid.add(hbBtn3, 2, 0);

        Label stateLabel = new Label("State");
        TextField stateTextField = new TextField();
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BASELINE_CENTER);
        hbBtn4.getChildren().add(stateLabel);
        hbBtn4.getChildren().add(stateTextField);
        grid.add(hbBtn4, 0, 1,2,1);

        Label zipLabel = new Label("Zip");
        TextField zipTextField = new TextField();
        HBox hbBtn5 = new HBox(10);
        hbBtn5.setAlignment(Pos.BASELINE_CENTER);
        hbBtn5.getChildren().add(zipLabel);
        hbBtn5.getChildren().add(zipTextField);
        grid.add(hbBtn5, 1, 1, 2, 1);


        Button btn = new Button("Submit");
        HBox hbBtn6 = new HBox(10);
        hbBtn6.setAlignment(Pos.BASELINE_CENTER);
        hbBtn6.getChildren().add(btn);
        grid.add(hbBtn6, 0, 2, 4,1);

//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                StringBuilder sb = new StringBuilder();
//                String newLine = System.lineSeparator();
//                sb.append(nameTextField.getCharacters().toString()).append(newLine)
//                        .append(streetTextField.getCharacters().toString()).append(newLine)
//                        .append(cityTextField.getCharacters().toString()).append(", ")
//                        .append(stateTextField.getCharacters().toString()).append(" ")
//                        .append(zipTextField.getCharacters().toString());
//                System.out.println(sb.toString());
//            }
//        });

        btn.setOnAction((ActionEvent e) -> {

                StringBuilder sb = new StringBuilder();
                String newLine = System.lineSeparator();
                sb.append(nameTextField.getCharacters().toString()).append(newLine)
                        .append(streetTextField.getCharacters().toString()).append(newLine)
                        .append(cityTextField.getCharacters().toString()).append(", ")
                        .append(stateTextField.getCharacters().toString()).append(" ")
                        .append(zipTextField.getCharacters().toString());
                System.out.println(sb.toString());
            }
        );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
