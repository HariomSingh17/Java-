package summervacation;
//count sort :> In-compare strategy choose karta hai...
//Radix sort :> Digit by digit karte hai aur ye be In-compare strategy choose karta hai...
public class count_bucke_radix {
    static void radixsort(int arr[]){
        int max = findmax(arr);
        for(int place =1;  max/place>0; place*=10){
            countsort2(arr,place );
        }
    }
    static int findmax(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
        
            if(arr[i]>max){
                max = arr[i];
            }
        } return max;
    }
    static void basiccountsort(int []arr){
        int max = findmax(arr);
        int frequency[] = new int [max+1];
        for(int i =0; i<arr.length; i++){ // 2,2,4,4,3
           frequency[arr[i]]++; // initially frequency []={0,0,0,0,0,0} >> [0,0,2,1,2,0]
        } int k =0;
        for(int i =0; i<frequency.length; i++){
           for(int j =0; j<frequency[i]; j++){// es loop se hum ye dekh rhe hai ki f[o,1,2,3] = vo kitni baar hai
            arr[k++]=i;
           }
        }
    }static void countsort2 (int[]arr , int place){
        int n = arr.length;
      
        int frequency[] = new int [10];
        for(int i =0; i<arr.length; i++){ // 20,222,40,455,32
            frequency[(arr[i] / place) % 10]++; // 1st place element 
            // initially frequency []={0,0,0,0,0,0} >> [0,0,2,1,2,0]
            //muje 32 se nhi bas 2 se matlab hai mai sirf 2 ka index bharna chaunge
        }
        //frequency array ka prefix sum array banana hai.. to maintain stability
        for(int i =1; i<frequency.length; i++){
            frequency[i] = frequency[i]+frequency[i-1];
// ye humko help krega current element ki last position batane me ...
        } 
        int output[]=new int [n];
        //original array me transverse karna pdega ..
        for(int i =n-1; i>=0; i--){
            int index = frequency[(arr[i]/place)%10]-1;
            output[index] = arr[i];// current element hai jisko hum original me se intake kar rhe hai...
            frequency[(arr[i]/place)%10]--;
        }
        //copy all elemnt in arr[]
        for(int i =0; i<n; i++){
            arr[i]=output[i];
        }
    }
    static void countsort (int[]arr){
        int n = arr.length;
        int max = findmax(arr);
        int frequency[] = new int [max+1];
        for(int i =0; i<arr.length; i++){ // 2,2,4,4,3
           frequency[arr[i]]++; // initially frequency []={0,0,0,0,0,0} >> [0,0,2,1,2,0]
        }
        //frequency array ka prefix sum array banana hai.. to maintain stability
        for(int i =1; i<frequency.length; i++){
            frequency[i] = frequency[i]+frequency[i-1];
// ye humko help krega current element ki last position batane me ...
        } 
        int output[]=new int [n];
        //original array me transverse karna pdega ..
        for(int i =n-1; i>=0; i--){
            int index = frequency[arr[i]]-1;
            output[index] = arr[i];// current element hai jisko hum original me se intake kar rhe hai...
            frequency[arr[i]]--;
        }
        //copy all elemnt in arr[]
        for(int i =0; i<n; i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int []arr={50,80,70};
      //  basiccountsort(arr);
     // countsort(arr);
         radixsort(arr);
         for(int val: arr){
            System.out.println(val+" ");
         }
      
    }
    
}
