package lesson1;

/**
 * Created by guoyu on 2016/12/26.
 */
public class L1Tmp {
    public static void main(String args[]) {
        /**
         * 字符串
         * */
        String s = "123";
        System.out.println(s.equals("123"));


        /**
         * 数组初始化
         * */
        int[] b = new int[20];
        int c[] = new int[20];
        int[] d = new int[]{1, 2, 3, 4, 5};
        int e[] = new int[]{1, 2, 3, 4, 5};
        int a[] = {3, 6, 5, 10, 25, 7, 9, 8, 1, 16, 15};



        










        /**
         * 循环
         * */
        int count = 0;
        while (count <= 100) {
            count=count+1;
        }
        System.out.println("count:" + count);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}
