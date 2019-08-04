package factory.abstractfactory;

/**
 * Create by ������
 * 2019/8/4 11:04
 * Ʒ�ƹ���-С��
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