import java.awt.*;

public class Cell implements drawable {
    int x;
    int y;
    static int size = 35;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }
    protected boolean revealed = false;

   @Override
   public void paint(Graphics g, Point mouse){
        if (contains(mouse)){
            g.setColor(Color.LIGHT_GRAY);
        } 
        
        else {
    
        g.setColor(Color.GRAY);
        }
            g.fillRect(x, y, size, size);
            g.setColor(Color.WHITE);
            g.drawRect(x, y, size, size);

    
    }

    boolean contains (Point p){
        if (p != null){
            return ( x < p.x && x + size > p.x && y < p.y && y + size > p.y);
        } else {
            return false;
        }
    }
}
