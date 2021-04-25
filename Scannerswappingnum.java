import java.util.Scanner;
public class Scannerswappingnum {
    public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int temp;
    System.out.print("Enter the value of a: ");
    int a= in.nextInt();
    System.out.print("Enter the value of b: ");
    int b=in.nextInt();
    System.out.println("Before Swapping, value of a is : " + a + " Value of b is " + b);
    temp=b;
    a=b;
    b=temp;
    System.out.println("After Swapping, value of is a is : " + a + " Value of b is " + b);

    

    }
    
}
