package schwimmer.shapes;

import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent {

    private int x = 0;
    private int rotation = 0;
    private String shape = "Star";

    public ShapeComponent() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        g.translate(centerX+x, centerY);
        Graphics2D g2d = (Graphics2D) g;
        g2d.rotate(Math.toRadians(rotation));
        x++;
        rotation++;

        if (shape.equals("Star")) {
            drawStar(g);
        }
        else if (shape.equals("House")) {
            drawHouse(g);
        }
    }

    private void drawHouse(Graphics g) {

    }

    private void drawStar(Graphics g) {
        g.drawLine(-50, -50, +50, -50);
        g.drawLine(+50, -50, 0, +50);
        g.drawLine(0, +50, -50, -50);

        g.drawLine(-50, +25, +50, +25);
        g.drawLine(+50, +25, 0, -75);
        g.drawLine(0, -75, -50, +25);
    }

    public void setShapeHouse() {
        shape = "House";
        repaint();
    }
}
