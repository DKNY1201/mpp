package prob2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StringUtilityWindow extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("String Utility");
		
		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setHgap(10);
		grid1.setVgap(10);
		grid1.setPadding(new Insets(10,5,10,10));
		
		Button btnCount = new Button("Count Letters");
		btnCount.setMinSize(150, 40);
		grid1.add(btnCount, 0, 0);
		Button btnReverse = new Button("Reverse Letters");
		btnReverse.setMinSize(150, 40);
		grid1.add(btnReverse, 0, 1);
		Button btnRemoveDups = new Button("Remove Duplicates");
		btnRemoveDups.setMinSize(150, 40);
		grid1.add(btnRemoveDups, 0, 2);
		
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setHgap(10);
		grid2.setVgap(10);
		grid2.setPadding(new Insets(10,10,10,5));
		
		Label lbInput = new Label("Input");
		TextField tfInput = new TextField();
		grid2.add(lbInput, 0, 0);
		grid2.add(tfInput, 0, 1);

		Label lbOutput = new Label("Output");
		TextField tfOutput = new TextField();
		grid2.add(lbOutput, 0, 2);
		grid2.add(tfOutput, 0, 3);
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10,50,30,50));
		
		grid.add(grid1, 0, 0);
		grid.add(grid2, 1, 0);
		
		btnCount.setOnAction((ActionEvent e) -> {
			tfOutput.setText(String.valueOf(tfInput.getText().length()));
		});
		
		btnReverse.setOnAction((ActionEvent e) -> {
			tfOutput.setText(reverse(tfInput.getText()));
		});
		
		btnRemoveDups.setOnAction((ActionEvent e) -> {
			tfOutput.setText(removeDuplicates(tfInput.getText()));
		});
		
		Scene scene = new Scene(grid);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static String reverse(String str){
		StringBuilder stringReversed = new StringBuilder(str);
		return stringReversed.reverse().toString();
	}
	
	public static String removeDuplicates(String str){
		StringBuilder stringRemovedDuplicates = new StringBuilder();
		stringRemovedDuplicates.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++){
			boolean isDuplicated = false;
			for (int j = 0; j < i; j++){
				if (str.charAt(i) == str.charAt(j)){
					isDuplicated = true;
					break;
				}
			}
			if (!isDuplicated){
				stringRemovedDuplicates.append(str.charAt(i));
			}
		}
		
		return stringRemovedDuplicates.toString();
	}
}
