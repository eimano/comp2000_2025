import java.awt.*;

class Cell {
    int x;
    int y;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    void paint(Graphics g){
        g.setColor(Color.BLACK);
            g.fillRect(x, y, 35, 35);
            g.setColor(Color.WHITE);
            g.drawRect(x, y, 35, 35);
    }
}
