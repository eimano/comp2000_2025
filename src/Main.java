import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
Main window = new Main();
window.run();
      
    }

class Canvas extends JPanel {
    Grid grid;
    public Canvas() {
  setPreferredSize(new Dimension( 720, 720));
 grid = new Grid();

  addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int row = (x - 10) / Cell.size;
        int col = (y - 10) / Cell.size;
         
        repaint(); 
    }
});


    }

@Override
public void paint(Graphics g){
    super.paintComponent(g);
    grid.paint(g, getMousePosition());

}


}

 private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);

       Timer timer = new Timer(30, e -> repaint());
       timer.start();

      
 }
 public void run() {
    
  } 

}