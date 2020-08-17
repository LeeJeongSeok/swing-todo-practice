import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        JFrame todoFrame = new JFrame();
        todoFrame.setSize(500, 300);
        todoFrame.setDefaultCloseOperation(todoFrame.EXIT_ON_CLOSE);




        JPanel todoPanel = new JPanel();


        JTextArea textArea = new JTextArea("test");



        todoFrame.setVisible(true);
    }
}
