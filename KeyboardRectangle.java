public class KeyboardRectangle {
    int length,breadth;
    KeyboardRectangle(int l, int b){
            length = l;
            breadth = b;
    }
    public int setDim(){
    int results = length * breadth;
    return results;
    }
     public void getArea(){
    System.out.println("Area = " +  setDim());
    }
    public static void main(String []args){
    KeyboardRectangle x =new KeyboardRectangle(6,5);
    x.getArea();
        
    }
    }