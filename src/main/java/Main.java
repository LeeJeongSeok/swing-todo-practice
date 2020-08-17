import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        JFrame todoFrame = new JFrame();
        todoFrame.setSize(600, 400);
        todoFrame.setDefaultCloseOperation(todoFrame.EXIT_ON_CLOSE);
        todoFrame.setLocationRelativeTo(null);

        JPanel todoPanel = new JPanel(new BorderLayout());

        JTextArea todoListArea = new JTextArea();
        todoListArea.setText("====== Today's To-Do List ======");
        todoListArea.setBorder(new TitledBorder("todoList"));

        JTextArea finishListArea = new JTextArea();
        finishListArea.setText("====== Today's Finish List ======");
        finishListArea.setBorder(new TitledBorder("finishList"));

        JTextField inputTodo = new JTextField();
        inputTodo.setBorder(new TitledBorder("input todo"));

        todoPanel.add(todoListArea, BorderLayout.WEST);
        todoPanel.add(finishListArea, BorderLayout.CENTER);
        todoPanel.add(inputTodo, BorderLayout.SOUTH);


        todoFrame.setContentPane(todoPanel);
        todoFrame.setVisible(true);
    }
}
