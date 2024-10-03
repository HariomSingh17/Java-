package summervacation.Array;

import java.util.Scanner;

public class two_D_part_two { 
    static void findprefixsum(int [][]a){
        int r = a.length;
        int c = a[0].length;
        for(int i=0; i<r; i++){
        for(int j=1; j<c; j++){ // j start with  1 
            a[i][j] += a[i][j-1];
        }}
    }
    static int  findsumofrec(int[][]a , int l1 , int r1 , int l2 , int r2){
        findprefixsum(a);
        int sum =0;
         for (int i =l1; i<=l2; i++){
            sum += a[i][r2]-a[i][r1-1];
         }

return sum ;
    }
    static void spiralarray (int [][]a ,int row, int col ){
        int toprow= 0; int bottomrow = row-1; int left =0; int rightcolumn = col-1;
        int totalelement = 0;
        while(totalelement<row*col)
     {
           // top  row >> left column -- right column 
           for(int i = left; i<=rightcolumn &&totalelement<row*col; i++){
            System.out.print(a[toprow][i]+" ");
              totalelement++;
           }toprow++;
           //right column >> top row -- bottom row 
           for(int j = toprow; j<=bottomrow&&totalelement<row*col; j++){
            System.out.print(a[j][rightcolumn]+" ");
            totalelement++;
           }rightcolumn--;
           // bottom row >> right column -- left column 
           for(int i = rightcolumn; i>=left &&totalelement<row*col; i--){
            System.out.print(a[bottomrow][i]+" ");
            totalelement++;
           }bottomrow--;
           //left column >> bottom -- top 
           for(int i = bottomrow; i>=toprow &&totalelement<row*col; i--){
            System.out.print(a[i][left]+" ");
            totalelement++;
           } left++;
        }
    }
    static int [][] pascal(int n){
        int [][]ans = new int [n][];

        //Jaged array ;;
        for (int i =0; i<n; i++){
            // ith row has i+1 element 
            ans[i]= new int [n+1];
            // first and last element of every row is 1
            ans[i][0] = ans[i][i]=1;
            //logic
            for(int j=1; j<i; j++){
                ans [i][j]= ans[i-1][j]+ans[i-1][j-1];
            } 

        } return ans;
    }
   /*  static int [][]transpose (int[] []a , int r1, int c1){
        int ans [][] =new int [c1][r1];
        for(int i =0; i<c1;i++){
        for(int j =0; j<r1;j++){
             ans[i][j]=a[j][i];       
        }System.out.println();
        } return ans;
    }
  
    static void multiply(int[][]a , int r1 , int c1,int[][]b , int r2 , int c2){
        if(c1 != r2){
            System.out.println("Error");
            return;
        }
        int [][] mul = new int [r1][c2];
        for(int i=0; i<r1; i++ ) { // row
        for(int j=0; j<c2; j++ ) { // column
        for(int k=0; k<c1; k++ ) {
            mul[i][j] += a[i][k] * b[k][j] ;



        }  }}printarray(mul);
    }*/
    static void printarray(int[][]mul)
    {
        for(int i=0; i<mul.length; i++){
        for(int j=0; j<mul[i].length; j++){
            System.out.print(mul[i][j]+",");

        } System.out.println();}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row = sc.nextInt();
         //In pascal triangle we only need row :: 

       // int[][]ans= pascal(r);
        // printarray(ans);
         System.out.println("Enter the columns:");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        System.out.println("Enter " + row * col + " elements:");

         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        } 
        System.out.println("enter the initial range ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("enter the final range ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
       // spiralarray(a, row, col);
        System.out.println("The sum of rectangle is "+ findsumofrec(a, l1, r1, l2, r2));
        
       // System.out.println("This is original matrix ");
        //printarray(a);
        //System.out.println("Transpose matrix");
        //int[][] ans = transpose(a, r1, c1);
        //printarray(ans);
      
       /*  System.out.println("Enter the rows:");
        int r2 = sc.nextInt();
        System.out.println("Enter the columns:");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter " + r1 * c1 + " elements:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
System.out.print("Matrix 1"+": ");
printarray(a);
System.out.println();
System.out.print("matrix 2"+": ");
printarray(b);
System.out.println();
System.out.print("Multiplication");
multiply(a, r1, c1, b, r2, c2); */


    }}
