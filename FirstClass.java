import java.util.Scanner;
public class FirstClass {
    public static long bonus;
    public static float deduction;
    public static long Amt;
    public  FirstClass() 
 {
    Scanner scanner=new Scanner(System.in);
    System.out.printf("Enter basic pay: ");
     Amt = scanner.nextInt();
    System.out.printf("Enter deduction amount: ");
     deduction = scanner.nextInt();
    System.out.printf("Enter bonus amount: ");
     bonus = scanner.nextInt();
   scanner.close();
    }
    }
    

    

