package factory.factorymethod;

/**
 * Create by 摆欣安
 * 2019/8/4 10:57
 */
public class HaierTVFactory implements TVFactory{

    public TV produceTV()
    {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
