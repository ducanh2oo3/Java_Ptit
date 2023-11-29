import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String msv;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        String tenChuanHoa = "";
        String[] arr = this.ten.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 1) {
                tenChuanHoa += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
            } else if (arr[i].length() == 1) {
                tenChuanHoa += arr[i].toUpperCase() + " ";
            }
        }
        this.ten = tenChuanHoa.trim();
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class danhsachsinhvien1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        sv.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMsv().compareTo(o2.getMsv());
            }
        });

        for (SinhVien s : sv) {
            System.out.println(s);
        }
    }
}