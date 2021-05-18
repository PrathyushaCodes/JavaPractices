public class DisplayOverloading {
    

   public void disp(char c, int num)
   {
       System.out.println("I’m the definition of first method disp");
   }
   public void disp(int num, char c)
   {
       System.out.println("I’m the definition of second method disp" );
   }
}
class Sample
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('x', 51 );
       obj.disp(52, 'y');
   }
}