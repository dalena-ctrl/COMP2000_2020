import java.awt.*;

public class Cell extends Rectangle {

    static int size = 35;
    char col;
    int row;


    public Cell(char col, int row, int x, int y) {
        super(x, y, size, size);
        this.col = col;
        this.row = row;
    }

    public void paint(Graphics g, Point mousePosition) {
        if (contains(mousePosition)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    public boolean contains(Point p) {
        if (p!= null) {
            return super.contains(p);
        } else {
            return false;
        }
    }
}