import javax.swing.*;
import java.awt.*;

public class checklistGUI extends JFrame {
    JList<String> myList;
    DefaultListModel<String> defaultList;
    JButton addTask, remove;
    JLabel statusLabel;
    String status = "List status is displayed here";
    JTextField task;
    JButton taskAdd;
    JPanel taskManipulation; //panel for task manipulation

    public checklistGUI(String name) {
        super(name);
    }
    checklistGUI() {}

    void initialize() {
        this.setVisible(true); //opening and showing of window
        this.setComponents();
        this.setLayout(null);
        this.setBounds(0,0,500,500); //setting size of window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing of window
    }

    void setComponents() {
        //Creating a default list
        defaultList = new DefaultListModel<String>();
        defaultList.addElement("Item 1");
        defaultList.addElement("Item 2");
        defaultList.addElement("Item 3");
        myList = new JList<String>(defaultList);
        myList.setBounds(8,5,100,50);
        myList.setBackground(Color.YELLOW);
        add(myList);

        //Task handling panel
        taskManipulation = new JPanel(null);
        taskManipulation.setOpaque(true);
        taskManipulation.setBounds(8, 215, 200, 100);
        taskManipulation.setBackground(Color.RED);
            //Adding buttons
            addTask = new JButton("Add");
            addTask.setBounds(0, 0, 90,30);
            taskManipulation.add(addTask);

            remove = new JButton("Remove");
            remove.setBounds(100, 0, 90, 30);
            taskManipulation.add(remove);

            //Adding label
            statusLabel = new JLabel(status);
            statusLabel.setBounds(0, 40, 200, 30);
            taskManipulation.add(statusLabel);
        add(taskManipulation);

        //Creating task adding panel
        task = new JTextField("Quick add");
        taskAdd = new JButton("+");
        task.setBounds(10, 355, 150, 20);
        taskAdd.setBounds(170, 350, 50, 30);
        add(task);
        add(taskAdd);
    }

    public static void main(String[] args) {
        checklistGUI checklist = new checklistGUI("Checklist");
        checklist.initialize();
    }
}