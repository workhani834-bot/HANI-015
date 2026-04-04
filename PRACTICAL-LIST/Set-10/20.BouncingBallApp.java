import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BouncingBallApp extends Application {

    private double dx = 2; // Initial horizontal velocity
    private boolean running = false;

    @Override
    public void start(Stage primaryStage) {
        // 1. Create the Ball
        Circle ball = new Circle(20, Color.DODGERBLUE);
        ball.setCenterX(50);
        ball.setCenterY(150);

        // 2. Create the Drawing Pane (Container)
        Pane canvas = new Pane(ball);
        canvas.setStyle("-fx-background-color: #f4f4f4; -fx-border-color: #ccc;");

        // 3. Controls: Buttons and Slider
        Button btnStart = new Button("Start");
        Button btnStop = new Button("Stop");
        Slider speedSlider = new Slider(1, 10, 2); // Min: 1, Max: 10, Default: 2
        speedSlider.setShowTickLabels(true);
        speedSlider.setShowTickMarks(true);

        // 4. Animation Logic using AnimationTimer
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!running) return;

                // Update position
                double x = ball.getCenterX();
                double radius = ball.getRadius();
                double paneWidth = canvas.getWidth();

                // Boundary Check (Collision Detection)
                if (x + radius >= paneWidth || x - radius <= 0) {
                    dx *= -1; // Reverse direction
                }

                // Move the ball based on current velocity and slider speed
                // We multiply dx by the slider value to scale the speed
                double currentSpeed = speedSlider.getValue();
                ball.setCenterX(x + (dx > 0 ? currentSpeed : -currentSpeed));
                
                // Ensure ball stays centered vertically if resized
                ball.setCenterY(canvas.getHeight() / 2);
            }
        };

        // 5. Button Actions
        btnStart.setOnAction(e -> {
            running = true;
            timer.start();
        });

        btnStop.setOnAction(e -> running = false);

        // 6. Layout Management
        HBox controls = new HBox(15, btnStart, btnStop, speedSlider);
        controls.setAlignment(Pos.CENTER);
        controls.setPadding(new javafx.geometry.Insets(10));

        BorderPane root = new BorderPane();
        root.setCenter(canvas);
        root.setBottom(controls);

        // 7. Scene Setup
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("JavaFX Bouncing Ball - Practical 20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
