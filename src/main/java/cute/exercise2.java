package cute;

/**
 * Created by User on 2017/2/1.
 * 1.����10�Ľ׳ˣ������ֽ�𣩡�
 2.�Զ���һ���������飬�����������ż����
 3.��������һ��һԪ���η��̣������ĸ�����
 */
public class exercise2 {
    public static void main(String args[]) {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

        int[] a = {1, 2, 3, 34, 42, 512, 514, 34, 24, 13, 45, 24};
        int max = a[0];
        if (max % 2 == 0) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            System.out.print(max);
        }
        int aa = 2, bb = 3, cc = -5;
        if (bb * bb - 4 * aa * cc > 0) {
            System.out.print(2);
        }
        else if (bb * bb - 4 * aa * cc == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
