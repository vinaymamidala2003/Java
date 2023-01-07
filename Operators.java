import java.util.Scanner;
public class Operators {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the value of a:");
        float a=sc.nextFloat();
        
        System.out.println("enter the value of b:");
        float b=sc.nextFloat();
        System.out.println("ARTHEMATIC OPERATORS");
        System.out.println("Addition of a&b is " +(a+b));
        System.out.println("subraction of a&b is " +(a-b));
        System.out.println("multiplication of a&b is " +(a*b));
        System.out.println("division of a&b is " +(a/b));
        System.out.println("Remainder of a&b is " +(a%b));
        System.out.println("LOGICAL OPERATORS");
        System.out.println("a>b="+(a>b));
        System.out.println("a<b="+(a<b));
        System.out.println("RELATIONAL OPERATORS");
        System.out.println("a==20&&b==10"+(a==10&&b==20));
        System.out.println("a==20||b==10"+(a==10||b==20));
  }
    }
    

