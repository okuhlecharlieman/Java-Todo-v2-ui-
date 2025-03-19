package classes;

import java.awt.Color;
import java.awt.Dimension;  
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    //constructor
    public TitleBar() {
       this.setPreferredSize(new Dimension(400, 80));
       this.setBackground(Color.DARK_GRAY);
    }

}
