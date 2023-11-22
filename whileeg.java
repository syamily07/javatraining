import java.util.Scanner;
class whileeg{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner (System.in);
        System.out.printf("Enter a number: ");
        int multiplyby = scanner.nextInt();
 
        //int multiplyby=5;//for(i=0;i<=10;i++)
        int i=1;
        while(i<=10){
        System.out.printf("%d * %d= %d \n", i,multiplyby,i*multiplyby);
        i++;
        }
        scanner.close();
    }
}