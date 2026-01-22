import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int t = ob.nextInt();
        String str1 = ob.next();

        StringBuilder str = new StringBuilder(str1);

        for (int i = 0; i < t; i++) {   
            for (int j = 0; j < str.length() - 1; j++) { 
                char ch1 = str.charAt(j);
                char ch2 = str.charAt(j + 1);
                if (ch1 == 'B' && ch2 == 'G') {
                    str.setCharAt(j, ch2);
                    str.setCharAt(j + 1, ch1);
                    j++; 
                }
            }
        }

        System.out.println(str);
    }
}
