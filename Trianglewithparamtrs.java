public class Trianglewithparamtrs {
    int a,b,c;
    public Trianglewithparamtrs(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
      double s = (a+b+c)/2.0;
      return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }
    public double getPerimeter(){
      return (a+b+c);
    }

    public static void main(String[] args){
      Trianglewithparamtrs t = new Trianglewithparamtrs(3,4,5);
      System.out.println("area of triangle is " + t.getArea());
      System.out.println("perimeter of triangle is " + t.getPerimeter());
    }
    
}
