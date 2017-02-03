package lesson2;

/**
 * Created by guoyu on 2017/1/3.
 */
public class Lesson2 {
    public static void main(String args[]) {
        /*int[] d = new int[]{1, 2, 3, 4, 5};
        int i;
        for (i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }*/

        int x = 33333, y = 1283;

        double xxx = add(x, y);
        double yyy = abc(xxx);
        boolean zzz = ddd(yyy);
        System.out.println(zzz);


        int s[] = {1, 4, 7, 9, 6, 7, 8, 9, 0};

        int i=7,xx=6,yy=9;
        int zz=cac(i,xx,yy);
        System.out.println(zz);

        int f=7;
        double h=dd(f);
        System.out.println(h);
        //ppp(s);
    }

    public static double add(int a, int b) {
        double c = a + b + 1;
        //System.out.println(a + b + 1);
        return c;
    }

    public static double abc(double c) {
        double r;
        r = c * c;
        return r;
    }

    public static void ppp(int z[]) {
        int i;
        for (i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }

    public static int cac(int a, int b, int c) {
        int d = a * b * c;
        return d;
    }

    public static double dd(int a){
        double d=a*a*a*3.14*4/3;
        return d;
    }


    public static boolean ddd(double a) {
        boolean flag;
        if (a % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }
}
