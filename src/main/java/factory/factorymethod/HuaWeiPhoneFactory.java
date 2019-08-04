package factory.factorymethod;

/**
 * Create by 摆欣安
 * 2019/8/4 10:57
 */
public class HuaWeiPhoneFactory implements PhoneFactory {

    public Phone producePhone()
    {
        System.out.println("华为手机工厂生产华为手机中。");
        return new HuaWeiPhone();
    }
}
