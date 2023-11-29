import java.math.BigInteger;
import java.util.*;

public class Kiemtra {
    public static Scanner sc =new Scanner(System.in);
    public static void solve()
    {
        String n = sc.next();
        for(int i=0;i<1000;i++)
        {
            BigInteger a= new BigInteger(n);
            if(a.mod(new BigInteger("13")).equals(new BigInteger("0")))
                break;
            StringBuilder s =new StringBuilder(n);
            s.reverse();
            BigInteger b = new BigInteger(s.toString());
            n=a.add(b).toString();
            if(i==999)
            {
                n="-1";
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int t=1;
        t= Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++)
        {
            solve();
        }
    }
}
