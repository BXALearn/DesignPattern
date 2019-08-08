package java.singleton;

import java.singleton.type1.Singleton;
//import java.singleton.type2.Singleton;
//import java.singleton.type3.Singleton;
//import java.singleton.type4.Singleton;
//import java.singleton.type5.Singleton;
//import java.singleton.type6.Singleton;
//import java.singleton.type7.Singleton;

/**
 * Create by 摆欣安
 * 2019/8/1 21:02
 * 单例模式测试类
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton type1instance1 = Singleton.getInstance();
        Singleton type1instance2 = Singleton.getInstance();
        System.out.println(type1instance1 == type1instance2);
        System.out.println("instance.hashCode=" + type1instance1.hashCode());
        System.out.println("instance2.hashCode=" + type1instance2.hashCode());

//        Singleton type7instance1 = Singleton.INSTANCE;
//        Singleton type7instance2 = Singleton.INSTANCE;
//        System.out.println(type7instance1 == type7instance2);
//        System.out.println(type7instance1.hashCode());
//        System.out.println(type7instance2.hashCode());
//        type7instance1.sayOK();
    }

}
