// program to get last second word :

// class virtusa{
//     static String getword(String words){
//         String w[] = words.split("\\s");
//         String sec = "";
//         for(int i=0;i<w.length;i++){
//             if(i==w.length-2){
//                 sec = w[i];
//             }
//         }
//         return sec;
//     }
//     public static void main(String args[]){
//         String words = "what is your name";
//         String res = getword(words);
//         System.out.println(res);
//     }
// }

// program to insert an element into ascending order list :

/**
 * virtusa
 */
import java.util.*;
public class virtusa {
    static void insertelem(List<Integer> list, int element){
        int index=0;
        while(index<list.size() && list.get(index)<element){
            index++;
        }
        list.add(index,element);
    }

    public static void main(String[] args) {
        List<Integer> asc = new ArrayList<>();
        asc.add(10);
        asc.add(20);
        asc.add(50);

        int element = 35;
        System.out.println(asc);
        insertelem(asc,element);
        System.out.println(asc);

    }
}