import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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

   Random rand = new Random();
        int placed = 0;
        while(placed < mines){
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if(!(cells.get(r).get(c) instanceof Mines)){
               cells.get(r).set(c, new Mines(10 + 35*r, 10 + 35*c));
                placed++;
            }
        }

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(cells.get(i).get(j) instanceof Nums){
                  int count = countAdjacentMines(i, j);
                   ((Nums)cells.get(i).get(j)).setNums(count);
                }
            }
        }

    }
private int countAdjacentMines(int r, int c){
        int count = 0;
        for(int dr = -1; dr <= 1; dr++){
            for(int dc = -1; dc <= 1; dc++){
                int nr = r + dr, nc = c + dc;
                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols){
                    if(cells.get(nr).get(nc) instanceof Mines) count++;
                }
            }
       }
        return count;
    }
    
    public void paint(Graphics g, Point mouse){
          for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            cells.get(i).get(j).paint(g, mouse);
        }
    }
    }

    
}
