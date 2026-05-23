public class Permutation {
    public static void permutation(String str,String ans){

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            str=str.substring(0,i)+str.substring(i+1);
            permutation(str, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "");
    }
}
