package exercise1;

/**
 * Created by guoyu on 2016/12/27.
 * <p>
 * 1.分别输出153的百位、十位、个位。
 * <p>
 * 2.有两个整型变量x,y，将x,y的值互换。
 * <p>
 * 3.学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * <p>
 * 4.打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * <p>
 * 5.把数组 int a[] = {3, 6, 5, 10, 25, 7, 9, 8, 1, 16, 15}; 按从小到大的顺序输出。
 */
public class Exercise1_1 {
    public static void main(String args[]) {
        int x, y, z, b;
        x = 153;
        y = x / 100;
        z = x % 100 / 10;
        b = x % 100 % 10;
        System.out.println(y + "," + z + "," + b);


        int a;
        a = x;
        x = y;
        y = a;
        System.out.println(x + " " + y + " ");


        int e;
        e = 100;
        if (e >= 90) {
            System.out.println("A");
        } else if (60 < e && e < 89) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }


        for (int i = 100; i < 1000; i++) {
            int xx, yy, zz;
            xx = i / 100;
            yy = i % 100 / 10;
            zz = i % 100 % 10;
            if (xx * xx * xx + yy * yy * yy + zz * zz * zz == i && i % 2 != 0) {
                System.out.println(i);
            }
        }


        int array[] = {3, 6, 5, 10, 25, 7, 9, 8, 1, 16, 15};
        for (int f= array.length-1;f>=0;f--){
            System.out.println(array[f]);
        }

    }
}
