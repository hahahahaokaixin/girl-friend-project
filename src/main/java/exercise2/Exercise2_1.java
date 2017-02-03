package exercise2;

/**
 * Created by guoyu on 2017/1/10.
 * <p>
 * 两个数组，{100, 200, 300},{3, 2, 5}
 * 用第一个数组里的第一个数去除以第二个数组里的第二个，
 * 再用第一个里的第二个去除以第二个数组里的第三个，
 * 再用第一个数组里的最后一个去除以第二个数组里的第一个
 * 将计算得到的值放入一个新数组，并输出这个新数组里的每个值
 */
public class Exercise2_1 {

    public static void main(String args[]) {
        int c[] = {100, 200, 300};
        int d[] = {3, 2, 5};

        ccc(c, d);

    }

    public static void aaa(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void ccc(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                try {
                    System.out.print(a[i] / b[0] + " ");
                } catch (Exception e) {
                    System.out.print("fhv");
                }
                break;
            }
            try {
                System.out.print(a[i] / b[i + 1] + " ");
            } catch (Exception e) {
                System.out.print("111");
            }
        }
    }
}


