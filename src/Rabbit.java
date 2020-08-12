import java.awt.*;

public class Rabbit implements Actor {

    Cell point;

    public Rabbit(Cell point) {
        this.point = point;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(point.x, point.y, 35, 35);
    } 
}