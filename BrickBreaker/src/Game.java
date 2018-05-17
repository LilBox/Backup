import javax.swing.*;
import java.awt.event.*;

public class Game extends JFrame implements ActionListener {

    private BouncePlatform mainPlatform;
    private Ball breaker;
    private boolean released;

    public Game() {
        setSize(560, 700);
        setResizable(false);
        mainPlatform = new BouncePlatform(getWidth() / 2 - 30);
        breaker = new Ball(getWidth() / 2 - 10, 580);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void start() {
        released = false;
        setVisible(true);
        getContentPane().add(mainPlatform);
        getContentPane().add(breaker);
        Timer updater = new Timer(1, this);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mainPlatform.setLocation(e.getX() - getInsets().left - mainPlatform.getWidth() / 2, mainPlatform.getY());
                if (released == false)
                    breaker.setLocation(e.getX() - getInsets().left - breaker.getWidth() / 2, breaker.getY());
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
