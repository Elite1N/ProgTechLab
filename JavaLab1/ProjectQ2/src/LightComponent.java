import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
//    A component that draws two rectangles.
public class LightComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(55, 5, 175, 350);
        g2.draw(box);

        Ellipse2D.Double circle = new Ellipse2D.Double(95,20,100,100);
        g2.setColor(Color.RED);
        g2.fill(circle);


        g2.translate(0,110);
        g2.setColor((Color.YELLOW));
        g2.fill(circle);


        g2.translate(0,110);
        g2.setColor(Color.GREEN);
        g2.fill(circle);


    }
}