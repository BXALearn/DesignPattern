package java.singleton.type1;

/**
 * Create by 摆欣安
 * 2019/8/1 21:00
 * 饿汉式(静态变量)
 */
public class Singleton {

    //1. 构造器私有化
    private Singleton() { }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}
