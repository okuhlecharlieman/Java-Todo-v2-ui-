package classes;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;  
import javax.swing.JPanel;
public class List extends JPanel {

    //constructor
    public List() {
        
    GridLayout layout = new GridLayout(10, 1);
    layout.setVgap(10);
         this.setPreferredSize(new Dimension(400, 500));
        this.setBackground(Color.magenta);
        this.setLayout(layout);
    }

}
