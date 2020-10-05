import java.awt.*;
import java.util.ArrayList;

public abstract class Actor {

    Color colour; 
    Cell loc;
    ArrayList<Polygon> display;
    MoveStrategy strat;
    private float redness;
    int turns;
    private int moves;

    public void paint(Graphics g) {
        for (Polygon p: display) {
            g.setColor(new Color(redness, 0f, 1f-redness));
            g.fillPolygon(p);
            g.setColor(Color.GRAY);
            g.drawPolygon(p);
        }
    }

    public abstract void setPoly();

    public boolean isTeamRed() {
        return redness >= 0.5;
    }

    public void setLocation(Cell loc) {
        this.loc = loc;

        if (this.loc.row % 2 ==0) {
            this.strat = new RandomMove();
        } else {
            this.strat = new LeftMostMove();
        }
        setPoly();
    }

    public float getRedness() {
        return redness;
    }

    public int getMovement() {
        return moves;
    }
}