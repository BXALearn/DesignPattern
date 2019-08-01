package singleton.type3;

/**
 * Create by 摆欣安
 * 2019/8/1 21:05
 * 懒汉式-线程不安全
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
