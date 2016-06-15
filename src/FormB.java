import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class FormB {
    private JTextField fio;
    private JButton buttonBtoA;
    private JPanel rootPanel;
    private JProgressBar progressBar1;

    public FormB() {
        progressBar1.setMaximum(100);
        progressBar1.setStringPainted(true);
        fio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyReleased(e);
                progressBar1.setValue(fio.getText().length());
                System.out.println(fio.getText().length());
            }
        });
    }

    public JTextField getFio() {
        return fio;
    }

    public JButton getButtonBtoA() {
        return buttonBtoA;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JProgressBar getProgressBar1() {
        return progressBar1;
    }
}
