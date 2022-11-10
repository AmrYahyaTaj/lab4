/**
 * Created by learn on 04/10/22.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class Q7 extends JComponent {
    public void paintComponent(Graphics g) {
        Rectangle rect = new Rectangle(100, 100, 70, 200);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK.brighter());
        g2.fill(rect);
        g2.draw(rect);

        Ellipse2D.Double face = new  Ellipse2D.Double(110,110,50,50);
        g2.setColor(Color.RED.darker());
        g2.fill(face);

        Ellipse2D.Double face1 = new  Ellipse2D.Double(110,170,50,50);
        g2.setColor(Color.YELLOW.darker());
        g2.fill(face1);

        Ellipse2D.Double face2 = new  Ellipse2D.Double(110,230,50,50);
        g2.setColor(Color.GREEN.darker());
        g2.fill(face2);
    }
}
