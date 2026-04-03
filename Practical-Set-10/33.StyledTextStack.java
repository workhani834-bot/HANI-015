import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.Random;

public class StyledTextStack extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(15); // 15px spacing
        vbox.setAlignment(Pos.CENTER);
        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text txt = new Text("Text " + i);
            txt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            
            // Random color and opacity (0.3 to 1.0)
            double opacity = 0.3 + (1.0 - 0.3) * rand.nextDouble();
            txt.setFill(Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble(), opacity));
            
            vbox.getChildren().add(txt);
        }

        Scene scene = new Scene(vbox, 300, 400);
        primaryStage.setTitle("Vertical Text Stack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
