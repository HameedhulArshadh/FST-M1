package activities;

public class BankAccount {
    private Integer balance;

    public BankAccount(Integer initialBalance){
        // Constructor block
        balance = initialBalance;
    }

    public Integer withDraw(Integer amount){
        if (balance < amount){
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }

}
