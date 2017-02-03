package lesson1;

/**
 * Created by guoyu on 2016/12/26.
 */
public class Lesson1 {
    public static void main(String args[]) {
        double x, y;
        x = 1;
        y = 1.1;
        System.out.println(x + y);

        String s = "1";

        int d;
        d = 1900;
        if (d % 4 == 0 && d % 100 != 0 || d % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        int array[] = {3, 6, 5, 10, 25, 7, 9, 8, 1, 16, 15};
        System.out.println(array[2]);
        //array[2] = 35;
        //System.out.println(array[2]);

        /**
         * 循环
         * */
        int count = 0;
        while (count <= 100) {
            count = count + 1;
        }
        System.out.println("count:" + count);

        for (int i = 0; i < array.length; i = i + 3) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
