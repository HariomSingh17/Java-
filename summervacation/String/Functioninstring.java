package summervacation.String;

public class Functioninstring {
    public static void main(String[] args) {
        
    
  // == in normal but in string have to use s1.equalto(s2)
  String s1 = "Hello";
  String s2 ="Hello";  
  String s3 =new String("Hello");
  System.out.println(s1==s2);// True 
  System.out.println(s1==s3);//False , because it check the address of both string
  System.out.println(s1.equals(s3)); // True 

    }
}
