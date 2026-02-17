package Banking;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
    }

    public boolean hasAccountId() {
        boolean exist = false;
        try {
            File f = new File(super.filename);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String data = read.nextLine();
                    String[] dataArr = data.split(",");
                    if (dataArr[0].equals(this.accId)) {
                        exist = true;
                        this.accBalance = Double.parseDouble(dataArr[1]);
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

    @Override
    public void deposit(double amount) {
        setAccBalance(this.accBalance + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (this.accBalance >= amount) {
            setAccBalance(this.accBalance - amount);
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}