import javax.swing.JOptionPane;

public class Lab401 {
    public static void main(String[] args) {
        String input;
        int Index;

        while (true) {
            input = JOptionPane.showInputDialog("Enter your full name:");

            if (input == null) {
                System.exit(0);
            }

            Index = input.indexOf(" ");


            if (Index > 0 && Index < input.length() - 1) {
                break;
            }

        }

        String firstName = input.substring(0, Index);

        String lastName = input.substring(Index + 1);

        String formattedFirstName = firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1).toLowerCase();

        String formattedLastName = lastName.toUpperCase();

        JOptionPane.showMessageDialog(null, "Welcome, " + formattedFirstName + " " + formattedLastName);
    }
}