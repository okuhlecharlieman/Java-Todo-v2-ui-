package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    //constructor
    public TitleBar() {
       this.setPreferredSize(new Dimension(400, 80));
       this.setBackground(Color.DARK_GRAY);
       JLabel titletext = new JLabel("To-Do List");
         titletext.setFont(new Font("Arial", Font.BOLD, 24));
         this.add(titletext); 
    }

}
