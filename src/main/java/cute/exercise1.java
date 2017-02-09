package cute;

/**
 * Created by User on 2017/1/26.
 * 1.有一个函数，y=x?+2(x+1)+3，计算当x=3时y的值。
 * 2.有两个字符串数组，第一个里是yu和nancy，第二个里是guo和wang，通过这两个数组输出yu.guo和nancy.wang。
 * 3.有一个数组，计算5除以这个数组里的每一个数之后的值。
 */
public class exercise1 {
    public static void main(String args[]) {
        int x = 3;
        int y = x * x + 2 * (x + 1) + 3;
        System.out.print(y);

        String a[] = {"yu", "nancy"};
        String b[] = {"guo", "wang"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "." + b[i]);
        }
        double c[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < c.length; j++) {
            try {
                System.out.print(5 / c[j]);
            } catch (Exception e) {
                System.out.print("111");
            }

        }


    }
}




