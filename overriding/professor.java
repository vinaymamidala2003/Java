public class professor extends univerisity
{
    private double bonus;
    public professor()
    {}
    public professor(String name,double salary,double bonus)
    {
        super(name,salary);
        this.bonus=bonus;
    }
    public double getBonus()
    {
        return this.bonus;
    }
    public void display()
{
    super.display();
    System.out.println("bonus:"+this.bonus);
    

}


}