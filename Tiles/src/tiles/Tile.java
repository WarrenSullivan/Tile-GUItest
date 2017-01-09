package tiles;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Tile extends JPanel implements MouseListener{
    RandomColor RC;
    
    public void mousePressed(MouseEvent e){
        RC = new RandomColor();
        this.setBackground(RC.RC(this));
    }
    
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}
