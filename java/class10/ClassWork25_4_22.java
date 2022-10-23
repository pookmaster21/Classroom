import javax.swing.JFrame;
import java.awt.*;
import acm.graphics.*;
import acm.util.RandomGenerator;

public class ClassWork25_4_22 {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.drawRandomShapes(50);
    }
}

class Paint {
    private JFrame frame;
    private GCanvas canvas;

    Paint() {
        this.frame = new JFrame();
        this.canvas = new GCanvas();
        this.frame.setVisible(true);
        this.frame.setSize(1000, 1000);
        this.frame.add(this.canvas);
    }

    public void drawRect(Color color, double x, double y, double width, double height) {
        GRect rect = new GRect(width, height);

        rect.setFilled(true);
        rect.setColor(color);

        this.canvas.add(rect, x, y);
    }

    public void drawCircle(Color color, double x, double y, double radius) {
        GOval circle = new GOval(radius, radius);

        circle.setFilled(true);
        circle.setColor(color);

        this.canvas.add(circle, x, y);
    }

    public void drawTriangle(Color color, double x, double y, double length) {
        GPolygon triangle = new GPolygon(length, length);

        triangle.addVertex(0, -length / 2);
        triangle.addVertex(length / 2, length / 2);
        triangle.addVertex(-length / 2, length / 2);

        triangle.setFilled(true);
        triangle.setColor(color);

        this.canvas.add(triangle, x + length / 2, y + length / 2);
    }

    public void drawLine(double x, double y, double length) {
        GLine line = new GLine(x, y, x + length, y + length);
        this.canvas.add(line);
    }

    public void drawRandomShapes(int number) {
        char[] shapes = { 'r', 'c', 't', 'l' };

        char shape;
        double x, y;
        double width, height;
        Color color;
        for (int i = 0; i < number; i++) {
            shape = shapes[(int) Math.round(Math.random() * 3)];
            x = Math.random() * this.canvas.getSize().getWidth();
            y = Math.random() * this.canvas.getSize().getHeight();
            width = Math.random() * 50 + 10;
            height = Math.random() * 50 + 10;
            color = RandomGenerator.getInstance().nextColor();
            if (shape == 'r') {
                drawRect(color, x, y, width, height);
            } else if (shape == 'c') {
                drawCircle(color, x, y, height);
            } else if (shape == 't') {
                drawTriangle(color, x, y, height);
            } else if (shape == 'l') {
                drawLine(x, y, height);
            }
        }
    }
}