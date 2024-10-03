package summervacation.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class recursionSTRING {
    // remove 'A' from string
    // reverse the string using recursion
    // print all the subsequence in arraylist . 'abc' =['a','b,'c','ab','ac','bc',abc',' ']
   //Frog problem >>>
   //Given a string containing digit from 2-9 inclusive , return all possible letter combination that the number could represent ; input'23' output [ad , ae, af , bd, be,bf,cd,ce,cf]
   
   static void keypadalgo(String dig,String[] keypad,String result ){ //23
    //Base case 
    if(dig.length()==0){
        System.out.print(result+" ");
        return;
    }
    int currnum = dig.charAt(0)-'0'; // 2 
    String currentchoice = keypad[currnum]; //"abc"
    for(int i =0 ; i<currentchoice.length(); i++){//a,3] b,3] c,3]
        keypadalgo(dig.substring(1), keypad, result+currentchoice.charAt(i));//currentchoice ke current character ko , result me append karte hai

    }

   }
   static int frogjump(int h[], int index){
    if(index == h.length-1){
        return 0;
    }
    int opt1 = frogjump(h, index+1)+Math.abs(h[index]-h[index+1]);// 0-1 vala path choose karke n-1 tak travel krega 
    if(index ==h.length-2){
        return opt1;
    }
    int opt2 = frogjump(h, index+2)+Math.abs(h[index]-h[index+2]);//0-2 vala path se n-1 tak travel krega
    return Math.min(opt1, opt2);
   } 
    static void printssq(String s , String currentans){
        if(s.length()==0){
            System.out.println(currentans);
            return;
        }
        char curr = s.charAt(0);
        String remstring = s.substring(1);
        // when current char choose to be part of currentans
        printssq(remstring, currentans+curr);
        //when current char not choose to be part 
        printssq(remstring, currentans);

    }
    static ArrayList<String> getssq(String s){ // "abc"
        ArrayList<String> ans = new ArrayList<>();
        //Base case 
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        //recursive work
        char current = s.charAt(0);// a
        ArrayList<String> smallans = getssq(s.substring(1)); //"bc"
        for(String ss : smallans){ // self work
            ans.add(ss); // b,bc,c,''
            ans.add(current+ss); // ab,abc,ac,a
        }return ans;
    }
    static String reverse(String s , int index){ // abcd
        //Base case
        if(index==s.length()){
            return " ";
        }//Recursion
        String smallans = reverse(s, index+1); // dcb
        //self work
        return smallans + s.charAt(index); //dcb + a

    }
    static String removeA(String s , int index){
        //Time complexity is O(n^2) because of concanataion
        //Base case 
        if(index==s.length()){
            return " ";
        }
        //recursive work
        String smallans = removeA(s, index+1);

        char current = s.charAt(index);
        //self work

        if(current=='a'){
            return smallans;
        }else{
            return current+smallans;
        }


    }
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  String s = sc.nextLine(); // That allow me to type one line paragraph
        //System.out.println(removeA(s, 0));
       // System.out.println(reverse(s, 0));
    //    ArrayList<String>ans = getssq(s);
    //    for(String ss: ans){
    //     System.out.println(ss);
    //    }
   // System.out.println(getssq(s));
//    printssq(s, "");
// int h[]={5,7,12,15,19};
// System.out.println(frogjump(h, 0));
String s ="23";
String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","wxyz"};
keypadalgo(s, keypad, "");

        
    }
    
}
