import javax.swing.*;
import java.util.Calendar;

public class Uppg_1_2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Datum och Tid\n" + Calendar.getInstance().getTime().toString(), "Information", JOptionPane.WARNING_MESSAGE);
    }
}