package tiles;

import java.awt.Color;
import java.util.Random;

public class RandomColor{
    public RandomColor(){
        
    }
    
    public Color RC(Tile p){
        Random r = new Random();
        int i;
        Color oldcolor;
        Color newcolor = Color.BLACK;
        boolean b = true;
        
        oldcolor = p.getBackground();
        
        while(b){
            i = r.nextInt(10);
            
            switch(i){
                case 0:
                    newcolor = Color.YELLOW;
                    break;
                case 1:
                    newcolor = Color.ORANGE;
                    break;
                case 2:
                   newcolor = Color.RED;
                    break;
                case 3:
                    newcolor = Color.MAGENTA;
                    break;
                case 4:
                    newcolor = Color.BLUE;
                    break;
                case 5:
                    newcolor = Color.GREEN;
                    break;
                case 6:
                    newcolor = Color.BLACK;
                    break;
                case 7:
                    newcolor = Color.WHITE;
                    break;
                case 8:
                    newcolor = Color.CYAN;
                    break;
                case 9:
                    newcolor = Color.PINK;
                    break;
                default:
                    newcolor = Color.BLACK;
                    break;
            }
            
            if(!oldcolor.equals(newcolor)){
                b = false;
            }
        }
        
        return newcolor;
    }
}
