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
                switchToB(formA);
            }
        });
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
                windowB.getFormB().getFio().setText(fio);
                windowB.setVisible(true);
                this.dispose();
            }
        } else {
            String fio = formA.getSurname().getText() +  " " +
                    formA.getName().getText() + " " +
                    formA.getSecondName().getText();
            WindowB windowB = new WindowB();
            windowB.getFormB().getFio().setText(fio);
            windowB.setVisible(true);
            this.dispose();
        }
    }
}
