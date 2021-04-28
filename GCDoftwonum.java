public class GCDoftwonum {
        public static void main(String[] args) {
            
            int num1 = 44, num2 = 36;
            
                    while (num1 != num2) {
                        if(num1 > num2)
                            num1 = num1 - num2;
                        else
                            num2 = num2 - num1;
                    }
            
                    System.out.println("GCD of given numbers is: " + num2);
                
            
            
        }
    }
          