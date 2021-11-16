package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.character.Rectangle;
import sample.character.Shape;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Random;

public class Controller implements Initializable {
    @FXML
    Canvas canvas;
    ArrayList rects = new ArrayList<Shape>();
    Random rand = new Random();
    double r, g, b;
    int[] arr = new int[20];

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawAll(gc);
        r = rand.nextDouble();
        g = rand.nextDouble();
        b = rand.nextDouble();

    }

    public void drawAll(GraphicsContext gc) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                double r = rand.nextDouble();
                double g = rand.nextDouble();
                double b = rand.nextDouble();
                Rectangle rectangle = new Rectangle(i * 30, j * 30, 30, new Color(r, g, b, 1));
                rectangle.draw(gc);
                rects.add(rectangle);
            }
        }

    }
}

