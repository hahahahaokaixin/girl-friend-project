package cute;

/**
 * Created by User on 2017/1/26.
 * 1.��һ��������y=x?+2(x+1)+3�����㵱x=3ʱy��ֵ��
 * 2.�������ַ������飬��һ������yu��nancy���ڶ�������guo��wang��ͨ���������������yu.guo��nancy.wang��
 * 3.��һ�����飬����5��������������ÿһ����֮���ֵ��
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




