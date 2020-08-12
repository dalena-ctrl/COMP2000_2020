import java.awt.*;

public class Lion implements Actor {

    Cell point;

    public Lion(Cell point) {
        this.point = point;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(point.x, point.y, 35, 35);
    }
}