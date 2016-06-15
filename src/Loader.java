import javax.swing.*;

/**
 * Created by Kostyan on 14.06.2016.
 */
public class Loader {
    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        WindowA windowA = new WindowA();
        windowA.setVisible(true);
    }
}
