import java.awt.*;

public class Stage {

    Grid grid;
    Actor rabbit;
    Actor lion;
    Actor puppy;

    public Stage() {
        grid = new Grid();
        rabbit = new Rabbit(grid.setLocation());
        lion = new Lion(grid.setLocation());
        puppy = new Puppy(grid.setLocation());
    }

    public void paint(Graphics g, Point mousePosition) {
        grid.paint(g, mousePosition); 
        rabbit.paint(g);
        lion.paint(g);
        puppy.paint(g);
    }
}
