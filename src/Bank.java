public class Bank {
    Account acc1;
    Account acc2;

    double realized;

    double result;

    public Bank(Account acc1, Account acc2){
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    public double transfer(Account acc1, Account acc2, double value){
        if(this.acc1.balanceAccount - value > 0){
            realized = acc1.setWithdrawl(value);
            System.out.println("El saldo de la primera cuenta es: " + realized);
            result = acc2.setEntry(value);
            /*realized = this.acc1.balanceAccount - value;*/
        } else {
            System.out.println("Error.");
        }
        return result;
    }

    public void printNumberAccounts(){
        System.out.println("The accounts has number: " + this.acc1.numberAccount + " and " + this.acc2.numberAccount);
    }
}
