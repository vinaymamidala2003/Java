public class student extends person
{
    private double marks;
    public student(){}
    public student(String name,double marks)
    {
        super(name);
        this.marks=marks;

    }
    public double getMarks()
    {
        return this.marks;
    }
    public void display()
    {
        System.out.println("Name:"+this.getName()+" marks:"+this.marks);
        
    }
}
