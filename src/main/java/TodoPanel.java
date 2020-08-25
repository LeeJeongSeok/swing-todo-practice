import javafx.scene.input.KeyCode;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class TodoPanel extends JPanel implements ActionListener{

    JPanel inputPanel;
    JTextArea todoListArea, finishListArea;
    JTextField todoInputField;
    JButton addTodo, finishTodo;

    ArrayList<String> todoList;

    public TodoPanel() {
        initComponent();
        setLayout(new BorderLayout());
        setComponentTitleAndBorder();
        locatedComponent();
    }

    private void initComponent() {

        inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBorder(new TitledBorder("Input Area"));

        todoListArea = new JTextArea();
        finishListArea = new JTextArea();
        todoInputField = new JTextField();

        addTodo = new JButton("add");
        finishTodo = new JButton("finish");

        todoInputField.setPreferredSize(new Dimension(400, 50));

        addTodo.addActionListener(this);
        finishTodo.addActionListener(this);

        todoList = new ArrayList<String>();

    }


    // TextArea 별 Title 추가
    private void setComponentTitleAndBorder() {
        todoListArea.setText("====== Today's To-Do List ======\n");
        todoListArea.setBorder(new TitledBorder("todoList"));

        finishListArea.setText("====== Today's Finish List ======\n");
        finishListArea.setBorder(new TitledBorder("finishList"));
    }


    // 입력받는 필드와, 버튼에 대한 패널을 따로 만들어서 배치시킴
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

        if (!isEmpty(task)) {
            appendAndSettingText(task, todoListArea);
        }

        todoList.add(task);
    }

    private void finishTask(String task) {

        if (isExist(task)) {
            appendAndSettingText(task, finishListArea);
        }

        deleteTaskFromTodoList(task);
        todoList.remove(task);

    }

    private boolean isExist(String task) {
        return todoList.contains(task);
    }

    private boolean isEmpty(String text) {
        return text.equals("");
    }

    private void appendAndSettingText(String task, JTextArea ListArea) {
        ListArea.append(task + "\n");
        todoInputField.setText("");
    }

    private void deleteTaskFromTodoList(String text) {

        String todoListAreaText = todoListArea.getText();

        if (todoListAreaText.contains(text)) {
            System.out.println("해당 문자열이 있습니다.");
            todoListAreaText = todoListAreaText.replace(text, "");
            todoListArea.setText(todoListAreaText);
        }
    }

}
