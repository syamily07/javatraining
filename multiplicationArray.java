import java.util.Scanner;
public class multiplicationArray {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.printf("Enter your value: ");
    int mul=scanner.nextInt();
    Integer[][] numB = {{1,2,3,4,5},{6,7,8,9,10}};
    for(int i=0; i<numB.length;i++)
    {
        for(int j=0; j<numB[i].length; j++){
        System.out.printf("%s*%s=%s \n",numB[i][j],mul,numB[i][j]*mul);

    }
  scanner.close();  
} 
    }}
