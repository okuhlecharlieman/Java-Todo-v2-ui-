package classes;
import javax.swing.JFrame;

public class AppFrame extends JFrame {
    //Attributes
 private TitleBar titleBar;
    private List list;
    private ButtonPanel buttonPanel;
//Constructor
    public AppFrame() {
      this.setSize(400, 700);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
}
