package lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guoyu on 2017/3/15.
 */
public class Lesson3_2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //继承自父类
        cat.eat();
        //重写父类方法
        cat.runrun();
        //自有方法
        cat.jump();

        List<Cat> catList = new ArrayList<Cat>();
        List<Dog> dogList = new LinkedList<Dog>();

        for (int i = 0; i < 6; i++) {
            Cat cat1 = new Cat();
            cat1.setName(i + "");
            cat1.setAge(i);

            catList.add(cat1);
        }

        for (int i = 0; i < catList.size(); i++) {
            Cat aCatInList = catList.get(i);

            System.out.println(aCatInList.getName());
            System.out.println(aCatInList.getAge());
            aCatInList.jump();
            System.out.println("#######################");

        }

        System.out.println("=====================");
        for (int i = 0; i < 2; i++) {
            catList.remove(i);
        }

        for (int i = 0; i < catList.size(); i++) {
            Cat aCatInList = catList.get(i);

            System.out.println(aCatInList.getName());
            System.out.println(aCatInList.getAge());
            aCatInList.jump();
            System.out.println("#######################");

        }


    }
}
