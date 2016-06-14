import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class WindowA extends JFrame {

    FormA formA = new FormA();

    public WindowA() {
        super("Window A");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(formA.getRootPanel());
        setVisible(true);

        formA.getButtonAtoB().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
                String fio = formA.getSurname().getText() +  " " +
                        formA.getName().getText() + " " +
                        formA.getSecondName().getText();
                new WindowB().getFormB().getFio().setText(fio);
            }
        });
    }

    public FormA getFormA() {
        return formA;
    }
}
