package summervacation;

public class problem_onsorting {
    static void swap(int[]arr,int x ,int y){

        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
// Sarree zeros and ones and two ko Sathe Rakhna hai.. order maintain rhna cheye 
static void problem3(int arr[]){
    int low=0; int mid =0; int high=arr.length-1;
    while(mid<=high){
        if(arr[mid]==0){ //phle 0 rakna hai
            swap(arr,mid,low);
            low++;
            mid++;
        }
   else if(arr[mid]==1){ //then mid me 1 rakna hai
           
            mid++;

        }
        else{ // last me 2 rakna hai
            swap(arr,mid,high);
            high--;
        }
    }
}
//negative element ko phle then positive no order needed
static void Problem2(int arr[]){ // using qicksort vala partition 
    int start =0; int end = arr.length-1;
    while(start<end){
 while(arr[start]<0)start++;
 while (arr[end]>=0) end--;
 if(start<end){
    int temp = arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
 } 
    
 
    }
}
//Problem 1 :> Given an array which are sorted in increasing order except two elemnt ,WAP that sort array in linear amount of time 
static void Problem1(int arr[]){
    int n = arr.length;
    int x =-1;
    int y=-1;
    for(int i =1; i<n ; i++){
        if(arr[i-1]>arr[i]){
            //first conflict
            if(x==-1){
                x=i-1;
                y=i;
            }else{
                y=i; //second conflict
            }
        }
    }
    int temp = arr[x];
    arr[x]=arr[y];
    arr[y]=temp;

}
public static void main(String[] args) {
    int arr[]={3,8,6,7,5,9,10};
    int arr2[] ={-4,-5,6,7,-3};
    int arr3[] ={1,1,2,0,0,1,2,2};
   // Problem1(arr2);
   problem3(arr3);
    for(int val: arr3){
        System.out.print(val+" ");
    }
}
    
}
