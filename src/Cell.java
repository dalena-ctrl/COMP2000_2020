import java.awt.*;

public class Cell {

    int x;
    int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean contains (Point target) {
        if (target == null) {
            return false;
        } else 
        return target.x > x && target.x < x + 35 && target.y > y && target.y < y + 35;
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

