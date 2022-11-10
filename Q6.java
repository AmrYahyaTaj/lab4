/**
 * Created by learn on 04/10/22.
 */
import javax.swing.*;
import java.awt.*;
public class Q6 extends JComponent {

    public void paintComponent(Graphics g) {
        Rectangle rect = new Rectangle(100, 100, 100, 100);
        Rectangle rect1 = new Rectangle(250, 100, 100, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
        g2.fill(rect);
        g2.draw(rect);

        Graphics2D g3 = (Graphics2D) g;
        g3.setColor(Color.MAGENTA.darker());
        g3.fill(rect1);
        g3.draw(rect1);
    }

}
