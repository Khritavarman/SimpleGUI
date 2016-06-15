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
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(formB.getRootPanel());

        formB.getButtonBtoA().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                dispose();
                convertToA(formB);
            }
        });
    }

    public FormB getFormB() {
        return formB;
    }

    public static void convertToA (FormB formB) {
        String[] text = formB.getFio().getText().trim().split("[\\s]+");
        WindowA windowA = new WindowA();
        FormA formA = windowA.getFormA();
        try {
            formA.getSurname().setText(text[0]);
            formA.getName().setText(text[1]);
            formA.getSecondName().setText(text[2]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.printStackTrace();
        }
        windowA.setVisible(true);
    }
}
