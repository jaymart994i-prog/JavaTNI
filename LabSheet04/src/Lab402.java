import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
        String studentId = "";
        boolean isValid = false;

        while (!isValid) {
            studentId = JOptionPane.showInputDialog(null, "Enter student-id:");


            if (studentId == null) {
                return;
            }


            if (studentId.length() == 10) {
                isValid = true;
            }
        }

        String code = studentId.substring(2, 5);
        String majorName = "";

        if (code.equals("131")) {
            majorName = "Information Technology (IT)";
        } else if (code.equals("132")) {
            majorName = "Multimedia Technology (MT)";
        } else if (code.equals("133")) {
            majorName = "Digital Business Information Technology (BI)";
        } else if (code.equals("134")) {
            majorName = "Digital Technology in Mass Communication (DC)";
        } else if (code.equals("135")) {
            majorName = "Data Science and Data Analytics (DS)";
        } else {
            majorName = "Cannot found major";
        }

        String message = "Student ID: " + studentId + "\nMajor: " + majorName;
        JOptionPane.showMessageDialog(null, message);
    }
}