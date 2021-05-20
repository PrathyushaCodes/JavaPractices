abstract class Bank1 {

    abstract int getBalance();
    
    }
    
    class BankX extends Bank1 {
    
    private int balance;
    
    void deposit(int money) {
    
    balance += money;
    
    }
    
    @Override
    
    int getBalance() {
    
    return balance;
    
    }
    
    }
    
    class BankY extends Bank1 {
    
    private int balance;
    
    void deposit(int money) {
    
    balance += money;
    
    }
    
    @Override
    
    int getBalance() {
    
    return balance;
    
    }
    
    }
    
    class BankZ extends Bank1 {
    
    private int balance;
    
    void deposit(int money) {
    
    balance += money;
    
    }
    
    @Override
    
    int getBalance() {
    
    return balance;
    
    }
    
    }
    public class AbstractBank {

        public static void main(String[] args) {
        
        BankX bankX = new BankX();
        
        BankY bankY = new BankY();
        
        BankZ bankZ = new BankZ();
        
        bankX. deposit(100);
        
        bankY. deposit(150);
        
        bankZ. deposit(200);
        
       
        System.out.println("Balance of Bank X = $"+X.getBalance());
        
       
        System.out.println("Balance of Bank Y = $"+Y.getBalance());
        
       
        System.out.println("Balance of Bank Z = $"+Z.getBalance());
        
        }
        
        }