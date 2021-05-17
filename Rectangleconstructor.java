public class Rectangleconstructor {
    int length;
    int breadth;
    public Rectangleconstructor(int l, int b){
      length = l;
      breadth = b;
    }
    public int getArea(){
      return length*breadth;
    }
    public int getPerimeter(){
      return 2*(length+breadth);
    }
  }
  
  class Ans{
    public static void main(String[] args){
      Rectangleconstructor a = new Rectangleconstructor(4,5);
      Rectangleconstructor b = new Rectangleconstructor(5,8);
      System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
      System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
    }
  							
}