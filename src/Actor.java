import java.awt.*;

public class Actor {
    Color display;
    Cell location;
    
    public Actor(Cell point) {
        this.location = point;
    }

    public void paint(Graphics g) {
        g.setColor(display);
        g.fillRect(location.x+7, location.y+7, 22, 22);
        g.setColor(Color.BLACK);
        g.drawRect(location.x+7, location.y+7, 22, 22);
    }
}
