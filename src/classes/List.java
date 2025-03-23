package classes;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
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
    public void updateNumbers() {
        Component[] listItems = this.getComponents();
        for (int i = 0; i < listItems.length; i++) {
         if(listItems[i] instanceof Task) {
            ((Task) listItems[i]).changeIndex(i + 1);
         }
        }
    }

}
