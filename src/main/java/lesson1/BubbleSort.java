package lesson1;

/**
 * Created by guoyu on 2016/12/26.
 */
public class BubbleSort {
    public static void main(String args[]) {
        int a[] = {3, 6, 5, 10, 25, 7, 9, 8, 1, 16, 15};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
                System.out.print("第" + i + "次" + j + "排序 ");
                for (int t = 0; t < a.length; t++) {
                    System.out.print(a[t] + " ");
                }
                System.out.println();
            }
            System.out.print("第" + i + "次排序 ");
            for (int t = 0; t < a.length; t++) {
                System.out.print(a[t] + " ");
            }
            System.out.println();
        }
    }
}
