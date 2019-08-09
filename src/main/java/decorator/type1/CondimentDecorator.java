package decorator.type1;

/**
 * Create by 摆欣安
 * 2019/8/9 8:31
 * 抽象的装饰器
 */
public class CondimentDecorator implements Beverage
{
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public void drink()
    {
        beverage.drink();
    }
}