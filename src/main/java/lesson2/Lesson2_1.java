package lesson2;

/**
 * Created by guoyu on 2017/1/9.
 */
public class Lesson2_1 {
    public static void main(String args[]) {
        int s[] = {11, 0, 3, 4, 5};
        abc(s);
        System.out.println();
        int w = 100;
        System.out.print(ccc(w));
    }

    public static void abc(int b[]) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) {
                System.out.println("000000000000");
                break;
            }


            double d = ccc(b[i]);
            System.out.print(d + " ");
        }
    }

    public static int ccc(int a) {
        int c;
        try {
            c = 100 / a;
        } catch (Exception e) {
            c = -100;
            System.out.println("/ by zero");
        }
        return c;
    }

    public static int ccccc(int a) {
        int c = 100 / a;
        return c;
    }
}
