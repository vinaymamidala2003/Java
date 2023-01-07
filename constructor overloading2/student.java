public class student
{
private String name;
      private int age;
    private  String branch;
     private double passout;
    public student(String name,int passout)
    {
        this.name=name;
        this.passout=passout;
    }
    public String getName(){
        return this.name;
    }
    public double getPassOut(){
        return this.passout;
    }
    
    public student(int age,String branch)
    {

        this.age=age;
        this.branch=branch;
    }
    public int getAge(){
        return this.age;
    }
    public String getbranch(){
        return this.branch;
    }
}