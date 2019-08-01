package singleton.type4;

/**
 * Create by 摆欣安
 * 2019/8/1 21:05
 * 懒汉式-线程安全
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
