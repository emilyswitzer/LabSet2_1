
import javax.swing.*;


public class ModifiedBankAccount extends BankAccount {

    private float withdraw;
    private float lodge;


    public ModifiedBankAccount() {

    }
    public ModifiedBankAccount(String customer, String accnum, float balance, float withdraw, float lodge){
        super(accnum, customer, balance);
        setAccNum(accnum);
        setBalance(balance);


    }
    public float getLodgeBalance(){
        return this.lodge;
    }
    public float getWithdrawBalance(){
        return this.withdraw;
    }


    public void setLodgeBalance(float lodge) {

        lodge = getBalance() - lodge;
        this.lodge = lodge;
    }
    public void setwithdrawBalance(float withdraw){
        lodge = getBalance() - withdraw;

        this.lodge = lodge;
    }




}