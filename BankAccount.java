import javax.swing.*;

public class BankAccount extends Person {

    private String accnum;
    private float balance;


public BankAccount() {

}
public BankAccount(String customer, String accnum, float balance){
          super(customer);
          setAccNum(accnum);
          setBalance(balance);


}
public String getAccNum(){
    return this.accnum;
}
public double getBalance(){
    return this.balance;
}


    public void setAccNum(String accnum) {
        this.accnum = accnum;
    }
    public void setBalance(float balance){
      this.balance = balance;
    }

    public String toString(){
    return String.format("Account number: %s\n Balance: €%.2f\n Account Holder: %s\n", getAccNum(),getBalance() ,super.toString());
    }


    }

