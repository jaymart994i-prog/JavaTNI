import javax.swing.JOptionPane;

public class Lab306 {
    public static void main(String[] args) {

        String inputStr = JOptionPane.showInputDialog("Enter an integer number:");

        int n = Integer.parseInt(inputStr);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        String message = "Summation of 1 to " + n + " is " + sum;

        JOptionPane.showMessageDialog(null, message);
    }
}