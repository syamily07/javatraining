class ArrayEg1 {
    public static void main(String[] args){
    Integer[][] regNum = {{1,2,3,4},{5,6,7}};
    int num=5;
    for(int i=0; i<regNum.length;i++){
    
    for (int j=0; j<regNum[i].length;j++){
        System.out.printf("%s*%s=%s",regNum[i][j],num,regNum[i][j]*num);
        System.out.printf("\n");
}
    } 
    }}
    