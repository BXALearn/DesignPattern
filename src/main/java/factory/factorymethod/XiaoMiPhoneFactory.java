package factory.factorymethod;

/**
 * Create by ������
 * 2019/8/4 10:58
 */
public class XiaoMiPhoneFactory implements PhoneFactory {

    public Phone producePhone()
    {
        System.out.println("С���ֻ���������С���ֻ��С�");
        return new XiaoMiPhone();
    }
}
