/**
 * Created by User on 2017/2/27.
 * 1.用吐泡泡的方法对任意一个整型数组排序，要求这个方法的返回值为一个数组，并用另一个方法将其输出。
 2.有一个数组里存放了一组学生的成绩，学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示，
 写一个方法输出等级，并把成绩从高到低排序。
 3.有一组学生信息包括姓名，性别，成绩，首先输出每个学生的等级，等级换算公式如上题。
 再计算男女生的平均成绩。例如张三 男 96，李四 女 96，则先输出张三 男 A，李四 女 A。再输出男 96，女96。
 */
public class exercise4 {
    public static void main(String args[]){
        int []a={1,2,3,4,5,56,54,21,34};
        int []d=bbb(a);
        aaa(d);

        int []b={98,33,78};
        int c[]=bbb(b);
        bb(c);
        aaa(c);
    }
    public static int []bbb(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        return a;
    }
    public static void aaa(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static int [] bb(int a[]){
        for (int i=0;i<a.length;i++){
            if (a[i]>=90) {
                System.out.println("A");
            }
            else if (60<=a[i]&&a[i]<89){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
        }
      return a;
    }


}
