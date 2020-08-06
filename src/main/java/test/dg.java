package test;

public class dg {



    public static void main(String[] args) {
        dg d = new dg();
       int x= d.dg(5);
        System.out.println(x);
    }

    public int dg(int n) {
        if (n == 1) {
            return n;
        }
        return n * dg(n - 1);
    }
}
