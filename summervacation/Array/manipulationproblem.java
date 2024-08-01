package summervacation.Array;

import java.util.Scanner;

public class manipulationproblem {
    // number of Queries is asked wheather it is present or not :
     
    static int[] frequencyarray(int[]arrx){
        int []freq = new int[105];
        for(int i =0; i<arrx.length; i++){
            freq[arrx[i]]++;
        }return freq;
    }
    static void rotatearraybyk(int[]original ,int k){
     //  1 2 3 4 5 6 >> 6 , 5 ,4 ,3 >> 345621   
        int n= original.length;
        k=k%n;
        reverse(original , 0,n-k-1);
        reverse(original ,n-k , n-1);
        reverse(original ,0 , n-1);


         
    }
    static void swapusingtemp(int a, int b){
        System.out.println("a and b before swaping " +a +" and "+ +b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a and b after swaping " +a +" and "+ +b);

    }
    static int[] reversethearray1(int array1[]){

        int j =0;
        int n = array1.length;
        int [] reversarray = new int[n]; // new array initilize 
        for (int i =n-1; i>=0; i--){ // reverse array in opposite direction 
           reversarray[j++] =array1[i];
        }
        return reversarray;

    } static void reverse(int[]original , int i ,int j){
        while(i<j){
            int temp = original[i];
            original[i]=original[j];
            original[j]=temp;
            i++;
            j--;

        }
    }  
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    
    //Array manipulation ?? --Find num which are not get  duplicate :>
int array [] ={1,2,3,4,1,2,3};
int noduplicatenumber=0;

for(int i=0; i<array.length; i++){
for(int j=i+1; j<array.length; j++){
    if(array[i]==array[j]){
        array[i]=-1;
        array[j]=-1;//mark kar rha hu -1 se taki jo num bache mai usko print kara lu fhor se loop chla ke 
    }

}

}
for(int l =0; l<array.length; l++){
if(array[l]>0){
noduplicatenumber=array[l];
}       
    }
    System.out.println("The number which is not get duplicate is "+noduplicatenumber);
//second hoghest number 
    int arr[] ={5,6,7,8,9};
    int mx = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
        if(arr[i]>mx){
            mx=arr[i];

        }
    }
System.out.println(mx); // first highest number 

    for (int i=0; i<arr.length; i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;// first highest ko update karke -infinity kar deye 
        }
    } // from here we can get second highest  number
    int secondhighest=Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
        if(arr[i]>secondhighest){
            secondhighest=arr[i];
        }
    }
System.out.println(secondhighest);

//Swap using temp :
int a =5;
int b=4;
swapusingtemp(a, b);

//reverse the array ::
 int array1[]={1,2,3,4,5};
 int ans []= reversethearray1(array1); 
 // we will store that array in another array in way to iterate it 
 for (int i =0; i<ans.length; i++){
    System.out.print(ans[i] +" ");
 }
 // reversing the rray with method 2::
 int method2[] ={6,7,8,9};
 for(int i =0; i<method2.length; i++){
    System.out.println(method2[i] + " ");
 }
 
// rotate the given array by K step where k is non negative number without using extra space ::
int original[] ={1,2,3,4,5};
Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
rotatearraybyk(original, k);
for(int i =0 ; i<original.length; i++){
    System.out.print(original[i]+" ");
}

// Check numbers if it is present in array or not >>
   int arrx[] ={100 , 2 , 67};
   int[]freq = frequencyarray(arrx);
   System.out.println("Enter the number of queries ");
   int query = sc.nextInt();
   while(query>0){
    System.out.println("Number searched");
    int x = sc.nextInt();
    if (freq[x]>0){
        System.out.println("YES PRESENT");
    }
    else {
    System.out.println("No , it's not present");}
   }

}}

