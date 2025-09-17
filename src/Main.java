import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
Main window = new Main();
      
    }

class Canvas extends JPanel {
    Grid grid;
    public Canvas() {
  setPreferredSize(new Dimension( 720, 720));
 grid = new Grid();


    }

@Override
public void paint(Graphics g){
    grid.paint(g);

}
}

 private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
 }
}