import java.util.Scanner;
class marks
{

public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.printf("Enter your marks: ");

int result = scanner.nextInt();
if (result>40)
{
if (result>=40 && result<=60)
{
    System.out.println("You scored GRADE D");
}
    else if (result>=61 && result<=70)
    {
    System.out.println("You scored GRADE C");
}
    else if (result>=71 && result<=80)
    {
    System.out.println("You scored GRADE B");
}
    else if (result>=81 && result<=100)
    {
    System.out.println("You scored GRADE A");

}} else {
     System.out.println("You are failed");
}    
scanner.close();
}}
