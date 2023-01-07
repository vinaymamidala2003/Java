import java.util.Scanner;
public class Grade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the marks :");
        int a=sc.nextInt();
        if(90<a&&100>=a)
        {
            System.out.println("The grade is:S");
        }
        else if(80<a&&90>=a)
        {
            System.out.println("The grade is:A+");
        }
        else if(70<a&&80>=a)
        {
            System.out.println("The grade is:A");
        }
        else if(60<a&&70>=a)
        {
            System.out.println("The grade is:B+");
        }
        else if(50<a&&60>=a)
        {
            System.out.println("The grade is:B");
        }
        else if(40<a&&50>=a)
        {
            System.out.println("The grade is:C+");
        }
        else
        {
            System.out.println("The grade is:FAIL");
        }
    }
    
}
