import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class WindowA extends JFrame {

    FormA formA = new FormA();

    public WindowA() {
        super("Window A");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(formA.getRootPanel());

        formA.getButtonAtoB().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchToB(formA);
            }

        });

        Action act = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToB(formA);
            }
        };

        KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, InputEvent.CTRL_MASK);
        formA.getButtonAtoB().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key, "act");
        formA.getButtonAtoB().getActionMap().put("act", act);
    }

    public FormA getFormA() {
        return formA;
    }

    public void switchToB (FormA formA) {
        if (formA.getSurname().getText().isEmpty() || formA.getName().getText().isEmpty()) {
            JOptionPane.showMessageDialog(formA.getRootPanel(),
                    "Type Name and Surname, please",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (formA.getSecondName().getText().isEmpty()){
            int answer = JOptionPane.showConfirmDialog(formA.getRootPanel(),
                    "Second name is empty, do you want to continue?",
                    "Warning",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (answer == JOptionPane.YES_OPTION) {
                String fio = formA.getSurname().getText() +  " " +
                        formA.getName().getText() + " " +
                        formA.getSecondName().getText();
                WindowB windowB = new WindowB();
                FormB formB = windowB.getFormB();
                formB.getFio().setText(fio);
                formB.getProgressBar1().setValue(fio.length());
                windowB.setVisible(true);
                this.dispose();
            }
        } else {
            String fio = formA.getSurname().getText() +  " " +
                    formA.getName().getText() + " " +
                    formA.getSecondName().getText();
            WindowB windowB = new WindowB();
            FormB formB = windowB.getFormB();
            formB.getFio().setText(fio);
            formB.getProgressBar1().setValue(fio.length());
            windowB.setVisible(true);
            this.dispose();
        }
    }
}
