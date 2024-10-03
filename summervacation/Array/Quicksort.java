package summervacation.Array;

public class Quicksort {
    //We choose pivot from array and we put this pivot at his right place , and store the index called "pivindex" ...
    // we also make sure that index lesser than pivot index store elements that will lesser than pivot and  index grater  than pivot index store greater element than pivot

    static void swap(int []arr , int x , int y ){
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int []arr, int start , int end){
        int pivot = arr[start];
        int count =0;
        for(int i = start+1; i<end ; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotindex = start+count;
         swap(arr,start,pivotindex); // pivot ko pivotindex par dekhna chahte hai

         int i = start;
         int j = end-1;
         while(i<pivotindex && j>pivotindex){
            while(arr[i]<=pivot)i++;
            while(arr[j]>=pivot)j--;
            if(i<pivotindex && j>pivotindex){
                swap(arr, i, j);
                i++;
                j--;
            }
         }
         return pivotindex;
    } 
    static void quicksort(int [] arr, int start , int end ){
        if(start>=end ) return;
        int pivotindex = partition(arr, start, end);
        quicksort(arr, start, pivotindex-1);
        quicksort(arr, pivotindex+1, end);

    }
    public static void main(String[]args){
int arr[] = {5,4,78 , 564};

quicksort(arr, 0, arr.length);
for(int i : arr){
    System.out.println(i+" ");
}
    }
    
}
