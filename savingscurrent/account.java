public class account{
    private String name;
    private String accountno;
    private double balance;
    public account(){}
    public account(String name,String accountno,double balance)
    {
        this.name=name;
        this.accountno=accountno;
        this.balance=balance;

    }
    public String getName()
    {
        return this.name;
    }
    public String getAccountno()
    {
        return this.accountno;
    }
    public double geBalance()
    {
        return this.balance;

    }
    public void display()
    {
        System.out.println("Name is:"+this.name+"Accountno:"+this.accountno+"Balance is:"+this.balance);
    }
}