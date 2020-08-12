import java.awt.*;

public class Cell extends Rectangle {

    public Cell(int x, int y) {
        super(x, y, 35, 35);
    }

    @Override
    public boolean contains (Point target) {
        if (target == null) {
            return false;
        } else 
        return super.contains(target);
    }

    public void paint(Graphics g, boolean highlighted) {
        if (highlighted) {
            g.setColor(Color.GRAY);
            g.fillRect(x, y, 35, 35);
        }
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 35, 35);
    }
}

