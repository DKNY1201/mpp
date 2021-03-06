package lab9.part1.prob1.ui;

import lab9.part1.prob1.business.ControllerInterface;
import lab9.part1.prob1.business.LibraryMember;
import lab9.part1.prob1.business.SystemController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

public class AllMembersWindow extends Stage implements LibWindow {
	public static final AllMembersWindow INSTANCE = new AllMembersWindow();
	public static String memberIDToEdit = "";

	private boolean isInitialized = false;

	public boolean isInitialized() {
		return isInitialized;
	}

	public void isInitialized(boolean val) {
		isInitialized = val;
	}

	private AllMembersWindow() {
	}

	private ObservableList<LibraryMember> libMemberData = FXCollections.observableArrayList();

	@SuppressWarnings("unchecked")
	public void init() {
		GridPane grid = new GridPane();
		grid.setId("top-container");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("All member");
		scenetitle.setId("white-color");
		scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		TableView<LibraryMember> table = new TableView<LibraryMember>();

		ControllerInterface c = new SystemController();
		libMemberData.clear();
		libMemberData.addAll(c.getAllMembers());
		table.setItems(libMemberData);

		TableColumn<LibraryMember, String> memberIDColumn = new TableColumn<LibraryMember, String>("Member ID");
		memberIDColumn.setCellValueFactory(new PropertyValueFactory<LibraryMember, String>("memberId"));
		TableColumn<LibraryMember, String> firstNameColumn = new TableColumn<LibraryMember, String>("First Name");
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<LibraryMember, String>("firstName"));
		TableColumn<LibraryMember, String> lastNameColumn = new TableColumn<LibraryMember, String>("Last Name");
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<LibraryMember, String>("lastName"));
		TableColumn<LibraryMember, String> telephoneColumn = new TableColumn<LibraryMember, String>("Telephone");
		telephoneColumn.setCellValueFactory(new PropertyValueFactory<LibraryMember, String>("telephone"));
		TableColumn<LibraryMember, String> addressColumn = new TableColumn<LibraryMember, String>("Address");
		addressColumn.setCellValueFactory(new PropertyValueFactory<LibraryMember, String>("address"));

		TableColumn<LibraryMember,String> actionCol = new TableColumn<LibraryMember,String>("Action");
		actionCol.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));

		Callback<TableColumn<LibraryMember, String>, TableCell<LibraryMember, String>> cellFactory = //
				new Callback<TableColumn<LibraryMember, String>, TableCell<LibraryMember, String>>() {
					@Override
					public TableCell<LibraryMember, String> call(final TableColumn<LibraryMember, String> param) {
						final TableCell<LibraryMember, String> cell = new TableCell<LibraryMember, String>() {

							final Button btn = new Button("Edit");

							@Override
							public void updateItem(String item, boolean empty) {
								super.updateItem(item, empty);
								if (empty) {
									setGraphic(null);
									setText(null);
								} else {
									btn.setOnAction(event -> {
										LibraryMember currentMember = getTableView().getItems().get(getIndex());
										memberIDToEdit = currentMember.getMemberId();
										Start.hideAllWindows();
										if (!EditMemberWindow.INSTANCE.isInitialized()) {
											EditMemberWindow.INSTANCE.init();
										}

										EditMemberWindow.INSTANCE.show();
									});
									setGraphic(btn);
									setText(null);
								}
							}
						};
						return cell;
					}
				};

		actionCol.setCellFactory(cellFactory);

		table.getColumns().addAll(memberIDColumn, firstNameColumn, lastNameColumn, telephoneColumn, addressColumn,
				actionCol);

		table.setMinWidth(870);
		table.setMaxWidth(870);

		grid.add(table, 0, 1, 2, 1);

		Button backBtn = new Button("Back to Main");
		backBtn.setOnAction((ActionEvent e) -> {
			Start.hideAllWindows();
			Start.primStage().show();
		});

		HBox hBack = new HBox(10);
		hBack.setAlignment(Pos.BOTTOM_LEFT);
		hBack.getChildren().add(backBtn);
		grid.add(hBack, 0, 2);

		Scene scene = new Scene(grid);
		scene.getStylesheets().add(getClass().getResource("resource/css/library.css").toExternalForm());
		setScene(scene);
	}
}
