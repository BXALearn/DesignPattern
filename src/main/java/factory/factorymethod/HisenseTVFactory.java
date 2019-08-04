package factory.factorymethod;

/**
 * Create by 摆欣安
 * 2019/8/4 10:58
 */
public class HisenseTVFactory implements TVFactory{

    public TV produceTV()
    {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}
