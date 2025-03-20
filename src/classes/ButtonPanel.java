package classes;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class ButtonPanel extends JPanel{
private JButton addBtn;
private JButton removeBtn;

Border border = BorderFactory.createEmptyBorder();

//constructor
public ButtonPanel() {
this.setPreferredSize(new Dimension(400,60));
this.setBackground(Color.LIGHT_GRAY);
        // Initialize the buttons
        addBtn = new JButton("Add Task");
        addBtn.setBorder(border);
        addBtn.setPreferredSize(new Dimension(200, 50));
        removeBtn = new JButton("Remove Task");
        removeBtn.setBorder(border);
        removeBtn.setPreferredSize(new Dimension(200, 50));
        
        // Add buttons to the panel
        this.add(addBtn);
        this.add(removeBtn);

}

public JButton getAddBtn() {
return addBtn;
}
public JButton getRemoveBtn() {
return removeBtn;}
}
