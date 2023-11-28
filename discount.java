public class discount {
    public static void main(String[] args){
        int amounT=1000;
        double discount= 0.2;
        double discountedPrice = purchase(amounT, discount);
        //double value=0;
        System.out.printf("The amount is %d \n", amounT);
        System.out.printf("The discounted price is %2f", discountedPrice);

        }
    
    public static double purchase(double amounT, double discount){
        if (amounT>5000){
             double value= amounT*discount;
             return amounT-value;
        }
        else
        {
            System.out.printf("You are not eligible for a discount");
        return amounT;}
    }
   
}
