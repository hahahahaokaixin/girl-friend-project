package cute;

/**
 * Created by User on 2017/2/7.
 * 1.编写一个方法，参数n为偶数时，求1/2+1/4+1/6+...+1/n,当参数n为奇数时，求
 * 1/1+1/3+1/5+...+1/n。
 * 2.自定义一个数组，先输出原数组，再输出这个数组中，每个数的平方。
 * 3.某数组里是四位的整数，需要对其加密，加密规则如下：每位数字都加上5,
 * 然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。 输出加密后的内容。
 */
public class exercise3 {
    public static void main(String args[]) {
        int a = 6;
        aaa(a);

        System.out.println();

        int array[] = {1, 2, 3, 4};
        bbb(array);
        int array2[] = ccc(array);
        bbb(array2);

        System.out.println();

        int b[] = {2, 3, 7, 8};
        int c[] = ddd(b);
        int d[] = ggg(c);
        bbb(d);

        System.out.println();

        int e[] = {2, 3, 7, 8};
        bbb(ggg(ddd(e)));

    }

    public static void aaa(int n) {
        if (n % 2 == 0) {
            double y = 1 * 1.0 / 2 * 1;
            for (int a = 2; a < n / 2; a = a + 2) {
                y = y + 1 * 1.0 / 2 * a;
            }
            System.out.print(y);
        } else {
            double x = 1 / 1 * 1;
            for (int j = 1; j < (n + 1) / 2; j = j + 2) {
                x = x + 1 * 1.0 / j * 1;
            }
            System.out.print(x);
        }
    }

    public static void bbb(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }


    public static int[] ccc(int a[]) {

        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
        }

        //System.out.print(b);
        return b;
    }

    public static int[] ddd(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (a[i] + 5) % 10;
        }
        return b;
    }

    public static int[] ggg(int a[]) {
        int temp = a[0];
        a[0] = a[3];
        a[3] = temp;

        temp = a[1];
        a[1] = a[2];
        a[2] = temp;

       return a;
    }


    public static  int[] ee(int a[]) {
        int temp=a[0];
        a[0]=a[3];
        a[3]=temp;
        temp=a[1];
        a[1]=a[2];
        a[2]=temp;
        return a;
    }


}


