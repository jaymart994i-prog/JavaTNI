import javax.swing.*;

public class Lab304 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));

        double height2 = height / 100;
        double height3 = height2 * height2;

        double BMI = weight / height3 ;

        String result;
        if (BMI < 18.5) {
            result = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "Healthy Weight";
        } else if (BMI >= 25 && BMI <= 29.9) {
            result = "Overweight";
        } else {
            result ="Obese";
        }
        JOptionPane.showMessageDialog(null,
                "Your BMI is " + BMI +
                "\nBMI result is " + result);


    }
}
