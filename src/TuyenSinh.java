import java.util.Scanner;
class ThiSinh{
    private String maThiSinh,hoTen;
    private double diemToan,diemLy,diemHoa;
    double diemuutien,tongdiem;
    double diemxetTuyen;
    String trangthai;
    String ma;

    public ThiSinh(String maThiSinh,String hoTen,double diemToan,double diemLy,double diemHoa){
        this.maThiSinh=maThiSinh;
        this.hoTen=hoTen;
        this.diemToan=diemToan;
        this.diemLy=diemLy;
        this.diemHoa=diemHoa;
        if(this.maThiSinh.charAt(2)=='1')
        {
            this.diemuutien=0.5;
        }
        else if(this.maThiSinh.charAt(2)=='2')
        {
            this.diemuutien=1;
        }
        else if(this.maThiSinh.charAt(2)=='3')
        {
            this.diemuutien=2.5;
        }

        this.tongdiem = this.diemToan*2+this.diemLy+this.diemHoa;
        this.diemxetTuyen=this.tongdiem+this.diemuutien;
        if(this.diemxetTuyen>=24)
        {
            this.trangthai="TRUNG TUYEN";
        }
        else this.trangthai="TRUOT";
    }
    public String getdiemuutien() {
        if (this.diemuutien == (int) this.diemuutien)
            return Integer.toString((int) this.diemuutien);
        return Double.toString(this.diemuutien);
    }
    public String gettongdiem() {
        if (this.tongdiem == (int) this.tongdiem)
            return Integer.toString((int) this.tongdiem);
        return Double.toString(this.tongdiem);
    }
    @Override
    public String toString() {
        return this.maThiSinh+" "+this.hoTen+" "+getdiemuutien()+" "+gettongdiem()+" "+this.trangthai;
    }
}
public class TuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a =new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        System.out.println(a);

    }
}
