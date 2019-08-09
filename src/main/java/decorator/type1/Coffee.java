package decorator.type1;

/**
 * Create by 摆欣安
 * 2019/8/9 8:30
 * 具体产品-咖啡
 */
public final class Coffee implements Beverage
{
    public Coffee()
    {
        System.out.println("一杯煮好的咖啡");
    }

    public void drink()
    {
        System.out.println("可以慢慢享用");
    }
}
