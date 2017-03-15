package lesson3;

/**
 * Created by guoyu on 2017/3/13.
 */
public class Student {
    private String name;
    private String sex;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void goHome() {
        if (this.grade >= 60) {
            System.out.println("开心");
        } else {
            System.out.println("被打");
        }
    }
}
