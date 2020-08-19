import java.awt.*;

public class Puppy extends Actor {

    public Puppy(Cell point) {
        super(point);
        //display = Color.GREEN;

        Polygon ear1 = new Polygon();
        ear1.addPoint(location.x + 5, location.y + 5);
        ear1.addPoint(location.x + 15, location.y + 5);
        ear1.addPoint(location.x + 5, location.y + 15);
        Polygon ear2 = new Polygon();
        ear2.addPoint(location.x + 20, location.y + 5);
        ear2.addPoint(location.x + 30, location.y + 5);
        ear2.addPoint(location.x + 30, location.y + 15);
        Polygon face = new Polygon();
        face.addPoint(location.x+8, location.y + 7);
        face.addPoint(location.x+27, location.y + 7);
        face.addPoint(location.x+27, location.y + 25);
        face.addPoint(location.x+8, location.y + 25);
    }
}