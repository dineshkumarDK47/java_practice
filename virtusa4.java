// palindrome or not
public class virtusa4 {
    public static int palin(String word){
        int length1 = word.length();
        for(int i=0;i<length1;i++){
            for(int j=length1-1;j>=0;j--){
                if(word.charAt(i)!=word.charAt(j)){
                return 0;
            }
            }
            
        }
        return 1;
    }
    public static void main(String[] args) {
        String pali = "abbab";
        int res = palin(pali);
        if(res==1){
            System.out.println("its pan");
        }else{
            System.out.println("its not");
        }
    }
}

