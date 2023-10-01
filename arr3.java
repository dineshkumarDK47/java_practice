// import java.util.Arrays; -- insertion sort with duplicate remove attempt

// public class arr3 {
//     static void ins(int[] arr){
//         for(int i=1;i<arr.length;i++){
//             int key=arr[i];
//             int j=i-1;
//             while(j>=0 && arr[j]>key){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//     }
//     public static int[] duplicate(int[] arr){
        
//         int uniqueindex = 0;
//         int n=arr.length;
//         if(n>=1)
//         return arr;
//         for(int i=1;i<n;i++){
//             if(arr[i]!=arr[uniqueindex]){
                
//                 uniqueindex++;
//                 arr[uniqueindex] = arr[i];
//             }
//         }
//         int[] uniqarr = Arrays.copyOf(arr, uniqueindex+1);
//         return uniqarr;
//     }
//     static void printarr(int[] arr){
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         int[] arr={3,7,5,5,2,1,9,2};
        
//         ins(arr);
//         duplicate(arr);
//         printarr(arr);
//     }
// }


// ------------------------ merge sort -----------------------

// import java.util.Arrays;

// /**
//  * arr3
//  */
// public class arr3 {
//     static void merge(int[] arr){
//         int n=arr.length;
//         if(n<=1){
//             return;
//         }
//         int mid=n/2;
//         int[] left = new int[mid];
//         int[] right = new int[n-mid];
//         System.arraycopy(arr, 0, left, 0, mid);
//         System.arraycopy(arr, mid, right, 0, n-mid);

//         merge(left);
//         merge(right);
//         mergesort(arr,left,right);
//     }
//     static void mergesort(int[] arr,int[] left, int[] right){
//         int lefl = left.length;
//         int refl = right.length;
//         int i=0,j=0,k=0;
//         while(i<lefl&&j<refl){
//             if(left[i]<right[j]){
//                 arr[k] = left[i];
//                 i++;
//             }
//             else{
//                 arr[k] = right[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<lefl){
//             arr[k] = left[i];
//             i++;
//             k++;
//         }
//          while(j<refl){
//             arr[k] = right[j];
//             j++;
//             k++;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,9,4,7,4};
//         merge(arr);
//        System.out.print(Arrays.toString(arr));
//     }
// }

// ----------------------------- selection sort --------------------------//

// import java.util.Arrays;

// /**
//  * arr3
//  */
// public class arr3 {

//     static void selsort(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int minindex = i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[minindex]){
//                     minindex = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[minindex];
//             arr[minindex] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={7,3,8,2,5};
//         selsort(arr);
//         System.out.print(Arrays.toString(arr));
//     }
// }

// ---------- recursive approach - fibonnaci series ---------//

/**
 * arr3
 */
// public class arr3 {
//     static int fibonnaci(int n){
//         if(n<=1){
//             return n;
//         }
//         else{
//             return fibonnaci(n-1)+fibonnaci(n-2);
//         }

//     }

//     public static void main(String[] args) {
//         int n=3;
        
//         for(int i=0;i<=n;i++){
//             int res = fibonnaci(i);
//             System.out.println(res+" ");
//         }
//     }
// }

