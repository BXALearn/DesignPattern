package java.singleton.type6;

/**
 * Create by 摆欣安
 * 2019/8/1 21:05
 * 静态内部类
 */
public class Singleton {

    private static volatile Singleton instance;

    //构造器私有化
    private Singleton() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
