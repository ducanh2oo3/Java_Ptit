
import java.util.Scanner;
import java.util.TreeSet;
class IntSet{
    private TreeSet<Integer> set;

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }

    public IntSet(int[] a){
        this.set = new TreeSet<>();
        for(int x:a) set.add(x);
    }
    public IntSet union(IntSet a){
        for(int x:a.set){
            this.set.add(x);
        }
        return new IntSet(this.set);
    }
    @Override
    public String toString(){
        String res = "";
        for(int x:this.set){
            res+=x+" ";
        }
        return res;
    }
}
public class INSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
