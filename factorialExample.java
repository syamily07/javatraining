import java.util.Scanner;

class factorialExample {
    public static void main(String[] args) {
        int fact=1;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = Scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            fact=fact*i;
            }
        System.out.printf("The factorial is: %s",fact );
        Scanner.close();
    }

}
