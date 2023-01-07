public class savings extends account{
    private double amount;
    public savings(){}
    public savings(String name,String accountno,double balance,double amount)
    {
        super(name,accoutno,balance,amount);
        this.amount=amount;
    }
    public double getAmount(){
        return this.amount;
    }
}