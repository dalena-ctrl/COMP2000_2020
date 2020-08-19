import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public class Canvas extends JPanel {

        Stage stage;

        public Canvas() {
            setPreferredSize(new Dimension(850, 720));
            stage = new Stage();
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }
    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }
} 