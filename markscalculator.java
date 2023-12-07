 class markscalculator {
    public int sub1;
    public int sub2;
    public int sub3;
    public  markscalculator( ){
        System.out.printf("Hi");
    }

    public  markscalculator(int sub1, int sub2, int sub3 ){
        this.sub1= sub1;
        this.sub2= sub2;
        this.sub3= sub3;
    }
    public int gettotalMarks(){
    return sub1+sub2+sub3;
    }
    public  String gradecalculated(){
        int totalMarks=gettotalMarks();
    if ((totalMarks>=90) && (totalMarks<=100))
   {
      return "A"; 
   }
   else if ((totalMarks>=80) && (totalMarks<=90))
   {
      return "B";
   }
   else if ((totalMarks>=70) && (totalMarks<=80))
   {
      return "C";
   }
   else if ((totalMarks>=60) && (totalMarks<=70))
   {
      return "D";
   }
   return "Name not applicable for this grade range";
} 
  
}


 
    

