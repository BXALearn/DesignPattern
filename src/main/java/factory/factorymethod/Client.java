package java.factory.factorymethod;

/**
 * Create by ������
 * 2019/8/4 10:56
 * ���������ͻ���
 */
public class Client {

    public static void main(String args[])
    {
        try
        {
            Phone phone;
            PhoneFactory factory;
            factory=(PhoneFactory)XMLUtil.getBean();
            phone=factory.producePhone();
            phone.play();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
