import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class WindowA extends JFrame {

    FormA formA = null;

    public WindowA() {
        super("Window A");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formA = new FormA();
        setContentPane(formA.getRootPanel());
        setVisible(true);

        formA.getButtonAtoB().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setVisible(false);
                new WindowB();
            }
        });
    }
}
