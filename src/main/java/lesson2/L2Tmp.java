package lesson2;

/**
 * Created by guoyu on 2017/1/10.
 */
public class L2Tmp {
    public static void main(String args[]) {
        int a[] = {100, 200, 300};
        int b[] = {3, 0, 5};

        int[] c = calculate(a, b);
        printArray(c);
    }

    public static int[] calculate(int a[], int b[]) {
        int c[] = new int[3];

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                try {
                    c[i] = a[i] / b[0];
                } catch (Exception e) {
                    c[i] = -1;
                }
            } else {
                try {
                    c[i] = a[i] / b[i + 1];
                } catch (Exception e) {
                    c[i] = -1;
                }
            }
        }

        return c;
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
