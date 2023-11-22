import java.util.Scanner;
class dowhile{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner (System.in);
        System.out.printf("Enter a number: ");
        int multiplyby = scanner.nextInt();
        int i=1;
        do{
        System.out.printf("%d * %d= %d \n", i,multiplyby,i*multiplyby);
        i++;}
        while(i<=10);
        
        scanner.close();
    }
}