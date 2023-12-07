public class c {
public int firstInteger;
public int secondInteger;
public int thirdInteger;
public int count;

public averagesub(int firstInteger, int secondInteger, int thirdInteger){
    this.firstInteger=firstInteger;
    this.secondInteger=secondInteger;
    this.thirdInteger=thirdInteger;
}
public int sumValue(){
    return firstInteger+secondInteger+thirdInteger;
}
public int countValue(){
return 3;
}
public int averageValue(){
    int average=sumValue()/countValue();
    return average;

}   
} 
