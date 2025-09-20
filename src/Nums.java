public class Nums extends Cell {
private int number;

public Nums(int x, int y, int number){ 
 super(x, y); 
this.number = number; 

} 
public void setNums(int number) { 

this.number = number; 

} 

@Override 
public boolean isMine() { 
return false; } 

@Override 
public int getNumber() { 
return number;
 } 

    
}
