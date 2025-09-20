import java.awt.*;

public class Mines extends Cell {

     public Mines(int x, int y){ 
        super(x, y);
     }
 @Override
    public void paint(Graphics g, Point mouse){
        super.paint(g, mouse);
        if (revealed){
            g.drawString("💣", x + size/2 - 4, y + size/2 + 4); 
        }
    }

     @Override 
    public boolean isMine() { 
        return true; 
    }

    @Override
     public int getNumber() {
         return -1; 
        }

    
}
