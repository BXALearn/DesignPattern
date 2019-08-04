package factory.abstractfactory;

/**
 * Create by 摆欣安
 * 2019/8/4 11:04
 * 品牌工厂-小米
 */
public class XiaoMiFactory implements EFactory
{
    public Phone producePhone()
    {
        return new XiaoMiPhone();
    }

    public Computer produceComputer()
    {
        return new XiaoMiComputer();
    }
}