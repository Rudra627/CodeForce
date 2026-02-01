import java.util.*;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = s.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(result);
    }
}