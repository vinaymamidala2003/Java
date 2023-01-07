public class Arthematic
{
    public static int add(int x,int y)
    {
        return x+y;
    }
     static float add(float x,float y)
    {
        return x+y;
    }
     static double add(double x,double y)
    {
        return x+y;
    } 
     static String add(String x,String y)
    {
        return x+y;    }

}
public class ArthematicTest
{
    public static void main(String[] args)
    {
        System.out.println(Arthematic.add(10,20));
        System.out.println(Arthematic.add(10.2f,20.3f));
        System.out.println(Arthematic.add(10.0,20.0));
        System.out.println(Arthematic.add("vinay","teja"));
    }
}
