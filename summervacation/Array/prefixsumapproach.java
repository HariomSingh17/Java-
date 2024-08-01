package summervacation.Array;

import java.util.Scanner;

public class prefixsumapproach {
    static int[] prefixarray(int [] arr3){
        int n = arr3.length;
        int []prefix = new int [n] ;
        prefix[0]= arr3[0];
        for(int i =1; i< arr3.length; i++)
        {
            prefix[i]= prefix[i-1] + arr3[i]; 
// suppose for i =1 ; pre[1] = pref[0]+arr[1] ;> 1+2 > 3 } 
        }return prefix;

    } 
    public static void main(String[] args) {
        //Prefix sum and running sum : 
        // int [] arr = 1 ,2 ,3 , 4 >> int [] prefix summing -> 1,3,6,10 
      //int [] arr = {1,2,4,5,6,7,8,9};
      //System.out.println("This is actual array");
      //for(int i =0; i<arr.length; i++){
        //System.out.print(arr[i]+",");
       //}System.out.println();
      
       /*int []pref =  prefixarray(arr);
       System.out.println("Prefix sum array >>");
       for(int i =0; i<pref.length; i++){
        System.out.print(pref[i]+",");
       }System.out.println();*/

    // 1 based indexing :
    Scanner sc = new Scanner(System.in);//Scanner class >> sc object
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int arr3[]= new int[n+1]; // need to initialize array with some extra space 
    System.out.println("Enter elements ");
    for(int i =1; i<=n; i++){
      arr3[i]=sc.nextInt();
      // find the sum of numbers in given range in array 
    }System.out.println("Enter the number of queries");
int q = sc.nextInt();
int []pref =prefixarray(arr3); // prefix namm ka array return kar rha hai 

    while(q-->0){
 System.out.println("enter the range ");
 int l = sc.nextInt();
 int r= sc.nextInt();
  int ans = pref[r]-pref[l-1]; 
   System.out.println("The sum is "+ ans);
        
    }
    // check wheather array can divided intotwo equal subarray with equal sum"
     int arr [] ={5,3,2,6,3,1};
    
}}
