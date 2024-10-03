package summervacation.Array;

public class mergesort {  
    static void mergetwosubarray(int[]arr,int l, int mid,int r ){
        int n1 = mid-l+1; //left ki boundary hai 
        int n2 = r-mid; // right ki boundary hai
        int firsthalf [] =new int[n1];  // 1 subarray
        int secondhalf[] =new int[n2]; // 2 subarray
        //we have to fill the respective element 
        for(int i=0; i<n1; i++) firsthalf [i]=arr[l+i];
        for(int i=0; i<n2; i++) secondhalf [i]=arr[mid+1+i]; // mid+1 ke baad ka element 
        int j=0;
        int i=0;
        int k=l;//l is the starting index of the subarray being merged.
        while(i<n1 && j<n2){
            if(firsthalf[i]<secondhalf[j]){
                arr[k++] =firsthalf[i++]; // update kar dega array ki value ko 
            }
            else{
                arr[k++]=secondhalf[j++];
            }
        }
        //Baki value ko likhenge 
        while(i<n1)
        arr[k++]=firsthalf[i++];
        while(j<n2)
        arr[k++]=secondhalf[j++];


    }
    static void mergesort(int[]arr, int l, int r){
        if(l>=r)return; //Eska muje nhi pata kaise hua
        //checks whether the subarray is empty by comparing the left index l with the right index r. 
        int mid = (l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        mergetwosubarray(arr ,l,mid,r);
    }
    //Divide and conquer using recursion
    public static void main(String[] args) {
        int []arr={2,1,3,5,4};
        mergesort(arr, 0, arr.length-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
      
}
