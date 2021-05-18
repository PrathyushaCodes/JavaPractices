import java.util.*;
public class RectangleAreaconstruct {
    
  int length;
  int breadth;
  public RectangleAreaconstruct(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
}

class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    RectangleAreaconstruct a = new RectangleAreaconstruct(l,b);
    System.out.println("Area : "+a.getArea());
  }
}								