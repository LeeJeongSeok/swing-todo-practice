import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoPanel extends JPanel implements ActionListener {

    JTextArea todoListArea, finishListArea;
    JTextField inputTodo;

    public TodoPanel() {
        initComponent();
        setLayout(new BorderLayout());
        setComponentTitleAndBorder();
        locatedComponent();
    }

    private void initComponent() {
        todoListArea = new JTextArea();
        finishListArea = new JTextArea();
        inputTodo = new JTextField();
    }

    private void setComponentTitleAndBorder() {
        todoListArea.setText("====== Today's To-Do List ======");
        todoListArea.setBorder(new TitledBorder("todoList"));

        finishListArea.setText("====== Today's Finish List ======");
        finishListArea.setBorder(new TitledBorder("finishList"));

        inputTodo.setBorder(new TitledBorder("input todo"));
    }

    private void locatedComponent() {
        add(todoListArea, BorderLayout.WEST);
        add(finishListArea, BorderLayout.CENTER);
        add(inputTodo, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("add todo task!");
    }


}
