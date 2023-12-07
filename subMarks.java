 class subMarks {
    public int marks;
    //public String Anna;
    //public String Raju;
    public String grade;

        public subMarks(int initialMarks){
            marks=initialMarks;
            
        }
        public int getMarks(int initialMarks){
            return marks; 
        }
        public void actualMarks(int totalMarks){
            int currentMarks= marks + totalMarks;
            marks=currentMarks;
        }

    
}
 