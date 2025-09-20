import java.awt.*; 

public class Nums extends Cell {
    private int number;

    public Nums(int x, int y, int number) {
        super(x, y);
        this.number = number;

    }

    public void setNums(int number) {

        this.number = number;

    }
@Override 
public void paint(Graphics g, Point mouse){ 
 if (revealed) { 
g.setColor(new Color(220, 220, 220)); 
} 
else if (contains(mouse)){ 
g.setColor(Color.LIGHT_GRAY); 
} else {
 g.setColor(Color.GRAY); 
} g.fillRect(x, y, size, size); 
g.setColor(Color.WHITE); g.drawRect(x, y, size, size); 

if (flagged && !revealed) { 
g.drawString("🚩", x + size/2 - 4, y + size/2 + 4);
 }

 if (revealed && number > 0) { 
Color[] colors = { 
Color.BLACK,
 new Color(128, 0, 128), 
Color.GREEN,
 Color.BLUE, 
Color.RED, 
new Color(128, 0, 0), 
Color.CYAN, 
Color.MAGENTA, 
Color.ORANGE 
}; 
g.setColor(colors[number]);
 Font oldFont = g.getFont();
 g.setFont(new Font("Arial", Font.BOLD, 16)); 
g.drawString(Integer.toString(number), x + size/2 - 4, y + size/2 + 4);
 g.setFont(oldFont); 
} 
} 

    @Override
    public boolean isMine() {
        return false;
    }

    @Override
    public int getNumber() {
        return number;
    }

}
