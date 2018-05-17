import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball extends JComponent{

    private double xSpecific;
    private double ySpecific;
    private double vX;
    private double vY;

    public Ball(int x, int y){
        xSpecific = x;
        ySpecific = y;
        setLocation(x, y);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.RED);
        g2.fill(ball());
        setSize(20, 20);
    }

    private Ellipse2D.Double ball(){
        Ellipse2D.Double ball = new Ellipse2D.Double(0, 0, 20, 20);
        return ball;
    }
    
    public void update(){
        setLocation((int)(xSpecific + vX), (int)(ySpecific + vY));
        xSpecific += vX;
        ySpecific += vY;
    }
}
