public class Armstrongnumber {
    public static void main(String[] args)  {  
        int c=0,a,temp;  
        int n=22;//It is the number to check armstrong  
        temp=n;  
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
        }  
        if(temp==c)  
        System.out.println("It is an armstrong number");   
        else  
            System.out.println("It is not an armstrong number");   
    }  
}
