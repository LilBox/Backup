import javax.swing.*;
import java.awt.*;

public class BouncePlatform extends JComponent {

    private int dx;

    public BouncePlatform(int x){
        setLocation(x, 600);
        setSize(60, 10);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.fill(platform());
    }

    private Rectangle platform(){
        Rectangle platform = new Rectangle();
        platform.setSize(60, 10);
        return platform;
    }
}
