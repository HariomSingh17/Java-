package summervacation.Interviewstackquestion;

import java.util.Stack;

public class largesthoisogram {
    public static int largestrectangle(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int nse [] = new int[n];
        st.push(n-1); // we push index in stack
        nse[n-1]=n; // 6
        for(int i =n-2; i>=0; i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
         if(st.size()==0) nse[i]=n;
         else nse[i]=st.peek();
         st.push (i);  

            }
        while(st.size()>0) st.pop();
        int pse [] =new int[n];
        st.push(0);
        pse[0]=-1; 
        for(int i =1; i<n; i++){
         while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
         if(st.size()==0) pse[i]=-1;
         else pse[i]=st.peek(); 
         st.push(i);  

            }

            // maximum area of rectangle
            int max =-1;
            for(int i=0; i<n ; i++){
                int area = arr[i]*(nse[i]-pse[i]-1);
                 // Lenghth * breadth

                 max = Math.max(max,area);
            }return max;
     
        

    } 
    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};
       System.out.println(largestrectangle(arr)); 
       
    }
}
