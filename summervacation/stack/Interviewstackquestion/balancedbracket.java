package summervacation.Interviewstackquestion;

import java.util.Scanner;
import java.util.Stack;

public class balancedbracket {
    public static boolean isbracketbalanced(String str){
        Stack<Character> st = new Stack<>();// create stack 
        int n = str.length();
        for(int i =0; i<n; i++){
            char ch = str.charAt(i); // to get char at index i
            if(ch=='('){
                st.push(ch);
            } else{ //')'
                    if(st.size()==0) return false; // case 1
                    if(st.size()!=0) st.pop(); // case 2
        }
        } 
        if(st.size()>0)return false;
        else return true;

    }
    public static int minRemovalsToBalance(String str) {
    int open = 0;     // To count unmatched '('
    int unmatched = 0; // To count unmatched ')'

   
        for (char ch : str.toCharArray()){
            // to get char at index i
            if(ch=='('){
             open++;
            } else if (ch == ')') {
            if (open > 0) {
                open--;       // Match with an open '('
            } else {
                unmatched++;  // No '(' to match with, must remove this ')'
            }
        }
        } 

    return open + unmatched; // Total removals needed
}
public static boolean isvalidleetcode20(String str){
    Stack <Character> st = new Stack<>();
     int n = str.length();
        for(int i =0; i<n; i++){
            char ch = str.charAt(i); // to get char at index i
            if(ch=='(' || ch=='['|| ch=='{'){
                st.push(ch);
            } else{ //')'
                    if(st.size()==0) return false; // case 1
                     char top = st.peek(); // top of stack is been store so it can get compare
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;

        }
        } 
       
    } if(st.size()>0)return false;
        else return true;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        //System.out.println(isbracketbalanced(str));
        int removals = minRemovalsToBalance(str);
        System.out.println("Minimum removals needed: " + removals);
        System.out.println(isvalidleetcode20(str));
    }
    
}
