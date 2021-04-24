import java.util.Scanner;
class ScannerLargestofThree {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=in.nextInt();
        System.out.println("Enter second number: ");
        int b=in.nextInt();
        System.out.println("Enter third number: ");
        int c=in.nextInt();
        int g = Math.max(a, b);
        g = Math.max(g, c);
        
        System.out.println("Greatest Number = " + g);


    }
    
}





