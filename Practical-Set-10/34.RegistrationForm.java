import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10); grid.setHgap(10);

        TextField tfRoll = new TextField();
        TextField tfName = new TextField();
        TextField tfAge = new TextField();
        TextField tfEmail = new TextField();
        Button btnSubmit = new Button("Submit");

        grid.addRow(0, new Label("Roll No:"), tfRoll);
        grid.addRow(1, new Label("Name:"), tfName);
        grid.addRow(2, new Label("Age:"), tfAge);
        grid.addRow(3, new Label("Email:"), tfEmail);
        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(tfRoll.getText());
                int age = Integer.parseInt(tfAge.getText());
                String email = tfEmail.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email format.");
                }

                showAlert(Alert.AlertType.INFORMATION, "Success", "Registered: " + tfName.getText());
            } catch (Exception ex) {
                showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
            }
        });

        stage.setScene(new Scene(grid, 350, 250));
        stage.setTitle("Student Registration");
        stage.show();
    }

    private void showAlert(Alert.AlertType type, String title, String msg) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.show();
    }

    public static void main(String[] args) { launch(args); }
}
