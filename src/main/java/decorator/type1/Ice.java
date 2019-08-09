package decorator.type1;

/**
 * Create by 摆欣安
 * 2019/8/9 8:31
 * 具体的装饰器-加冰
 */
public class Ice extends CondimentDecorator
{
    public Ice(Beverage beverage)
    {
        super(beverage);
        System.out.println("加入少许冰");
    }

    public void mix()
    {
        System.out.println("搅拌倒入的冰");
    }
}
