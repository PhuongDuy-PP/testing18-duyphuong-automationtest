//interface Account {
//    double getBalance();
//    void setBalance(double balance);
//    void withdraw(double amount);
//}

// public class SavingAccount implements Account
// khi ke thua interface => BAT BUOC DEFINE DAY DU CAC FUNCTION
// TRONG INTERFACE


public class SavingAccount extends Account{
    public SavingAccount(double balance, String owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || amount > getBalance())
            throw new IllegalArgumentException("Invalid amount");
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal successful");
    }
}
