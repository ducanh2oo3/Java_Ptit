import java.util.*;

class NhanVien{
    public String ten, chucVu;
    public int lcb, ngayLam, luong, thuong, phuCap, thuNhap;
    public NhanVien(String ten, int lcb, int ngayLam, String chucVu) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.lcb = lcb;
        this.ngayLam = ngayLam;
        this.luong = this.lcb * this.ngayLam;
        if (this.ngayLam < 22)
            this.thuong = 0;
        else if (this.ngayLam < 25)
            this.thuong = this.luong / 10;
        else
            this.thuong = this.luong / 5;
        if (this.chucVu.equals("GD"))
            this.phuCap = 250000;
        else if (this.chucVu.equals("PGD"))
            this.phuCap = 200000;
        else if (this.chucVu.equals("TP"))
            this.phuCap = 180000;
        else
            this.phuCap = 150000;
        this.thuNhap = this.luong + this.phuCap + this.thuong;
    }


    @Override
    public String toString() {
        return "NV01 " + ten + " " + luong + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(a);
        sc.close();
    }
}