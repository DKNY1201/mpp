package prob1;

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddressForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Form");

		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setHgap(10);
		grid1.setVgap(10);
		grid1.setPadding(new Insets(10, 10, 0, 10));

		Label lbName = new Label("Name");
		TextField tfName = new TextField();
		grid1.add(lbName, 0, 0);
		grid1.add(tfName, 0, 1);

		Label lbStreet = new Label("Street");
		TextField tfStreet = new TextField();
		grid1.add(lbStreet, 1, 0);
		grid1.add(tfStreet, 1, 1);

		Label lbCity = new Label("City");
		TextField tfCity = new TextField();
		grid1.add(lbCity, 2, 0);
		grid1.add(tfCity, 2, 1);

		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setHgap(10);
		grid2.setVgap(10);
		grid2.setPadding(new Insets(0, 90, 0, 90));

		Label lbState = new Label("State");
		TextField tfState = new TextField();
		grid2.add(lbState, 0, 0);
		grid2.add(tfState, 0, 1);

		Label lbZip = new Label("Zip");
		TextField tfZip = new TextField();
		grid2.add(lbZip, 1, 0);
		grid2.add(tfZip, 1, 1);

		Button btnSubmit = new Button("Submit");
		HBox hbx = new HBox();
		hbx.setAlignment(Pos.BASELINE_CENTER);
		hbx.getChildren().add(btnSubmit);
		grid2.add(hbx, 0, 2, 4, 1);

		btnSubmit.setOnAction((ActionEvent e) -> {
			System.out.println(tfName.getText());
			System.out.println(tfStreet.getText());
			System.out.println(tfCity.getText() + ", " + tfState.getText() + " " + tfZip.getText());
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10, 50, 10, 50));
		grid.add(grid1, 0, 0);
		grid.add(grid2, 0, 1);

		Scene scene = new Scene(grid);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
