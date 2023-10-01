// //------------------------ ArrayList -------------------//
// import java.util.ArrayList;

// public class arr4 {
//     public static void main(String[] args) {
//         ArrayList<Integer> num = new ArrayList<Integer>();
//         num.add(43); //add
//         num.add(34);
//         int ge = num.get(0); //access

//         int size = num.size(); //size
//         System.out.println(size);
//         System.out.println(ge);
//         //iterating
//         for(int numb:num){
//             System.out.println(numb);
//         }
// System.out.println(" ");
//         //add + index
//         num.add(1, 7);
//         for(int numb:num){
//             System.out.print(numb+" ");
//         }
//         System.out.println(" ");
//         //remove 
//         num.remove(1);
//          for(int numb:num){
//             System.out.print(numb+" ");
//         }
//         //set update 
//         num.set(1, 89);
//         System.out.print(num+" ");

//         //isEMpty()
//         boolean b = num.isEmpty();
//          System.out.print(b+" ");

//          //contains 
//          //indexOf

//          //clear
//          num.clear();
//           System.out.print(num+" ");
//     }
// }

//operations :

// import java.util.ArrayList;
// import java.util.Collections;

// /**
//  * arr4
//  */
// public class arr4 {

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(7);
//          System.out.print(arr+" ");

//          ArrayList<Integer> a2= new ArrayList<>();
//          a2.add(4);
//          boolean modified = a2.addAll(arr);
//          System.out.print(modified+" ");
//          System.out.print(a2+" ");

//          boolean m = a2.removeAll(arr);
//          System.out.print(m+" ");
//          System.out.print(a2+" ");

//          boolean m2 = a2.retainAll(arr);
//          System.out.print(m2+" ");
//          System.out.print(a2+" ");

//         a2.add(1);
//         a2.add(5);
//         a2.add(8);
//         ArrayList<Integer> sub = new ArrayList<>(a2.subList(1, 3));
//         System.out.println(sub);

//         System.out.println(" ");
//         Collections.sort(a2);
//         System.out.print(a2+" ");
//         System.out.println(" ");
//         Collections.shuffle(a2);
//         System.out.print(a2+" ");

//            System.out.println(" ");
//         int s = Collections.max(a2);
//         System.out.print(s+" ");
//     }
// }

// set and its types:

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// /**
//  * arr4
//  */
// public class arr4 {

//     public static void main(String[] args) {
//         Set<String> hash = new HashSet<>();
//         hash.add("dinesh");
//         hash.add("kumar");
//         hash.add("dk");

//         boolean n = hash.contains("dk");
//         System.out.println(n);

//         System.out.println(" ");
//         System.out.println(hash);

//         hash.remove("kumar");
//         System.out.println(hash);

//         //size
//         //clear
//         //iterate

//         Object[] fr = hash.toArray();
//         System.out.println(Arrays.toString(fr));

//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;

// /**
//  * arr4
//  */
// public class arr4 {
//     static ArrayList<Integer> unique(int[] arr, int[] arr2){
//         HashSet<Integer> h = new HashSet<>();
//         HashSet<Integer> h2 = new HashSet<>();
//         ArrayList<Integer> r =new ArrayList<>();

//         // for(int num:arr){
//         //     if(!h.contains(num)){
//         //         h.add(num);
//         //         r.add(num);
//         //     }
//         // }
//         // return r;
//         for(int num:arr){
//             h.add(num);
//         }
//         for(int num:arr2){
//             if(h.contains(num) && !h2.contains(num)){
//                 h2.add(num);
//                 r.add(num);
//             }
//         }
//         return r;
//     }

//     public static void main(String[] args) {
//         int[] arr={3,4,5,5,3,7,8};
//         int[] arr2 = {3,4,5,8};
//         ArrayList<Integer> uq =  unique(arr ,arr2);
//         System.out.println(uq);
//     }
// }

// import java.util.HashSet;

// class HappyNumber {
//     public static boolean isHappy(int n) {
//         HashSet<Integer> seen = new HashSet<>();

//         while (n != 1 && !seen.contains(n)) {
//             seen.add(n);
//             n = getNext(n);
//         }

//         return n == 1;
//     }

//     public static int getNext(int n) {
//         int totalSum = 0;
//         while (n > 0) {
//             int digit = n % 10;
//             totalSum += digit * digit;
//             n /= 10;
//         }
//         System.out.println(totalSum);
//         return totalSum;
//     }

//     public static void main(String[] args) {
//         int num = 19;
//         boolean result = isHappy(num);
//         System.out.println(num + " is a Happy Number: " + result);
//     }
// }

// import java.util.ArrayList;
// import java.util.LinkedHashSet;

// /**
//  * arr4
//  */
// public class arr4 {

//     static ArrayList<Integer> unique(int[] arr){
//         LinkedHashSet<Integer> l = new LinkedHashSet<>();
//         for(int num:arr){
//             l.add(num);
//         }
//         ArrayList<Integer> res = new ArrayList<>();
//         for(int num:l){
//            res.add(num);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//          int[] arr={3,4,5,5,3,7,8};
//         //int[] arr2 = {3,4,5,8};
//         ArrayList<Integer> uq =  unique(arr);
//         System.out.println(uq);
//     }
// }

// HASH MAP :

import java.util.Collection;
// import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * arr4
 */
public class arr4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("dk",99);
        score.put("kd",98);
        score.put("kk",99);
        System.out.println(score);
        int ind = score.get("dk");
        System.out.println(ind);
        //remove
        //containsKey
        //size
        Set<Map.Entry<String,Integer>> entries = score.entrySet();
        System.out.println(entries);
        Set<String> name = score.keySet();
        System.out.println(name);
        Collection<Integer> scoreValues = score.values();
        System.out.println(scoreValues);
    }
}