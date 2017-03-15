package lesson3;

/**
 * Created by guoyu on 2017/3/15.
 */
public class Cat extends Animal {
    private int age;

    public void runrun() {
        System.out.println("跑得静悄悄");
    }

    public void jump() {
        System.out.println("跳");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
