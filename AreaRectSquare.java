class AreaRectSquare{


    void area(float x)

    {

        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");

    }

    void area(float x, float y)

    {

        System.out.println("the area of the rectangle is "+x*y+" sq units");

    }



}

class Overload 

{

     public static void main(String args[]) 

    {

       AreaRectSquare ob = new AreaRectSquare();

       ob.area(5);

       ob.area(11,12);

        }

}