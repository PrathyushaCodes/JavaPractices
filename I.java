public class I {

    int i;
    public void printNum()
    {
      System.out.println(i);
    }
  }
  
  class J extends I{
    int j;
    public void printNum()
    {
      System.out.println(j);
    }
  }
  
  class IJ{
    public static void main(String[] args){
      J a = new J();
      a.i = 8;
      a.j = 7;
      a.j = a.i;
      a.printNum();
    }
  }
  