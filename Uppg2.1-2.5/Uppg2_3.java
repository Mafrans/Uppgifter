import javax.swing.*;

public class Uppg2_3 {
    public static void main(String[] args) {
        String name;
        String msg;

        name = JOptionPane.showInputDialog("?");
        msg = "Välkommen, " + name;

        JOptionPane.showMessageDialog(null, msg);
    }
}
