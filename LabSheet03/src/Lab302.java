import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height (cm.):"));

        int Gender_male = JOptionPane.showConfirmDialog(null,
                "Are you biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);

        double male_weight = height - 100;
        double female_weight = height - 110;


        if (Gender_male == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
            "Hello,Mr." + name +
                    "\nIf your height is " + height + " cm." +
                    "\nYour weight should be " + male_weight + " kg." );
        } else {
            int gender_female = JOptionPane.showConfirmDialog(null,
                    "Are you biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);
            if (gender_female == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Hello,Ms." + name +
                                "\nIf your height is " + height + " cm." +
                                "\nYour weight should be " + female_weight + " kg." );

            } else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }

        }

    }
}
