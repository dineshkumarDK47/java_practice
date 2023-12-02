import java.util.HashSet;
class dk{
    static String duplicates(String str){
        String Str1 = " ";
        HashSet<Character> h = new HashSet<>();
        for(char ch:str.toCharArray()){
            if(!h.contains(ch)){
                h.add(ch);
                Str1+=ch;
            }
        }
        return Str1.toString();
    }
    public static void main(String[] args){
        String str = "geekforgeeks";
        String res = duplicates(str);
        System.out.print(res);
    }
}