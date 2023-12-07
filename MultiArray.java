public class MultiArray {
    public static void main(String[] args) {
        //Integer[][] regNum = new Integer[5][4];

        Integer[][] regNum = new Integer[5][5];
        for(int i=0; i < regNum.length; i++){
        for(int j=0; j < regNum[i].length; j++){
          regNum[i][j] = (i+1) * (j+1);  
        }
        }
        System.out.println("Multidimensional Array eg:");
        for(int i = 0; i < regNum.length; i++){
        for(int j = 0; j < regNum[i].length; j++){
        System.out.printf("%4d", regNum[i][j]);
        }
        System.err.println("");
        }
    }
    
}