package java.singleton.type2;

/**
 * Create by 摆欣安
 * 2019/8/1 21:05
 * 饿汉式(静态代码块)
 */
public class Singleton {

    // 1.构造器私有化
    private Singleton() { }

    // 2.本类内部创建对象实例
    private  static Singleton instance;

    // 3.在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    // 4.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
