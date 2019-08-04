package factory.factorymethod;

/**
 * Create by °ÚÐÀ°²
 * 2019/8/4 10:56
 */
public class Client {

    public static void main(String args[])
    {
        try
        {
            TV tv;
            TVFactory factory;
            factory=(TVFactory)XMLUtil.getBean();
            tv=factory.produceTV();
            tv.play();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
