package lesson1;

/**
 * Created by guoyu on 2016/12/26.
 */
public class LeapYear {
    public static void main(String args[]) {
        int year = 2000;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
