package java.factory.abstractfactory;

/**
 * Create by 摆欣安
 * 2019/8/4 11:03
 * 品牌工厂-华为
 */
public class HuaWeiFactory implements EFactory
{
    public Phone producePhone()
    {
        return new HuaWeiPhone();
    }

    public Computer produceComputer()
    {
        return new HuaWeiComputer();
    }
}