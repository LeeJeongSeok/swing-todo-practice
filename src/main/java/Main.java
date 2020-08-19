import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

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
