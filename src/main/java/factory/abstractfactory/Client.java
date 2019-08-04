package factory.abstractfactory;

/**
 * Create by °ÚÐÀ°²
 * 2019/8/4 11:02
 */
public class Client {

    public static void main(String args[])
    {
        try
        {
            EFactory factory;
            Television tv;
            AirConditioner ac;
            factory=(EFactory)XMLUtil.getBean();
            tv=factory.produceTelevision();
            tv.play();
            ac=factory.produceAirConditioner();
            ac.changeTemperature();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
