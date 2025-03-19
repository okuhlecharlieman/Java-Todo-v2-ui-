package classes;

import java.awt.Color;
import java.awt.Dimension;  
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    //constructor
    public TitleBar() {
       this.setPreferredSize(new Dimension(400, 100));
       this.setBackground(Color.DARK_GRAY);
    }

}
