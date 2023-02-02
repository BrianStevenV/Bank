public class Account {
    private double balanceAccount;
    private String holderName;
    private long numberAccount;


    public Account(String holderName, double balanceAccount, long numberAccount){
        this.holderName = holderName;
        this.balanceAccount = balanceAccount;
        this.numberAccount = numberAccount;
    }

    public double setEntry(double entry){
        return balanceAccount += entry;
    }

    public double setWithdrawl(double wthdrawl){
        return balanceAccount -= wthdrawl;
    }

    public double getBalanceAccount(){
        return this.balanceAccount;
    }

    public void getDataAccount(){
        System.out.println("The Owner account: " + this.holderName + " with balance account " +  this.balanceAccount + " with number account " + this.numberAccount);
    }

    public Long getNumberAccount(){
        return this.numberAccount;
    }
}
