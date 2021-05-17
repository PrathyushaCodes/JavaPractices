public class Trianglenoparamtrs {
    
    int a,b,c;
    public double getArea(){
      double s = (a+b+c)/2.0;
      return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }
    public double getPerimeter(){
      return (a+b+c);
    }
  public static void main(String[] args){
      Trianglenoparamtrs t = new Trianglenoparamtrs();
      t.a = 4;
      t.b = 4;
      t.c = 4;
  
      System.out.println(t.getArea());
      System.out.println(t.getPerimeter());
    } 
}


