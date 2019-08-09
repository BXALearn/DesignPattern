package decorator.type1;

/**
 * Create by 摆欣安
 * 2019/8/9 8:30
 * 具体的装饰器-加牛奶
 */
public class Milk extends CondimentDecorator
{
    public Milk(Beverage beverage)
    {
        super(beverage);
        System.out.println("加入少许牛奶");
    }

    public void mix()
    {
        System.out.println("搅拌倒入的牛奶");
    }
}
