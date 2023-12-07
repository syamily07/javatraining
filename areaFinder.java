public class cc {
    public static void main(String[] args){
        areaFindersub rectangleArea= new areaFindersub(2,2);
        areaFindersub squareArea= new areaFindersub(2,2);
        areaFindersub circleArea= new areaFindersub(2,2);
        System.out.printf("The area of rectangle is %s%n",rectangleArea.areaofRectangle());
        System.out.printf("The area of square is %s%n",squareArea.areaofSquare() );
        System.out.printf("The area of circle is %s", circleArea.areaofCircle());
    }
    
}
