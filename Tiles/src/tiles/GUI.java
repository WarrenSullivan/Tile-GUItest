package tiles;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class GUI{
    public GUI(){
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("Tiles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(16,16));
        
        RandomColor RC = new RandomColor();
        for(int i=0; i<16; i++){
            for(int j=0; j<16; j++){
                Tile MyTile = new Tile();
                MyTile.setBackground(RC.RC(MyTile));
                MyTile.addMouseListener(MyTile);
                frame.add(MyTile);
            }
        }
        
        frame.setVisible(true);
    }
}
