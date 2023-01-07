public class employee
{
    private String name;
    private double salary;
    public employee()
    {}
    public employee(String name,double salary)
    {
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
        System.out.println("Name is:"+this.name+ "  salary is:"+this.salary);
    }
}