import java.util.Scanner;
public class Range {
    public static void main(String[] args)
    {
        System.out.println("enter the Grade");
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        switch(grade)
        {
            case "S":System.out.println("the range is between 90 to 100");
                    break;
            case "A+":System.out.println("the range is bw 80 to 90");
                     break;
            case "A":System.out.println("the range is bw 70 to 80");
                    break;
            case "B+":System.out.println("the range is bw 60 to 70");
                    break;
            case "B":System.out.println("the range is bw 50 to 60");
                    break;
            case "C":System.out.println("the range is bw 40 to 50");
                    break;
            case "F":System.out.println("FAIL");
                     break;
                     default:System.out.println("enter the correct value");   
        }

    }
    
}
