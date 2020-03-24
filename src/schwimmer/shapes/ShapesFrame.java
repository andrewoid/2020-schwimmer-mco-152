package schwimmer.shapes;

import javax.swing.*;
import java.awt.*;

public class ShapesFrame extends JFrame {

    private ShapeComponent shapeComponent;

    public ShapesFrame() {
        setSize(800, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHAPES");

        setLayout(new BorderLayout());

        shapeComponent = new ShapeComponent();
        add(shapeComponent, BorderLayout.CENTER);

        ImageIcon houseImage = new ImageIcon("house.jpg");
        JButton houseButton = new JButton(houseImage);
        add(houseButton, BorderLayout.WEST);
        houseButton.addActionListener(actionEvent -> shapeComponent.setShapeHouse());

    }

    public static void main(String[] args) {
        new ShapesFrame().setVisible(true);
    }

}
