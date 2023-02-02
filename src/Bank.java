public class Bank {
    private Account acc1;
    private Account acc2;

    private double realized;

   private double result;

    public Bank(Account acc1, Account acc2){
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    public double transfer(Account acc1, Account acc2, double value){
        if(this.acc1.getBalanceAccount() - value > 0){
            realized = acc1.setWithdrawl(value);
            System.out.println("El saldo de la primera cuenta es: " + realized);
            result = acc2.setEntry(value);
        } else {
            System.out.println("Error.");
        }
        return result;
    }

    public String printNumberAccounts(){
        String value ="account: " + this.acc1.getNumberAccount() + " and " + this.acc2.getNumberAccount();
        System.out.println(value);
        return value;
    }



}
