package summervacation.Array;

public class Twopointerquestion {
    static int [] sortedsquare(int []arr){
        int n = arr.length;
        int ans [] = new int[n];
        int left =0 , right =n-1;
        int k = 0;
        while(left <= right)
        {
            if (Math.abs(arr[left ])> Math.abs(arr[right])){

                ans[k++] = arr[left] * arr[left];
                left ++;
            } else {
                ans[k++]= arr[right]*arr[right];
                right --;
            } 
        } return ans;
        
    }
    static void swap(int[]arr1 ,int left ,int right ){
        int temp =arr1[left];
       arr1[ right] = arr1[temp];
        arr1[left] = arr1[temp];

    }
    static void sortingevenodd(int[]arr1){
        int n = arr1.length;
        int left =0, right = n-1;
        while (left<right) {
            if (arr1[left] %2== 1 && arr1[right]%2==0 ){
                swap(arr1, left ,right );
                 left ++; 
                 right--;
            }
            if(arr1[left]%2==0){
                left++;
            } if(arr1[right]%2==1){
                right -- ;
            }
        }

    }
    static void sortedarray(int []arr){
        //count no of zeroes;
        int n = arr.length;
        int countofzeroes =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                countofzeroes++;  // TO count the zeroes of the array to sort the array
            }
        }// putting 0 till no of count >> and after that 1 
        for(int i =0; i<n; i++){
            if(i<countofzeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }

    }
    public static void main(String[] args) {
        
    
// sort the array in terms of 0 and 1 :
 /*int []arr ={1,0,1,0,1,0,1,0,1,0}; //Given array
 sortedarray(arr);
    for(int i =0; i<arr.length; i++){
System.out.print( arr[i]);
    }System.out.println(); */

// Given  an array of integer 's move all the even iteger at the beginning and odd at last '
 int[] arr1 = {1,2,3,4,5,6};
sortingevenodd(arr1);
for(int i =0; i<arr1.length; i++){
    System.out.print( arr1[i]+" ");
System.out.println();}
   //Given an array 'a sorted' in non -decreasing order , return an array of the square of each number sorted in non decreasing order
   int [] arr = {-10,-3,-1,1,4,5};
   System.out.print("This is actual array array: ");
   for(int i =0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
   
   }System.out.println();
   int []ans =sortedsquare(arr);
   System.out.print("This is sorted array: ");
   for(int i =0; i<arr.length; i++){
    System.out.print(ans[i]+" ");
   }

   
}}
