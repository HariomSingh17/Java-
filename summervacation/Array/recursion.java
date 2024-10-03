package summervacation.Array;
// 1.Print 1 to n using recursion 
// 2. Factorial number
// 3. Fabonacci series 
// 4 . count of digit 
// 5 . power of q on p 
//6. print k multiple of n 
// Alternate sum series
//Greatest common divisor .. euclid algo


import java.util.Scanner;

public class recursion {
    static int gcdbyrecur(int x , int y){
        if (y ==0){
            return x;
        }
        return gcdbyrecur(y, x%y); // define by eyclid algo 
    }
    static int gcd1(int x , int y){
        while(x%y!=0){ // x -- divided y -- divisor 
            int rem = x%y; // 24 % 15 = 9 >>rem 
            x = y;
            y = rem;
          } return y;
    }
    static int alternatesum(int n){
        // 1-2+3-4 = -2
        //time complexity >> 
        if (n==1){
            return 1;
        }
        // recursion work 
        if(n%2==0){ // for even 2 , 4 ,6 as we can see that all even  is negative 
          return  alternatesum(n-1)-n; 
        }
        else{ // odd 1 , 3 ,5 
          return  alternatesum(n-1)+n;
        }
    }
    static void number(int n , int x){
        //10 to 15;
        // if(n==x){
        //     System.out.println(n);
        //     return;
        // }
        // // recrsive work
        // System.out.println(n);
        // number(n+1,x);

        // 15 to 10
        if (x==n){
            System.out.println(x);
            return;

        }
        System.out.println(x);
        number(n, x-1);
    }
    static void multiple(int n , int k) // 4 multiple of 5 >> 5 10 15 20

    { // Time complexity >> o(k)
        if(k==1){ // base case 
            System.out.print(n);
            System.out.print(" ");
            return ;
        }
         multiple(n, k-1); // 5*3 5*2 >>.. recursive work ..<<
        System.out.print(n*k +" "); // self work 5*4
       

    }
    static int power(int p , int q){//[5^4]

   // Time complexity >> number of recursive * Time taken >> O(q)

        if (q==0){
            return 1;
        } return power(p, q-1)*p; // (5^3) * (5^2) * (5^1) * (5) 
    }
    static int countofdigits(int n){ //5683 >> 4
        if(n>=0&&n<=9){
            return 1; //Base case 
        } return countofdigits(n/10)+1; // recursive work
        
    }
   static int fabonacciseries(int n){
    // base case 
    if(n==0 || n==1){
        return n;
    }
    int previousnumber = fabonacciseries(n-1); 
    int previouspreviousnumber = fabonacciseries(n-2); 
    int currentvalue = previousnumber+previouspreviousnumber;
    return currentvalue;
   } 
    static int factorialnumber(int n){
        //Base case 
        if (n==0){
            return 1;
        }
        // smaller problem 
        int smallerans =  factorialnumber(n-1);// 4 factorial
        // self work 
        int ans = n*smallerans;
        return ans;

    }
    static void printnaturalnum(int n) {
        if (n == 1) {
            return; // Base case to stop the recursion
        }
        printnaturalnum(n-1); // Recursively call the function with n-1
        System.out.print(n + " "); // Print the current value of n
    }

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number: ");
       // int n = sc.nextInt();
       // printnaturalnum(n); // Call the function with the user input
      // System.out.println(factorialnumber(4));
   //   System.out.println(fabonacciseries(5));
   //System.out.println(countofdigits(5687));
   //System.out.println(power(5, 2));
 //  multiple(5, 4);
 //number(10, 15);
      //  System.out.println(alternatesum(4));
      System.out.println(gcdbyrecur(24, 15));
    }}
