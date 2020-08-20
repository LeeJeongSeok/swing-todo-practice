import javafx.scene.input.KeyCode;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TodoPanel extends JPanel implements ActionListener{

    JPanel inputPanel;
    JTextArea todoListArea, finishListArea;
    JTextField todoInputField;
    JButton addTodo, finishTodo;

    public TodoPanel() {
        initComponent();
        setLayout(new BorderLayout());
        setComponentTitleAndBorder();
        locatedComponent();
    }

    private void initComponent() {
        todoListArea = new JTextArea();
        finishListArea = new JTextArea();
        todoInputField = new JTextField();
        inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBorder(new TitledBorder("Input Area"));

        addTodo = new JButton("add");
        finishTodo = new JButton("finish");
        todoInputField.setPreferredSize(new Dimension(400, 50));


        addTodo.addActionListener(this);
        finishTodo.addActionListener(this);
    }

    private void setComponentTitleAndBorder() {
        todoListArea.setText("====== Today's To-Do List ======\n");
        todoListArea.setBorder(new TitledBorder("todoList"));

        finishListArea.setText("====== Today's Finish List ======\n");
        finishListArea.setBorder(new TitledBorder("finishList"));
    }

    private void locatedComponent() {
        add(todoListArea, BorderLayout.WEST);
        add(finishListArea, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        inputPanel.add(todoInputField);
        inputPanel.add(addTodo);
        inputPanel.add(finishTodo);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(addTodo)) {
            addTask(todoInputField.getText());
        } else {
            finishTask(todoInputField.getText());
        }
    }

    private void addTask(String task) {
        if (!task.equals("")) {
            todoListArea.append(task + "\n");
            todoInputField.setText("");
        }
    }

    private void finishTask(String task) {
        if (!task.equals("")) {
            finishListArea.append(task + "\n");
            todoInputField.setText("");
        }
    }
}
