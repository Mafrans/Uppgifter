import javax.swing.*;

public class Uppg2_2 {
    public static void main(String[] args) {
        String name;
        String msg;

        name = JOptionPane.showInputDialog("Vad heter du?");
        msg = "Välkommen, " + name;

        JOptionPane.showMessageDialog(null, msg);
    }
}
