import java.util.*;

public class SimilarString {

    static boolean similar(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() % 2 != 0 || str2.length() % 2 != 0) {
            return false;
        }

        int n = str1.length();
        String A1 = str1.substring(0, n / 2);
        String A2 = str1.substring(n / 2);
        String B1 = str2.substring(0, n / 2);
        String B2 = str2.substring(n / 2);

        return ((similar(A1, B1) && similar(A2, B2)) || (similar(A1, B2) && similar(A2, B1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String A : ");
        String A = sc.nextLine();
        System.out.print("Enter String B : ");
        String B = sc.nextLine();

        System.out.print("Strings are equal : " + similar(A, B));
        sc.close();

    }
}