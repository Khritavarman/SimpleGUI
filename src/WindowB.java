import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class WindowB extends JFrame {

    FormB formB = new FormB();

    public WindowB() {
        super("Window B");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(formB.getRootPanel());
        setVisible(true);

        formB.getButtonBtoA().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                dispose();
                String[] array = formB.getFio().getText().split("[\\s]+");
                FormA formA = new WindowA().getFormA();
                formA.getSurname().setText(array[0]);
                formA.getName().setText(array[1]);
                formA.getSecondName().setText(array[2]);
            }
        });
    }

    public FormB getFormB() {
        return formB;
    }

    public static void convertToA (FormA formA, FormB formB) {
        String[] text = formB.getFio().getText().trim().split("[\\s]+");
        try {
            formA.getSurname().setText(text[0]);
            formA.getName().setText(text[1]);
            formA.getSecondName().setText(text[2]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.printStackTrace();
        }
    }
}
