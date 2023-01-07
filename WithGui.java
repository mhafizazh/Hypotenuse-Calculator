import javax.swing.JOptionPane;

public class WithGui {
    public static void main(String[] args) {

        double X = Double.parseDouble(JOptionPane.showInputDialog("Enter value of x"));

        double Y = Double.parseDouble(JOptionPane.showInputDialog("Enter value of y"));

        double Z = Math.sqrt((X*X)+(Y*Y));

        JOptionPane.showMessageDialog(null, "Hypotenuse is : " + Z);


    }
}
