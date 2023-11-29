import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("DANHSACH.in"));
        HashMap<String,Integer> mp=new HashMap<>();
        String s = sc.nextLine();
        s=s.toLowerCase();
        s=s.trim();
        StringBuilder ans=new StringBuilder("");
        String[] a =s.split("\\s+");
        ans.append(a[a.length-1]);
        for(int i=0;i<a.length-1;i++)
        {
            ans.append(a[i].charAt(0));
        }
        if(!mp.containsKey(ans.toString()))
        {
            mp.put(ans.toString(),mp.get(ans.toString())+1);
        }
        else
        {
            mp.put(ans.toString(),mp.get(ans.toString())+1);
            ans.append(String.valueOf(mp.get(ans.toString())));
        }
        ans.append("@ptit.edu.vn");
        System.out.println(ans.toString());
    }
}
