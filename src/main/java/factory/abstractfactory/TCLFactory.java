package factory.abstractfactory;

/**
 * Create by °ÚÐÀ°²
 * 2019/8/4 11:04
 */
public class TCLFactory implements EFactory
{
    public Television produceTelevision()
    {
        return new TCLTelevision();
    }

    public AirConditioner produceAirConditioner()
    {
        return new TCLAirConditioner();
    }
}