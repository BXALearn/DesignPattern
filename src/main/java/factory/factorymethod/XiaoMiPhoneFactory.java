package factory.factorymethod;

/**
 * Create by 摆欣安
 * 2019/8/4 10:58
 */
public class XiaoMiPhoneFactory implements PhoneFactory {

    public Phone producePhone()
    {
        System.out.println("小米手机工厂生产小米手机中。");
        return new XiaoMiPhone();
    }
}
