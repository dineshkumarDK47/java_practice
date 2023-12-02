// --------------------> insertion sort ----------------------> 
//public class cog {
//     static void ins(int[] arr, int n){
//         for(int i=1;i<n;i++){
//             int key = arr[i];
//             int j=i-1;
//             while(j>=0&&arr[j]>key){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=key;
//         }
//        for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]);
//        }
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,8,6,2,1,5};
//         int n = arr.length;
//         ins(arr,n);
//     }
// }

// --------------------> MERGE SORT <-------------------------------------

// import java.util.Arrays;

// /**
//  * cog
//  */
// public class cog {

//     static void mergearr(int[] arr){
//         int n=arr.length;
//         if(n<=1){
//             return ;
//         }
//         int mid=n/2;
//         int[] left = new int[mid];
//         int[] right = new int[n-mid];
//         System.arraycopy(arr,0,left,0,mid); 
//         System.arraycopy(arr,mid,right,0,n-mid);
//         mergearr(left);
//         mergearr(right);
//         mergesort(arr,left,right);
//     }
//     static void mergesort(int[] arr,int[] left, int[] right){
//         int lef = left.length;
//         int righ = right.length;
//         int i=0;
//         int j=0;
//         int k=0;
//         while(i<lef&&j<righ){
//             if(left[i]<right[j]){
//                 arr[k] = left[i];
//                 i++;
//             }
//             else{
//                 arr[k]=right[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<lef){
//             arr[k] = left[i];
//             i++;
//             k++;
//         }
//         while(j<righ){
//             arr[k] = right[j];
//             j++;
//             k++;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr= {3,9,8,1,8,2,4,0,-2,-7};
//         mergearr(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// --------------------> hashset <-------------------------------

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;

// /**
//  * cog
//  */
// public class cog {

//     static int[] fd(int[] arr){
//         ArrayList<Integer> l = new ArrayList<>();
//         HashSet<Integer> h = new HashSet<>();
//         // for(int i=0;i<arr.length;i++){
//         //     if(h.add(arr[i])){
//         //         l.add(arr[i]);
//         //     }
//         // }
//         for(int num:arr){
//             if(!h.contains(num)){
//                 h.add(num);
//                 l.add(num);
//             }
//         }
//         int[] unque = new int[l.size()];
//         for(int i=0;i<l.size();i++){
//             unque[i]=l.get(i);
//         }
//         return unque;
//     }
//     public static void main(String[] args) {
//         int[] arr={8,6,8,2,3,7,2,8,2,73};
//         int[] unque = fd(arr);
//         System.out.print(Arrays.toString(unque));
//     }
// }

