import java.awt.*;
import java.util.ArrayList;

class Grid {
private final ArrayList<ArrayList<Cell>> cells;   
 int rows = 20;
 int cols = 20;
    int mines = 56;
private boolean gameOver = false;

    public Grid(){
         cells = new ArrayList<>();
       for(int i = 0; i < rows; i++){
           ArrayList<Cell> row = new ArrayList<>();
           for(int j = 0; j < cols; j++){
               row.add(new Nums(10 + 35*i, 10 + 35*j, 0));
           }
           cells.add(row);
       }



    }

    public void paint(Graphics g, Point mouse){
          for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            cells.get(i).get(j).paint(g, mouse);
        }
    }
    }
    
}
