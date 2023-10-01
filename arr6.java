// import java.util.Scanner;

// class word{
//     static boolean checkWord(String word){
//         if(!word.matches("[a-zA-Z0-9]+")){
//             return false;
//         }
//         for(int i=0;i<word.length()-1;i++){
//             if(word.charAt(i)==word.charAt(i+1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner text = new Scanner(System.in);
//         System.out.println("enter a word: ");
//         String word = text.nextLine();

//         boolean isCorrect = checkWord(word);
//         if(isCorrect){
//             System.out.println("The word is correct");
//         }else{
//             System.out.println("word is not correct");
//         }
//         text.close();
//     }
// }

// if (array.length != 100) {
//             return false; // If the array doesn't have 100 elements, it's not valid.
//         }
        
//         boolean[] seen = new boolean[101]; // Initialize a boolean array to track seen numbers.
        
//         for (int num : array) {
//             if (num < 1 || num > 100 || seen[num]) {
//                 return false; // If the number is out of range or seen before, the array is not valid.
//             }
//             seen[num] = true; // Mark the number as seen.
//         }
        
//         return true;

// import java.util.Arrays;
// class sort{
//     public static void sortOE(int[] arr){
//    int[] oddNumbers = Arrays.stream(arr)
//                 .filter(num -> num % 2 != 0)
//                 .sorted()
//                 .toArray();
        
//         int[] evenNumbers = Arrays.stream(arr)
//                 .filter(num -> num % 2 == 0)
//                 .sorted()
//                 .toArray();
//         for (int i = 0; i < oddNumbers.length; i++) {
//             arr[i] = oddNumbers[i];
//         }
//         for (int i = 0; i < evenNumbers.length; i++) {
//             arr[oddNumbers.length + i] = evenNumbers[i];
//         }
// }
//     public static void main(String[] args) {
//         int[] numbers = {56, 67, 24, 3, 88, 17, 55};
//         sortOE(numbers);
//         System.out.println(Arrays.toString(numbers));
//     }
// }

// class othername {
//     public static String findOtherName(String name) {
//         StringBuilder otherName = new StringBuilder();
        
//         for (char c : name.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 char otherChar = (char) ('z' - (c - 'a'));
//                 otherName.append(otherChar);
//             } else if (Character.isUpperCase(c)) {
//                 char otherChar = (char) ('Z' - (c - 'A'));
//                 otherName.append(otherChar);
//             } else {
//                 otherName.append(c);
//             }
//         }
        
//         return otherName.toString();
//     }
//     public static void main(String[] args) {
//         String yourName = "dineshkumar";
        
//         String otherName = findOtherName(yourName);
        
//         System.out.println("Your other name is: " + otherName);
//     }

    
// }


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class intstr {
    public static void main(String[] args) {
        int[] intArr = {2, 34, 1, 45};
        String[] strArr = {"a", "f", "e", "v"}; 

        Map<Integer, String> intToStrMap = new HashMap<>();
        Map<String, Integer> strToIntMap = new HashMap<>();

        
        for (int i = 0; i < intArr.length; i++) {
            intToStrMap.put(intArr[i], strArr[i]);
            strToIntMap.put(strArr[i], intArr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value (integer or string): ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            int intInput = Integer.parseInt(input);
            String correspondingString = intToStrMap.get(intInput);
            if (correspondingString != null) {
                System.out.println("Corresponding string: " + correspondingString);
            } else {
                System.out.println("No corresponding string found for the input integer.");
            }
        } else {
            Integer correspondingInteger = strToIntMap.get(input);
            if (correspondingInteger != null) {
                System.out.println("Corresponding integer: " + correspondingInteger);
            } else {
                System.out.println("No corresponding integer found for the input string.");
            }
        }
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
