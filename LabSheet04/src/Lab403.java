import javax.swing.JOptionPane;

public class Lab403 {
    public static void main(String[] args) {

        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "Admin1234";

        boolean isLoginSuccess = false;


        while (!isLoginSuccess) {


            String inputUser = JOptionPane.showInputDialog("Enter username:");
            String inputPass = JOptionPane.showInputDialog("Enter password:");


            if (inputUser == null || inputPass == null) {
                System.exit(0);
            }

            boolean userMatch = inputUser.equalsIgnoreCase(CORRECT_USERNAME);
            boolean passMatch = inputPass.equals(CORRECT_PASSWORD);

            if (userMatch && passMatch) {

                JOptionPane.showMessageDialog(null, "Login Success!!");
                isLoginSuccess = true;
            } else {

                JOptionPane.showMessageDialog(null, "Login Fail...",
                        "Incorrect username or password",
                        JOptionPane.WARNING_MESSAGE);

            }
        }
    }
}