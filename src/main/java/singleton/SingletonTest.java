package singleton;

import singleton.type7.Singleton;

/**
 * Create by 摆欣安
 * 2019/8/1 21:02
 * 单例模式测试类
 */
public class SingletonTest {

    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2);
//        System.out.println("instance.hashCode=" + instance.hashCode());
//        System.out.println("instance2.hashCode=" + instance2.hashCode());

        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();
    }

}
