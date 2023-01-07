public class manager extends employee
{
    private String sweets;
    public manager(){}
    public manager(String name,double bonus,String sweets)
    {
        super(name,bonus);
        this.sweets=sweets;
    }
    public String getSweets()
    {
        return this.sweets;
    }
    public void display()
    {
        System.out.println("Name is :"+this.getName()+" Salary is:"+this.getSalary()+" sweets:"+this.sweets);
    }
}