package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    private boolean isExistingAccount(String account_name) {
        boolean exist = false;
        try {
            File f = new File(super.filename);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String data = read.nextLine();
                    String[] dataArr = data.split(",");
                    if (dataArr[0].equals(account_name)) {
                        exist = true;
                        break;
                    }
                }
                read.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exist;
    }

    public String recordAccount() {
        if (isExistingAccount(this.accId)) {
            return "This account has been created!!";
        } else {
            try {
                FileWriter fw = new FileWriter(super.filename, true);
                fw.write(this.toString() + "\n");
                fw.close();
                return "Created account success!!";
            } catch (IOException e) {
                return "Error writing file";
            }
        }
    }
}