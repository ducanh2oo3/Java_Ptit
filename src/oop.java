import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.*;
public class oop {
    public static boolean nt(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        Set<Integer> se1=new TreeSet<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1=(ArrayList<Integer>)sc.readObject();
        for(int x:a1)
        {
            if(nt(x)&&String.valueOf(x).length()>=3) se1.add(x);
        }
        for(int x:se1) System.out.println(x);
    }
}
