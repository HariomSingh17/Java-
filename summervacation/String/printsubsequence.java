package summervacation.String;

public class printsubsequence {
    public class printsubsequences {
        static void subsequence(String s){
            for(int i =0; i<=3; i++){//a
                for(int j = i+1; j<=4; j++){
                    System.out.print(s.substring(i,j)+" ");
    // a > ab(0-2)
                }
            }
        }public static void main(String[] args) {
            String s = "abcd";
            subsequence(s);
           
        }
    } 
}
