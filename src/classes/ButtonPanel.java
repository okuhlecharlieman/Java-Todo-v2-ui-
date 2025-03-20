package classes;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
private JButton addBtn;
private JButton removeBtn;
//constructor
public ButtonPanel() {
this.setPreferredSize(new Dimension(400,60));
this.setBackground(Color.LIGHT_GRAY);
        // Initialize the buttons
        addBtn = new JButton("Add Task");
        removeBtn = new JButton("Remove Task");
        
        // Add buttons to the panel
        this.add(addBtn);
        this.add(removeBtn);

}}
