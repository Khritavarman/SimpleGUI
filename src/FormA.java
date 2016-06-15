import javax.swing.*;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class FormA {
    private JTextField surname;
    private JPanel rootPanel;
    private JPanel labelPanel;
    private JPanel textFieldPanel;
    private JPanel buttonPanel;
    private JButton buttonAtoB;
    private JTextField name;
    private JTextField secondName;

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

    public JPanel getLabelPanel() {
        return labelPanel;
    }
}
