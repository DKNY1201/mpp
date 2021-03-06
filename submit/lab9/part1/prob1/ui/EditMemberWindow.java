package lab9.part1.prob1.ui;

import lab9.part1.prob1.business.ControllerInterface;
import lab9.part1.prob1.business.LibraryMember;
import lab9.part1.prob1.business.SystemController;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lab9.part1.prob1.ui.rulesets.RuleException;
import lab9.part1.prob1.ui.rulesets.RuleSet;
import lab9.part1.prob1.ui.rulesets.RuleSetFactory;

public class EditMemberWindow extends Stage implements LibWindow {
	public static final EditMemberWindow INSTANCE = new EditMemberWindow();

	private boolean isInitialized = false;
	public boolean isInitialized() {
		return isInitialized;
	}
	public void isInitialized(boolean val) {
		isInitialized = val;
	}
	private EditMemberWindow() {}

	TextField memberIDTextField;
	TextField firstNameTextField;
	TextField lastNameTextField;
	TextField streetTextField;
	TextField cityTextField;
	TextField stateTextField;
	TextField zipTextField;
	TextField phoneTextField;
	ControllerInterface c = new SystemController();

	public void init() {
		GridPane grid = new GridPane();
		grid.setId("white-label-container");
		grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Edit member information");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        scenetitle.setId("white-color");
        grid.add(scenetitle, 0, 0, 2, 1);

		Label firstNameLabel = new Label("First name");
		grid.add(firstNameLabel, 0, 2);
		firstNameTextField = new TextField();
		grid.add(firstNameTextField, 1, 2);

		Label lastNameLabel = new Label("Last name");
		grid.add(lastNameLabel, 0, 3);
		lastNameTextField = new TextField();
		grid.add(lastNameTextField, 1, 3);

		Label streetLabel = new Label("Street");
		grid.add(streetLabel, 0, 4);
		streetTextField = new TextField();
		grid.add(streetTextField, 1, 4);

		Label cityLabel = new Label("City");
		grid.add(cityLabel, 0, 5);
		cityTextField = new TextField();
		grid.add(cityTextField, 1, 5);

		Label stateLabel = new Label("State");
		grid.add(stateLabel, 0, 6);
		stateTextField = new TextField();
		grid.add(stateTextField, 1, 6);

		Label zipLabel = new Label("Zip");
		grid.add(zipLabel, 0, 7);
		zipTextField = new TextField();
		grid.add(zipTextField, 1, 7);

		Label phoneLable = new Label("Phone");
		grid.add(phoneLable, 0, 8);
		phoneTextField = new TextField();
		grid.add(phoneTextField, 1, 8);
		
		fillMemberInformation();

		Button newMemberBtn = new Button("Update");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(newMemberBtn);
		grid.add(hbBtn, 1, 9);
		
		newMemberBtn.setOnAction(
				(ActionEvent e) -> {
					try {
						RuleSet newMemberRules = RuleSetFactory.getRuleSet(EditMemberWindow.this);
						newMemberRules.applyRules(EditMemberWindow.this);

						c.editMember(getMemberIDValue(), firstNameTextField.getText(),
								lastNameTextField.getText(), streetTextField.getText(),
								cityTextField.getText(), stateTextField.getText(),
								zipTextField.getText(), phoneTextField.getText());
						
						Alert alert = new Alert(AlertType.NONE, "Edit member information successful!", ButtonType.OK);
						alert.showAndWait();
						if (alert.getResult() == ButtonType.OK) {
							showAllMembersWindow();
						}
					} catch(RuleException ex) {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Incorrect input data");
                        alert.setContentText(ex.getMessage());
                        alert.showAndWait();
					}
				});

		Button backBtn = new Button("Back to All members");
        backBtn.setOnAction(
				(ActionEvent e) -> {
					showAllMembersWindow();
				});

        HBox hBack = new HBox(10);
        hBack.setAlignment(Pos.BOTTOM_LEFT);
        hBack.getChildren().add(backBtn);
        grid.add(hBack, 0, 10);

		Scene scene = new Scene(grid);
		scene.getStylesheets().add(getClass().getResource("resource/css/library.css").toExternalForm());
        setScene(scene);
	}
	
	public void showAllMembersWindow() {
		Start.hideAllWindows();
		if (!AllMembersWindow.INSTANCE.isInitialized()) {
			AllMembersWindow.INSTANCE.init();
		}

		AllMembersWindow.INSTANCE.show();
	}
	
	public void fillMemberInformation() {
		LibraryMember member = c.searchMember(getMemberIDValue());
		firstNameTextField.setText(member.getFirstName());
		lastNameTextField.setText(member.getLastName());
		streetTextField.setText(member.getAddress().getStreet());
		cityTextField.setText(member.getAddress().getCity());
		stateTextField.setText(member.getAddress().getState());
		zipTextField.setText(member.getAddress().getZip());
		phoneTextField.setText(member.getTelephone());
	}

	public String getMemberIDValue() {
		return AllMembersWindow.memberIDToEdit;
	}

	public String getFirstNameValue() {
		return firstNameTextField.getText();
	}

	public String getLastNameValue() {
		return lastNameTextField.getText();
	}

	public String getStreetValue() {
		return streetTextField.getText();
	}

	public String getCityValue() {
		return cityTextField.getText();
	}

	public String getStateValue() {
		return stateTextField.getText();
	}

	public String getZipValue() {
		return zipTextField.getText();
	}

	public String getPhoneValue() {
		return phoneTextField.getText();
	}
}
