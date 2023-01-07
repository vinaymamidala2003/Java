import java.util.Scanner;
 abstract class account{
private int accno;
 private String name;
 private double balance;
 public account(int accno,String name,double balance){
    this.accno=accno;
    this.name=name;
    this.balance=balance;
 }
 public String getName(){
    return this.name;
 }
 public int getAccno(){
    return this.accno;
 }
 public double getBalance(){
    return this.balance;
 }
 

public abstract double withdraw(double amount);
public abstract double deposit(double amount);
}


class savings extends account{
private double amount;
public savings(int accno,String name,double balance,double amount){
    super(accno,name,balance);
    this.amount=amount;
}

double s=getBalance();
public double withdraw(double amount){
    System.out.println("amount withdrawed :" +amount);
    return (s-amount);
}

public double deposit(double amount) {
    System.out.println("amount deposited :" + amount);
    return (s+amount);

}
}

class customer{
    Scanner in = new Scanner(System.in);
    private account ac;
    private String bankname;
    public customer(account ac,String bankname){
        this.bankname=bankname;
        this.ac=ac;
    }
    public void display(){
System.out.println("customer details");
System.out.println("name:"+ac.getName ());
System.out.println("balance :" +ac.getBalance());
System.out.println("account no :" +ac.getAccno());
System.out.println("bank name:" +bankname);

System.out.println("1-deposit , 2 -withdraw");
int choice;
System.out.println("\nenter choice");
 choice=in.nextInt();
 System.out.println("enter amount ");
 double amt=in.nextDouble();
 switch(choice){
case 1: {
    System.out.println(ac.deposit(amt));
}
break;
case 2:{

    System.out.println(ac.withdraw(amt));
}

 }

    }
}

public class newproject {
    public static void main(String args[]){
        Scanner in=new  Scanner (System.in);

        customer c=new customer( new savings(123 , "ravi ",20000 ,500),"sbi");
        c.display();
       
    }
}