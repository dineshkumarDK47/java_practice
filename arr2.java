// //min and max value of array

// import java.util.Scanner;

// public class arr2 {
//     public static void findmm(int[] arr){
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//          System.out.println("min and max values are : ");
//         System.out.println("min value is: "+min);

//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("max is: "+max);
//     }
//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.println("enter the values in array");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         findmm(arr);
// sc.close();
//     }
// }

// // copying array :

// import java.util.Arrays;

// public class arr2 {

//     public static void main(String[] args) {
//         int[] ar1 = new int[2];
//         int[] ar2 = new int[2];
//         for(int i=0;i<ar1.length;i++){
//             ar1[i] = i;
//         } 
//         ar2 = Arrays.copyOf(ar1,ar1.length);
//         for(int i=0;i<ar2.length;i++){
//             System.out.print(java.util.Arrays.toString(ar2));
//         }
        
//     }
// }


// //arrays operations :

// import java.util.Arrays;

// /**
//  * arr2
//  */
// public class arr2 {

//     public static void main(String[] args) {
//         int[] arr = {6,7,2,3};
//         Arrays.sort(arr); //sort
//         System.out.println(Arrays.toString(arr));

//         int[] ar = new int[3];
//         Arrays.fill(ar, 0, 3, 3); //fill
//         System.out.println(Arrays.toString(ar));
//         int index = Arrays.binarySearch(arr, 7);
//         System.out.println(index); //binary search
//         boolean res =  Arrays.equals(arr, ar);
//         System.out.println(res); //equals
//     }
// }


// // left rotate in array at index given :

// import java.util.Arrays;

// /**
//  * arr2
//  */
// public class arr2 {
//     public static void LR(int[] arr, int n, int ind){
//         int[] temp = new int[n];
//         int k = 0;
//         for(int i=ind;i<n;i++){
//             temp[k] = arr[i];
//             k++;
//         }
//         for(int i=0;i<ind;i++){
//             temp[k] = arr[i];
//             k++;
//         }
//         for(int i=0;i<temp.length;i++){
//             arr[i] = temp[i];
//         }
       
//     }
//     public static void printarray(int[] arr, int n){
        
//             System.out.print(Arrays.toString(arr));
        
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8};
//         int ind = 3;
//         int n = arr.length;
//         LR(arr,n,ind);
//         printarray(arr,n);
//     }
// }

// //reverse the string 

// import java.util.Arrays;

// /**
//  * arr2
//  */
// public class arr2 {

//     public static String reverse(String s){
//         StringBuilder rev = new StringBuilder(s);
//         return rev.reverse().toString();
//     }
//     public static void main(String[] args) {
//         String text = "DINESHKUMARS";
//         String res = reverse(text);
//         System.out.println(res);
//     }
// }

// // reverse array using recursive 

// import java.util.Arrays;

// /**
//  * arr2
//  */
// public class arr2 {

//      static void reverse(int[] arr,int start, int end){
//         int temp;
//         if(start>=end)
//          return;
//         temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//         reverse(arr, start, end);
//     }
//     static void printarr(int[] arr, int n){
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5,6};
//         int n = arr.length;
//         reverse(arr,0,n-1);
//         printarr(arr,n);
//     }
// }

//merge two arrays and sort:

/**
 * arr2
 */
import java.util.Arrays;
public class arr2 {
    public  void mergearr(int[] arr, int[] arr1, int[] arr2, int n, int n1) {
        int i=0;
        int j=0;
        int k=0;
        while(i<n){
            arr2[k++]=arr[i++];
        }
         while(j<n){
            arr2[k++]=arr1[j++];
        }
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        arr2 a = new arr2();
        int[] arr = {3,6,3,2,5};
        int n = arr.length;
        int[] arr1 = {8,7,6,9,4};
        int n1 = arr1.length;
        int[] arr2 = new int[n+n1];
        a.mergearr(arr,arr1,arr2,n,n1);
        System.out.println(Arrays.toString(arr2));
        }
}