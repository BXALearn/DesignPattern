package factory.factorymethod;

/**
 * Create by ������
 * 2019/8/4 10:57
 */
public class HuaWeiPhoneFactory implements PhoneFactory {

    public Phone producePhone()
    {
        System.out.println("��Ϊ�ֻ�����������Ϊ�ֻ��С�");
        return new HuaWeiPhone();
    }
}
