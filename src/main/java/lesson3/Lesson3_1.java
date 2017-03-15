package lesson3;

/**
 * Created by guoyu on 2017/3/13.
 */
public class Lesson3_1 {
    public static void main(String[] args) {
        Dog littleDog = new Dog();
        littleDog.runrun();
        int age = littleDog.getAge();
        System.out.println(age + 1);

        littleDog.setAge(3);
        System.out.println(littleDog.getAge());

        Dog bigDog = new Dog();
        bigDog.setAge(8);
        System.out.println(bigDog.getAge());

        Student studentA = new Student();
        studentA.setName("傻逼");
        studentA.setSex("男");
        studentA.setGrade(55);
        System.out.println(studentA.getGrade());
        System.out.println(studentA.getName());
        System.out.println(studentA.getSex());
        studentA.goHome();

    }
}
