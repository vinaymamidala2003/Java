public class univerisity
{
    private String name;
    private double salary;
    public univerisity(){}
    public univerisity(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void display()
    {
        System.out.println("Name is:"+this.name+"and his salary is:"+this.salary);
    }
}