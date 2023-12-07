import java.util.Scanner;
class whileandif{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner (System.in);
        System.out.printf("Enter a number: ");
        int multiplyBy = scanner.nextInt();
        int i=1;
        while(i<=10){
            if(i % 2==0){
        
        System.out.printf("%d * %d= %d \n", i,multiplyBy,i*multiplyBy);
             } i++;
       
        }



    scanner.close();   
    } 
}