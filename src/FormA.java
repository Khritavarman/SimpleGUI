import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class FormA {
    private JTextField textField1;
    private JPanel rootPanel;
    private JButton buttonAtoB;

    public FormA() {
        buttonAtoB.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JButton getButtonAtoB() {
        return buttonAtoB;
    }
}
