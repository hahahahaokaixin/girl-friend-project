package lesson3;

/**
 * Created by guoyu on 2017/3/15.
 */
public class Animal {
    private String name;

    public void eat() {
        System.out.println("吃");
    }

    public void runrun() {
        System.out.println("跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
