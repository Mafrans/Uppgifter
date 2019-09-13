import javax.swing.*;

public class Uppg2_1 {
    public static void main(String[] args) {
        String msg;
        msg = "Välkommen";

        String append;
        append = msg;
        append = " hit";
        append = msg + " " + System.getProperty("user.name");

        JOptionPane.showMessageDialog(null, append);
    }
}
