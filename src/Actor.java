import java.awt.*;

public abstract class Actor {
    Color display;
    Cell location; 

    public Actor(Cell location) {
        this.location = location;
    }

    public void paint(Graphics g) {
        g.setColor(display);
        g.fillRect(location.x, location.y, 35, 35);
    }
}

