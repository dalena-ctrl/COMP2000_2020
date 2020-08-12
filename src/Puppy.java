import java.awt.*;

public class Puppy implements Actor {

    Cell point;

    public Puppy(Cell point) {
        this.point = point;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(point.x, point.y, 35, 35);  
    }
}