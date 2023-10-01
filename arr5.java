// public class arr5 {
//     static void fib(int n){
//         int a=0;
//         int b=1;
//         if(n==0){
//             System.out.println("0 value");
//         }
//         else{
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(a+" ");
//                 int res = a+b;
//                  a = b;
//                  b= res;
//             }
//             System.out.println(" ");
//         }
//     }
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         fib(n);
//     }
// }

/**
 * arr5
 */
// public class arr5 {
//     static String bin(int dec){
//         StringBuilder binary = new StringBuilder();
//         if(dec==0){
//             return "0";
//         }
//         else{
//             while(dec>0){
//                 int rem = dec%2;
//                 binary.insert(0,rem);
//                 dec/=2;
//             }
//         }
//         return binary.toString();
//     }
//     public static void main(String[] args) {
//         int dec = 32;
//         String res = bin(dec);
//         System.out.println(res);
//     }
// }

/**
 * arr5
 */
// public class arr5 {
//     static void arms(int n){
//         int temp = n;
//         int p=0;
//         while(n>0){
//             int rem = n%10;
//             p = p+(rem*rem*rem);
//             n/=10;
//         }
//         if(temp==p){
//             System.out.println("it is arms");
//         }else{
//             System.out.println("its not");
//         }
//     }

//     public static void main(String[] args) {
//         int n=153;
//         arms(n);
//     }
// }

/**
 * arr5
 */
// public class arr5 {

//     static int fib(int n){
//        int um=0;
//        for(um=0;n>0;um+=n%10,n/=10);
//        return um;
//     }
//     public static void main(String[] args) {
//         int n = 4562;
//         int res = fib(n);
//         System.out.println(res);
//     }
// }
/**
 * arr5
 */
// public class arr5 {

//     public static void main(String[] args) {
//         int n=6;
//         int count =0;
//         int i=2;
//         while(count<n){
//             if(isprime(i)){
//                 System.out.println(i+" ");
//                 count++;
//             }
//             i++;
//         }
//     }
//     static boolean isprime(int n){
//         if(n<=1){
//             return false;
//         }
//         if(n==2){
//             return true;
//         }
//         if(n%2==0){
//             return false;
//         }
//         for(int i=3;i<=Math.sqrt(n);i+=2){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

/**
 * arr5
 */
// public class arr5 {
//     static int gcd(int a, int b){
//         if(b==0){
//             return a;
//         }
//         else{
//             return gcd(b,a%b);
//         }
//     }
//     static int lcm(int a,int b){
//         return (a*b)/gcd(a, b);
//     }
//     public static void main(String[] args) {
//         int a=48;
//         int b=18;
//         int res = lcm(a,b);
//         System.out.println(res);
//     }
// }

/**
 * arr5
 */
// public class arr5 {

//     static void reverse(String str){
//         str = str.toLowerCase();
//         String str1="";
//         char ch;
//         for(int i=0;i<str.length();i++){
//             ch = str.charAt(i);
//             str1 = ch + str1;
//         }
//         System.out.println(str1);
//     }
//     public static void main(String[] args) {
//         String str="DineshKumar";
//         reverse(str);
//     }
// }

/**
 * arr5
 */
// public class arr5 {

//     static int avg(int a, int b){
//         return a+b/2;
//     }
//     public static void main(String[] args) {
//         int a = Integer.MAX_VALUE;
//         int b = Integer.MAX_VALUE;
//         int res = avg(a,b);
//         System.out.println(res);
//     }
// }