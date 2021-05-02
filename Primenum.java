public class Primenum {
        public static void main(String args[]){
            int num=49,n=2,i;
            while (num==0||num==1) {
                System.out.println(num + "is not a prime number");
                break;
            }
            for (i=2;i<=num;i++) {
                if (num%2==0) {
                    System.out.println(num + "is not a prime number");
                    break;
                }
                
                else{
                    if (num%2!=0 && n%i=0 ) {

                        System.out.println(num + "is a prime number");
                        break;
                    }
                   
                }
            } 
        }
}
