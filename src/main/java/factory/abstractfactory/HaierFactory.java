package factory.abstractfactory;

/**
 * Create by °ÚÐÀ°²
 * 2019/8/4 11:03
 */
public class HaierFactory implements EFactory
{
    public Television produceTelevision()
    {
        return new HaierTelevision();
    }

    public AirConditioner produceAirConditioner()
    {
        return new HairAirConditioner();
    }
}