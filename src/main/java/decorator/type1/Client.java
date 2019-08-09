package decorator.type1;

/**
 * Create by 摆欣安
 * 2019/8/9 8:29
 * 类型一装饰器模式客户端
 */
public class Client {

    public static void main(String args[])
    {
        Beverage beverage;
        beverage=new Coffee();
        beverage.drink();

        System.out.println("-------以下使用装饰器动态添加------------");
        Milk bumblebee=new Milk(beverage);
        bumblebee.mix();
        bumblebee.drink();

    }

}
