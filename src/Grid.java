import java.awt.*;

public class Grid {

    Cell[][] grid = new Cell[20][20];

    public Grid() {
        // Placing cell coordinates into 2d array
        for (int x=0; x<grid.length; x++) {
            for (int y=0; y<grid.length; y++) {
                grid[x][y] = new Cell(10 + x * 35, 10 + y * 35);
            }
        }
    }
    
    public void paint(Graphics g) {
        for (int x=0; x<grid.length; x++) {
            for (int y=0; y<grid.length; y++) {
                grid[x][y].paint(g);
            }
        }
    }
}
