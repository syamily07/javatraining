public class votingCheck {
    public static void main(String[] args){
        int age =10;
        String nationality="China";
        boolean checkage=ageChecker(age);
        boolean votingCheck=checkNationality(nationality);
        

        if(checkage && votingCheck){
            System.out.println("You are  eligible for voting");
        }else {
            System.out.println("You are not eligible for voting");
        }   
    }
    public static boolean ageChecker(int age){
        return age>18;
    }  
    public static boolean checkNationality(String inputNationality){
        return inputNationality=="Indian";
    } 
}
