import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class FormA {
    private JTextField surname;
    private JPanel rootPanel;
    private JButton buttonAtoB;
    private JTextField name;
    private JTextField secondName;

    public FormA() {
        buttonAtoB.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });
    }

    public JTextField getSurname() {
        return surname;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JButton getButtonAtoB() {
        return buttonAtoB;
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getSecondName() {
        return secondName;
    }
}
