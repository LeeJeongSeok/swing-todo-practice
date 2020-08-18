import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        new TodoFrame();

        JPanel todoPanel = new JPanel(new BorderLayout());



        inputTodo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("add todo task");
            }
        });

        todoFrame.setContentPane(todoPanel);
        todoFrame.setVisible(true);
    }
}
