import javax.swing.*;
import java.awt.*;
import java.io.IOException;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() throws IOException {
            setPreferredSize(new Dimension(820, 720));
            stage = new Stage();
            stage = StageReader.stageReader("data/stage1.rvb");
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
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