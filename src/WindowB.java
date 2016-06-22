import javax.swing.*;
import java.awt.event.*;

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
                switchToA(formB);
            }
        });

        Action act = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                switchToA(formB);
            }
        };

        KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, InputEvent.CTRL_MASK);
        formB.getButtonBtoA().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key, "act");
        formB.getButtonBtoA().getActionMap().put("act", act);
    }

    public FormB getFormB() {
        return formB;
    }

    public void switchToA (FormB formB) {
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
        dispose();
    }



    /*      windowA.setFocusable(true);
        formA.getRootPanel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.isControlDown()){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        formA.getSwitch1to2Button().doClick();
                    }
                }
            }
        });

        windowB.setFocusable(true);
        formB.getRootPanel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.isControlDown()){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        formB.getSwitch2to1Button().doClick();
                    }
                }
            }
        });*/
}
