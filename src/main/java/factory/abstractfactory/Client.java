package factory.abstractfactory;

/**
 * Create by ������
 * 2019/8/4 11:02
 * ���󹤳��ͻ���
 */
public class Client {

    public static void main(String args[])
    {
        try
        {
            EFactory factory;
            Phone phone;
            Computer computer;
            factory=(EFactory)XMLUtil.getBean();
            phone=factory.producePhone();
            phone.play();
            computer=factory.produceComputer();
            computer.starting();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
