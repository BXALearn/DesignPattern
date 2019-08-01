package singleton.type5;

/**
 * Create by 摆欣安
 * 2019/8/1 21:05
 * 懒汉式(双重检查)
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
