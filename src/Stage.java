import java.awt.*;
import java.util.ArrayList;

public class Stage {

    Grid grid;
    Actor rabbit;
    Actor lion;
    Actor puppy;
    ArrayList<Actor> actors = new ArrayList<>();

    public Stage() {
        grid = new Grid();
        rabbit = new Rabbit(grid.setLocation());
        lion = new Lion(grid.setLocation());
        puppy = new Puppy(grid.setLocation());
        actors.add(lion);
        actors.add(puppy);
        actors.add(rabbit);
    }

    public void paint(Graphics g, Point mousePosition) {
        grid.paint(g, mousePosition);
        for (int i=0; i<actors.size(); i++) {
            actors.get(i).paint(g);
            System.out.println(actors.get(i));
        }
    }
}