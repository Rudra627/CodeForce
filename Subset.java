public class Subset {
    public static void findSubset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
        }
        //if yes
        findSubset(str, ans+str.charAt(i), i+1);
        // if no
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String abc="abc";
        findSubset(abc,"", 0);
    }
}
