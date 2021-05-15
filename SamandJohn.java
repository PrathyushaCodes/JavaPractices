public class SamandJohn {
    
        String nameofstudent;
        int rollnum;
      }
      
      class Studentdetails{
        private String nameofstudent;
        private int rollnum;

        public static void main(String[] args){
          Studentdetails s1 = new Studentdetails();
            s1.nameofstudent="sam";
            s1.rollnum=89;
            System.out.println("Name is "+ s1.nameofstudent+" and roll number is "+s1.rollnum);
          Studentdetails s2= new Studentdetails();
            s2.nameofstudent = "John";
            s2.rollnum = 94;
          System.out.println("Name is " + s2.nameofstudent+ " and roll number is " + s2.rollnum);
        }
      }					
    

