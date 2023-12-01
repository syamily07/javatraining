public class totalMarks {
    public static void main(String[] args){
        subMarks annaMarks= new subMarks(60);
        subMarks meryMarks= new subMarks(95);
       /// annaMarks.marks=80;
        //meryMarks.marks=50;
        if(annaMarks.getMarks(0)>=90){
            System.out.println( annaMarks.getMarks(0));
        }
            else {
                System.out.println( "Anna scored below 90");
            }
        
        if(meryMarks.getMarks(0)>=90){
            System.out.println( meryMarks.getMarks(0));
        }
        else {
                System.out.println( "Mery scored below 90");
            }

        
    }

    
    
}
