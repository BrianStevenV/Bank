public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("Brian Steven", 745000, 53453453);
        Account acc2 = new Account("Steven Brian", 330000, 733456190);
        Bank bank = new Bank(acc1, acc2);
        System.out.println(bank.transfer(acc1, acc2, 215000));
        bank.printNumberAccounts();

    }
}