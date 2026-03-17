import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JPanel {

  Main() {
        setPreferredSize(new Dimension(608, 672)); // 19*32 x 21*32
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw Pac-Man placeholder
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 32, 32);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac-Man");
        PacMan game = new PacMan();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}