public  class teacher extends person{
    private double salary;
    public teacher(){}
    public teacher(String name,int age,double salary)
    {
        super(name,age);
        this.salary=salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void display()
    {
        System.out.println("the name:"+this.getName()+"age is:"+this.getAge()+"salary:"+this.salary);
    }
}