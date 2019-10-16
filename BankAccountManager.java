
import javax.swing.*;


public class BankAccountManager extends BankAccount {


    public static void main(String [] args) {

        JFrame frame = new JFrame();

        BankAccount customer1 = new BankAccount("Helen Corker", "405", 400);


        JOptionPane.showMessageDialog(frame, customer1, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

}