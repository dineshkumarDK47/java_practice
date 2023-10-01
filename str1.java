// public class str1 {
//     static void reverse(String str){
//        String str1="";
//         char ch;
//         for(int i=0;i<str.length();i++){
//             ch = str.charAt(i);
//             str1 = ch+str1;
//         }
//         System.out.println(str1);
//     }
//     public static void main(String[] args) {
//         String str = "dinesh is playing chess";
//         reverse(str);
//     }
// }
// public class str1 {
//     static void reverse(String str){
//      String[] ar = str.split(" ");
//      for(int i=ar.length-1;i>=0;i--){
//         System.out.print(ar[i]+" ");
//      }
//     }
//     public static void main(String[] args) {
//         String str = "dinesh is playing chess";
//         reverse(str);
//     }
// }

/**
 * str1
 */
import java.util.HashMap;
import java.util.Map;

public class str1 {
    static String rev(String str) {
        StringBuilder str1 = new StringBuilder();
        Map<Character, Character> vowelToNumberMap = createVowelToNumberMap();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            char replacement = vowelToNumberMap.getOrDefault(Character.toUpperCase(ch), ch);
            str1.append(replacement);
        }

        return str1.toString();
    }

    static Map<Character, Character> createVowelToNumberMap() {
        Map<Character, Character> map = new HashMap<>();
        String vowels = "AEIOU";
        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);
            char reversedNumber = Character.forDigit(9 - i, 10);
            map.put(vowel, reversedNumber);
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "Language";
        String rever = rev(str);
        System.out.println(rever);
    }
}
