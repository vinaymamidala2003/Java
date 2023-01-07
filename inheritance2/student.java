public class  student extends person{
    private double fees;
    public student(){}
    public student(String name,int age,double fees)
    {
        super(name,age);
        this.fees=fees;
    }
    public double getFees()
    {
        return this.fees;
    }
    public void display()
    {
        System.out.println("the name is:"+this.getName()+"age:"+this.getAge()+"fees paid:"+this.fees);
    }
}