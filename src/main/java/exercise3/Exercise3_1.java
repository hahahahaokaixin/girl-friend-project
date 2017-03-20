package exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyu on 2017/3/20.
 */
public class Exercise3_1 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        Student studenta = new Student();
        studenta.setName("张三");
        studenta.setSex("男");
        studenta.setGrade(96);

        Student studentb = new Student();
        studentb.setName("李四");
        studentb.setSex("男");
        studentb.setGrade(88);

        Student studentc = new Student();
        studentc.setName("王五");
        studentc.setSex("女");
        studentc.setGrade(100);

        Student studentd = new Student();
        studentd.setName("赵六");
        studentd.setSex("女");
        studentd.setGrade(88);

        studentList.add(studenta);
        studentList.add(studentb);
        studentList.add(studentc);
        studentList.add(studentd);

        int sumMale = 0, sumFemale = 0, maleNum = 0, femaleNum = 0;
        for (int i = 0; i < studentList.size(); i++) {
            Student tmpStudent = studentList.get(i);
            if (tmpStudent.getSex().equals("男")) {
                sumMale = sumMale + tmpStudent.getGrade();
                maleNum = maleNum + 1;
            } else {
                sumFemale = sumFemale + tmpStudent.getGrade();
                femaleNum = femaleNum + 1;
            }
        }

        System.out.println("男：" + (sumMale * 1.0 / maleNum));
        System.out.println("女：" + (sumFemale * 1.0 / femaleNum));


    }

}
