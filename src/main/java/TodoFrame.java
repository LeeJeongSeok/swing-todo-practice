import javax.swing.*;

public class TodoFrame extends JFrame {

    public TodoFrame() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane(new TodoPanel());
    }
}
