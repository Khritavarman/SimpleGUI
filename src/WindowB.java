import javax.swing.*;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class WindowB extends JFrame {

    FormB formB = null;

    public WindowB() {
        super("Window B");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formB = new FormB();
        setContentPane(formB.getRootPanel());
        setVisible(true);
    }
}
