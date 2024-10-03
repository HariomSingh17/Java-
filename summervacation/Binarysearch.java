package summervacation;

public class Binarysearch {
// 1. Array must be sorted ...
// P1 > find the minimum element 
//P2> find targeted element in rotated sort array
//P2> find targeted element in rotated sort array but thjere is duplicate element is present
//P3 > find targeted element in 2D array....
// Peak problem .. using mountain array 
// word problem ....
static int targeted(int arr[], int target){
    int start=0; int n = arr.length-1;
    int end = n;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==target){return mid;}
        else if (arr[mid]<arr[end]){// mid to array sorted hai ye theory hai rotated array ki
            if(target>arr[mid]&& target<=arr[end]){
                start= mid+1;

            }
            else{
                end =mid-1;
            }}
        
            else{
                //start to mid sort hoga phir 
                if(target>arr[start]&&target<=arr[mid]){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
    } return -1;
}
static int minimun(int arr[]){
    int start=0; int end =arr.length-1;
  int ans =-1;
    while (start<=end) {  
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[arr.length-1]){//first vale array me hai}
            start=mid+1;
        }
        else if(arr[mid]<=arr[arr.length-1]){
            //second 
            ans=arr[mid];
            end=mid-1;
        }
}return ans;
}
static int firstoccuraence(int arr[], int x){// x is the element which we have to search and return it's first occurence
    int start = 0; int end = arr.length-1;
    int fo =-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==x){
            fo=mid;
            end =mid-1;// hume first index nikalna hai uske leye humme aur andar jana hoga
        }else if (arr[mid]>x){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }return fo;




}
static boolean binarysearch(int arr[], int target){

    int n =arr.length;
    int start =0; int end= n-1;

    while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return true;
        }else if(arr[mid]>target){
            end = mid-1;
        }else{
            start =mid+1;
        }

    } return false;
}
static int duplicateelement (int arr[], int target){
    int start=0; int n = arr.length-1;
    int end = n;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==target){return mid;}
        if(arr[mid]==arr[start]&& arr[mid]==arr[end]){ // it make easy to compare start ,end , mid .. remove the problem that was created 
            start++;
            end--;
        }
        else if (arr[mid]<=arr[end]){// mid to array sorted hai ye theory hai rotated array ki
            if(target>arr[mid]&& target<=arr[end]){
                start= mid+1;

            }
            else{
                end =mid-1;
            }}
        
            else{
                //start to mid sort hoga phir 
                if(target>=arr[start]&&target<=arr[mid]){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
    } return -1;
}
static boolean twoDarraytargeted(int [][]arr, int target){
    int n = arr.length , m = arr[0].length; 
    int start =0, end = (n*m)-1;
    while (start<=end) {
        int mid = start+(end-start)/2;
        int midelement = arr[mid/m][mid%m];//To extract element of mid 
        if(midelement==target)return true;
        if(target<midelement){
            end = mid-1;
        }else{
            start=mid+1;
        }
    }
return false;
}
static boolean matrixtarget(int arr[][], int target){
// {{1,4,7,11,15},{2,5,8,14,19}} it work on such type of 2D array where 2 is not neccesarly should be greater than 15 ..
    int n = arr.length; int m = arr[0].length-1;
    int i =0, j =m;
    while(i<n && j>=0){
        if(arr[i][j]==target){
            return true;
        }
        if(target>arr[i][j]){
            i++;
        }else{
            j--;
        }
    } return false;
}
static int mountainarray(int []arr){ // peak element , peak index
    int start=0; int end = arr.length-1;
    int ans =-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if (arr[mid]<arr[mid+1]){// mountain ke increasing side par hai 
            ans =  arr[mid+1];
        start=mid+1;}
        else{
            // mountain ke decreasing slope par hai arr[mid]>arr[mi+1]
            end = mid-1;

        }
    } return ans;
}
static int upanddownanduphill(int arr[]){
    int start=0; int end = arr.length-1;
   
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
            return mid;
        }
        if (arr[mid]<arr[mid+1]){// mountain ke increasing side par hai 
          
        start=mid+1;}
        else{
            // mountain ke decreasing slope par hai arr[mid]>arr[mi+1]
            end = mid-1;

        }
    } return -1;
}
static int choclatesharing(int[]arr,int noofstudent){
    int start =1; int end = (int)1e9; int ans =0;
    while(start<=end){
        int mid = start+(end-start);
        if(isdivisionpossible(arr,noofstudent,mid)){
            ans =mid;
            end=mid-1;
        }else{
            start =mid+1;
        }
    } return ans;
}
static boolean isdivisionpossible(int arr[] ,int noofstudent,int maxchoclatealloted){
    int students =1;
    int choclate=0; // phle stu ke pass koi choclate nhi hai , cuurent stu ke pass kitna 
    for(int i=0; i<arr.length; i++){ 
        if(arr[i]>maxchoclatealloted)return false;// ek dibbe me max se jyada hai to nhi denge 
        if(choclate+arr[i]<=maxchoclatealloted){ // phle se kuch choclate hai aur kya fhir ye vala dbba bhi le payega student 

            choclate+=arr[i]; // leleya to total choc me add kar denge
        }else{
            students++; // dusre student ko choclate dena suru kre 
            choclate=arr[i]; // initilize karta hu usse utna choclate dekar..
        }
    } if(students>noofstudent){
        return false;
    }
        return true;
    
}
// static int racetrack(int arr[], int kids){
//     int start=0; int end 
// }
public static void main(String[] args) {

    int arr1[][]= {{1,4,7,11,15},{2,5,8,14,19}};
    int arr[]={1,2,3,4,5,3,2,1,0};
    int choclatearray[]={5,6,7,8};
    int m =4; // no of students
    System.out.println(choclatesharing(choclatearray,m));
    int arr2[]={1,2,1,3,2,1,0};
   // System.out.println(firstoccuraence(arr, 2));
//    System.out.println(minimun(arr)); // second array ka first element hoga 
   // System.out.println(duplicateelement(arr, 2));
  //  System.out.println(twoDarraytargeted(arr, 10));
    //System.out.println(matrixtarget(arr, 19));
   // System.out.println(mountainarray(arr2));
    //System.out.println(upanddownanduphill(arr2));
}
}
