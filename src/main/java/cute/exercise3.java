package cute;

/**
 * Created by User on 2017/2/7.
 * 1.��дһ������������nΪż��ʱ����1/2+1/4+1/6+...+1/n,������nΪ����ʱ����
 * 1/1+1/3+1/5+...+1/n��
 * 2.�Զ���һ�����飬�����ԭ���飬�������������У�ÿ������ƽ����
 * 3.ĳ����������λ����������Ҫ������ܣ����ܹ������£�ÿλ���ֶ�����5,
 * Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������ ������ܺ�����ݡ�
 */
public class exercise3 {
    public static void main(String args[]) {
        int a = 26;
        aaa(a);

    }

    public static void aaa(int n) {
        if (n % 2 == 0) {
            double y = 1 / 2 * 1;
            for (int a = 2; a < n / 2; a = a + 2) {
                y = y + 1 / 2 * a;
            }
            System.out.print(y);
        } else {
            double x = 1 / 1 * 1;
            for (int j = 1; j < (n + 1) / 2; j = j + 2) {
                x = x + 1 / j * 1;
            }
            System.out.print(x);
        }
    }
    public static void bbb(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }


    public static void ccc(int a[]) {
        int a[] = bbb();
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
        }
        System.out.print(b);
    }

    public static void ddd(int a) {
        int b, c, d, e;
        int bb, cc, dd, ee;
        bb = b + 5;
        cc = c + 5;
        dd = d + 5;
        ee = e + 5;
        int f = (bb + cc + dd + ee) % 10;
        a = f;


    }


}


