package summervacation.String;

public class Leetcodequestion {
    static void result(String s){
       
    }
  public static void main(String[] args) {
    String s ="aaabbcc";//a3b2c2
    String ans =""+s.charAt(0);
        int count =1;
        for(int i =1; i<s.length(); i++){
            char current = s.charAt(i);
            char previous = s.charAt(i-1);
            if(current==previous){
                count++;
            } else{//a3
         ans += count; //a3
         count=1;//b 1 se start ho gaya
         ans+=current;//a3b
            }  
           
        } ans +=count; // c ki value ko print krane ke leye hai
         System.out.print(ans);
  }
}
