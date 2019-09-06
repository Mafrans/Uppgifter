import javax.swing.*;
import java.util.Calendar;

public class Uppg1_1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Datum och Tid\n" + Calendar.getInstance().getTime().toString());
    }
}
