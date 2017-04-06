import javax.swing.*;

/**
 * Created by jorel on 5/4/17.
 */
public class InputOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please provide something");
        int result = JOptionPane.showConfirmDialog(null,"Please confirm it");
        JOptionPane.showMessageDialog(null, "hello i got: " + result + " " + input);
    }
}
