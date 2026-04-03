import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChart extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new java.awt.Insets(20, 20, 20, 20)); // For spacing

        hbox.getChildren().addAll(
            createBar("Projects", 20, Color.RED),
            createBar("Quizzes", 10, Color.BLUE),
            createBar("Midterm", 30, Color.GREEN),
            createBar("Final", 40, Color.ORANGE)
        );

        Scene scene = new Scene(hbox, 450, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String label, int percentage, Color color) {
        VBox barContainer = new VBox(5);
        barContainer.setAlignment(Pos.BOTTOM_CENTER);

        // Scale height: 1% = 4 pixels
        Rectangle rect = new Rectangle(60, percentage * 4);
        rect.setFill(color);

        Text txt = new Text(label + "\n" + percentage + "%");
        txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        barContainer.getChildren().addAll(rect, txt);
        return barContainer;
    }

    public static void main(String[] args) { launch(args); }
}
