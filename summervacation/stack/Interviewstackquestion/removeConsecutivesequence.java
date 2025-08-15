package summervacation.Interviewstackquestion;
import java.util.*;

public class removeConsecutivesequence {
    public static int[] rcsub(int arr[]){
        int n = arr.length; // check l for iteration
        Stack<Integer> st = new Stack<>(); // create new stack to store value with removed sequences
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i])st.push(arr[i]); // st.size()==0[stack empty hone par blind fill kar do] st.peek()!=arr[i] [ iska matlb agar top value n match kre toh direct fill kar do]
            else if(st.peek()==arr[i]){ // agar equal ho toh??
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();// agar last element hai jo barabar hai || arr[1]!=arr[2] then pop arr[1]..
                 
            }
        
            }
            int res[] = new int[st.size()]; // size of this mustt will be equal to stack created size..
            int m = st.size();
            for(int i = m-1; i>=0; i--){
                res[i] = st.pop(); // extract the top and fill in back side  array
                
            
            } return res;


        


    }

        
    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7};
        int removevala[] = rcsub(arr);
        for(int i=0; i<removevala.length; i++){
            System.out.print(removevala[i]+" ");
        }

    }
    
}
