import java.util.Scanner;

public class chuanhoaten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            String tenChuanHoa = "";
            for (String x : arr) {
                tenChuanHoa += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            System.out.println(tenChuanHoa.trim());
        }
    }
}
