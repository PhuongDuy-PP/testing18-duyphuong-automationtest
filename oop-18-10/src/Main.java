//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        tài khoan ngân hàng
//        saving account
//          + khong duoc rut tien qua so du trong tai khoan
//        checking account
//          + rut toi da 1.000.000vnd
//        Account => class cha
//        saving account => class con
//        checking account => class con
        SavingAccount account1 = new SavingAccount(1_000_000, "An");
//        account1.withdraw(2_000_000);
        account1.withdraw(500_000);
        System.out.println(account1.getBalance());

        CheckingAccount account2 = new CheckingAccount(1_000_000, "Bình");
        account2.withdraw(1_200_000);
    }
}