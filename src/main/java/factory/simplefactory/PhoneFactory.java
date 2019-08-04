package factory.simplefactory;

/**
 * Create by ������
 * 2019/8/4 10:43
 * ��Ʒ����
 */
public class PhoneFactory {

    public static Phone produceTV(String brand) throws Exception
    {
        if(brand.equalsIgnoreCase("HuaWei"))
        {
            System.out.println("�ֻ�����������Ϊ�ֻ���");
            return new HuaWeiPhone();
        }
        else if(brand.equalsIgnoreCase("XiaoMi"))
        {
            System.out.println("�ֻ���������С���ֻ���");
            return new XiaoMiPhone();
        }
        else
        {
            throw new Exception("�Բ����ݲ���������Ʒ���ֻ���");
        }
    }

}
