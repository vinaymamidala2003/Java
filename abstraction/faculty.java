public class faculty extends person{
    private double salary;
    public faculty(){}
    public faculty(String name,double salary)
    {
        super(name);
        this.salary=salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void display()
    {
        System.out.println("name:"+this.getName()+" salary:"+this.salary);
    }

}