package factory.abstractfactory;

/**
 * Create by ������
 * 2019/8/4 11:03
 * Ʒ�ƹ���-��Ϊ
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