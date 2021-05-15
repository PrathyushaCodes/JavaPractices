public class e {
    public static void main(String args[]){  
         int r,sum=0,temp;    
         int n=123;//It is the number variable to be checked for e  
         
         temp=n;    
         while(n>0){    
          r=n%10;  //getting remainder  
          sum=(sum*10)+r;    
          n=n/10;    
         }    
         if(temp==sum)    
          System.out.println(" given number is a e number ");    
         else    
          System.out.println("given number is not e number");    
       }  
        
}
