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

        formA.getButtonAtoB().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
                convertToA(formA);
            }
        });
    }

    public FormA getFormA() {
        return formA;
    }

    public static void convertToA (FormA formA) {
        String fio = formA.getSurname().getText() +  " " +
                formA.getName().getText() + " " +
                formA.getSecondName().getText();
        WindowB windowB = new WindowB();
        windowB.getFormB().getFio().setText(fio);
        windowB.setVisible(true);
    }
}
