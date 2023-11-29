import java.util.Scanner;

public class biensodep {

    public static boolean check(String s) {
        // Check if all digits are the same
        char firstChar = s.charAt(0);
        boolean allSame = true;
        for (char c : s.toCharArray()) {
            if (c != firstChar) {
                allSame = false;
                break;
            }
        }
        if (allSame) return true;

        // Check if all digits are in increasing order
        boolean increasing = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i - 1)) {
                increasing = false;
                break;
            }
        }
        if (increasing) return true;

        // Check if the first three digits are the same and the last two digits are the same
        if (s.length() >= 5 && s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) {
            return true;
        }

        // Check if all digits are 6 or 8
        boolean allSixOrEight = true;
        for (char c : s.toCharArray()) {
            if (c != '6' && c != '8') {
                allSixOrEight = false;
                break;
            }
        }
        if (allSixOrEight) return true;

        return false;
    }

    public static void solve(String s) {
        // tach cuoi so ra khoi bien so xe
        String tmp = "";
        for (int i = 5; i < s.length(); i++) {
            tmp += s.charAt(i);
        }
        String tmp2 = "";
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) != '.') {
                tmp2 += tmp.charAt(i);
            }
        }
        // kiem tra xem bien so co dep khong
        if(check(tmp2)) System.out.println("YES");
        else System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
