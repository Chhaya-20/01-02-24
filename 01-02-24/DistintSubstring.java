import java.util.*;

public class DistintSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string ");
        String A = scanner.nextLine();
        char c = A.charAt(0);
        int cnt = 0;
        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) == c) {
                cnt++;
            } else {
                c = A.charAt(i);
            }

        }
        System.out.println(cnt);
        scanner.close();
    }

}
