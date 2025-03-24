package classes;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    //Attributes
 private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;
    private JButton addTask;
    private JButton clear;
//Constructor
    public AppFrame() {
      this.setSize(600, 700);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  

      title = new TitleBar();
      list = new List();
      btnPanel = new ButtonPanel();
      addTask = btnPanel.getAddBtn();
      clear = btnPanel.getRemoveBtn();
      this.add(title, BorderLayout.NORTH);
      this.add(btnPanel, BorderLayout.SOUTH);
      this.add(list, BorderLayout.CENTER);
      this.setVisible(true);

      addListeners();
    }
    private void addListeners() {
      addTask.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          Task task = new Task();
          list.add(task);
          list.updateNumbers();
          task.getDoneBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              task.changeState();
              revalidate();
            }
          });
         revalidate();
        }
      });
      clear.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            list.removeCompletedTasks();
            list.updateNumbers();
            revalidate();
        }
    });
    }
}
