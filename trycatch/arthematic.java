import java.util.Scanner;
public class arthematic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the value of a");
        int b=sc.nextInt();
        System.out.println("enter the value of b");
        System.out.println("sum is"+(a+b));
        System.out.println("dif is"+(a-b));
        System.out.println("product is"+(a*b));
        System.out.println("division is"+(a/b));
        try{
        System.out.println("div is"+(a/b));
        }
        catch (Exception e) {
            System.out.println("there is an exception");
            
        }

    }
}